package edu;

import java.awt.*;

import edu.guilford.Ball;

public class Paddles {
    private int height;
    private int x;
    private int y;
    private int speed;
    private Color color;

    //constant
    static final int PADDLE_WIDTH = 16;

    public Paddles(int x, int y, int height, int speed, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
        this.color = color;
    }

    public void paint(Graphics g){
        //draws the rectangle of the paddle
        g.setColor(color);
        g.drawRect(x, y, PADDLE_WIDTH, height);
    
    }

    public void moveTowards(int moveToY) {
        //to find the location of the center of the paddle
        int centerOfPaddle = y + height / 2;

        //determine if we need to move more than the speed away from where we are now
        if(Math.abs(centerOfPaddle - moveToY) > speed){
        //if the center of the paddle is too far down
        if (centerOfPaddle > moveToY) {
            // move the paddle up by the speed
            y -= speed;
        }
        // if the center of the paddle is too far up
        if (centerOfPaddle < moveToY) {
            // move the paddle down by the speed
            y += speed;
        }
        }
    }

    public boolean checkCollision(Ball o){
        int rightX = x + PADDLE_WIDTH;
        int bottomY = y + height;
    
        //check if the Ball is between the x values
        if(o.getX() > (x - o.getSize()) && o.getX() < rightX){
        //check if Ball is between the y values
        if (o.getY() > y && o.getY() < bottomY) {
            //if we get here, we know the ball and the paddle have collided
            return true;
        }
    }
        
        //if we get here, one of the checks failed, and the ball has not collided
        return false;
    }
}