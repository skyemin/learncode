package com.game;

import java.awt.*;

public class Player {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean movingLeft;
    private boolean movingRight;
    private boolean movingUp;
    private boolean movingDown;
    private static final int SPEED = 5;
    
    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.movingLeft = false;
        this.movingRight = false;
        this.movingUp = false;
        this.movingDown = false;
    }
    
    public void move(int minX, int minY, int maxX, int maxY) {
        if (movingLeft && x > minX) {
            x -= SPEED;
        }
        if (movingRight && x < maxX - width) {
            x += SPEED;
        }
        if (movingUp && y > minY) {
            y -= SPEED;
        }
        if (movingDown && y < maxY - height) {
            y += SPEED;
        }
    }
    
    public void draw(Graphics g) {
        // Draw player ship
        g.fillRect(x, y, width, height);
        
        // Draw cockpit
        g.setColor(Color.CYAN);
        g.fillRect(x + width/4, y, width/2, height/3);
    }
    
    public boolean intersects(Enemy enemy) {
        Rectangle playerRect = new Rectangle(x, y, width, height);
        Rectangle enemyRect = new Rectangle(enemy.getX(), enemy.getY(), enemy.getWidth(), enemy.getHeight());
        return playerRect.intersects(enemyRect);
    }
    
    // Getters and setters
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
    
    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }
    
    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }
    
    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }
    
    public void setMovingDown(boolean movingDown) {
        this.movingDown = movingDown;
    }
}