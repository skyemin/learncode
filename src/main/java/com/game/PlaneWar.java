package com.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PlaneWar extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 700;
    private static final int PLAYER_SPEED = 5;
    private static final int ENEMY_SPEED = 2;
    private static final int BULLET_SPEED = 10;
    
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<Bullet> bullets;
    private boolean isRunning;
    private int score;
    private Random random;
    
    private Timer gameTimer;
    private Timer enemySpawnTimer;
    
    public PlaneWar() {
        setTitle("飞机大战");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        player = new Player(WIDTH / 2 - 25, HEIGHT - 100, 50, 50);
        enemies = new ArrayList<>();
        bullets = new ArrayList<>();
        isRunning = true;
        score = 0;
        random = new Random();
        
        setupKeyListeners();
        setupTimers();
        
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        
        setVisible(true);
    }
    
    private void setupKeyListeners() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_LEFT:
                        player.setMovingLeft(true);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setMovingRight(true);
                        break;
                    case KeyEvent.VK_UP:
                        player.setMovingUp(true);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setMovingDown(true);
                        break;
                    case KeyEvent.VK_SPACE:
                        fireBullet();
                        break;
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_LEFT:
                        player.setMovingLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setMovingRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        player.setMovingUp(false);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setMovingDown(false);
                        break;
                }
            }
        });
    }
    
    private void setupTimers() {
        // Game update timer - 20ms (approx 50 FPS)
        gameTimer = new Timer(20, e -> {
            updateGame();
            repaint();
        });
        gameTimer.start();
        
        // Enemy spawn timer - every 1.5 seconds
        enemySpawnTimer = new Timer(1500, e -> {
            spawnEnemy();
        });
        enemySpawnTimer.start();
    }
    
    private void updateGame() {
        if (!isRunning) return;
        
        // Update player
        player.move(0, 0, WIDTH, HEIGHT);
        
        // Update enemies
        for (Enemy enemy : enemies) {
            enemy.move();
        }
        
        // Update bullets
        Iterator<Bullet> bulletIterator = bullets.iterator();
        while (bulletIterator.hasNext()) {
            Bullet bullet = bulletIterator.next();
            bullet.move();
            
            // Remove bullets that go off-screen
            if (bullet.getY() < 0) {
                bulletIterator.remove();
                continue;
            }
            
            // Check for collisions with enemies
            Iterator<Enemy> enemyIterator = enemies.iterator();
            while (enemyIterator.hasNext()) {
                Enemy enemy = enemyIterator.next();
                if (bullet.intersects(enemy)) {
                    enemyIterator.remove();
                    bulletIterator.remove();
                    score += 10;
                    break;
                }
            }
        }
        
        // Check if enemies have gone off-screen
        Iterator<Enemy> enemyIterator = enemies.iterator();
        while (enemyIterator.hasNext()) {
            Enemy enemy = enemyIterator.next();
            if (enemy.getY() > HEIGHT) {
                enemyIterator.remove();
                continue;
            }
            
            // Check for collision with player
            if (player.intersects(enemy)) {
                gameOver();
                break;
            }
        }
    }
    
    private void fireBullet() {
        if (!isRunning) return;
        
        int bulletX = player.getX() + player.getWidth() / 2 - 5; // Center of player
        int bulletY = player.getY() - 10; // Just above player
        bullets.add(new Bullet(bulletX, bulletY, 10, 20));
    }
    
    private void spawnEnemy() {
        if (!isRunning) return;
        
        int enemyX = random.nextInt(WIDTH - 40); // Random X position
        int enemyY = -50; // Start above the screen
        enemies.add(new Enemy(enemyX, enemyY, 40, 40));
    }
    
    private void gameOver() {
        isRunning = false;
        gameTimer.stop();
        enemySpawnTimer.stop();
        JOptionPane.showMessageDialog(this, "游戏结束! 你的得分: " + score, "游戏结束", JOptionPane.INFORMATION_MESSAGE);
        int option = JOptionPane.showConfirmDialog(this, "再玩一次?", "游戏结束", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            System.exit(0);
        }
    }
    
    private void resetGame() {
        player = new Player(WIDTH / 2 - 25, HEIGHT - 100, 50, 50);
        enemies.clear();
        bullets.clear();
        score = 0;
        isRunning = true;
        gameTimer.start();
        enemySpawnTimer.start();
    }
    
    // Game panel for rendering
    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Draw background
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
            
            // Draw player
            g.setColor(Color.BLUE);
            player.draw(g);
            
            // Draw enemies
            g.setColor(Color.RED);
            for (Enemy enemy : enemies) {
                enemy.draw(g);
            }
            
            // Draw bullets
            g.setColor(Color.YELLOW);
            for (Bullet bullet : bullets) {
                bullet.draw(g);
            }
            
            // Draw score
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("得分: " + score, 20, 30);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlaneWar());
    }
}