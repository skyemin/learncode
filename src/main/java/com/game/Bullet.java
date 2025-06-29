package com.game;

import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private int width;
    private int height;
    private static final int SPEED = 10;
    
    public Bullet(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void move() {
        // Bullets move upward
        y -= SPEED;
    }
    
    public void draw(Graphics g) {
        // Draw bullet
        g.fillRect(x, y, width, height);
    }
    
    public boolean intersects(Enemy enemy) {
        Rectangle bulletRect = new Rectangle(x, y, width, height);
        Rectangle enemyRect = new Rectangle(enemy.getX(), enemy.getY(), enemy.getWidth(), enemy.getHeight());
        return bulletRect.intersects(enemyRect);
    }
    
    // Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
}