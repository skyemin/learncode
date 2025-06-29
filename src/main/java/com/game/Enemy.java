package com.game;

import java.awt.*;

public class Enemy {
    private int x;
    private int y;
    private int width;
    private int height;
    private static final int SPEED = 2;
    
    public Enemy(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void move() {
        // Enemies move downward
        y += SPEED;
    }
    
    public void draw(Graphics g) {
        // Draw enemy ship
        g.fillRect(x, y, width, height);
        
        // Draw details
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 5, y + height - 10, width - 10, 5);
        g.fillRect(x + width/3, y, width/3, height/2);
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