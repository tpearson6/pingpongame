package edu.guilford;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    //declare instance variables
    private int x;
    private int y;
    private int cx;
    private int cy;
    private int speed;
    private int size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size) {
        //ball constructor assigns values to instance variables
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public void paint(Graphics g){
        //sets brush color to the ball color
        g.setColor(color);
    
        //paint the ball at x, y with a width and height of the ball size
        g.drawOval(x, y, size, size);
    
    }

    public void moveBall(){
        //method change balls x and y position by one frame
        //cx is added to x
        x += cx;
        //cy is added to y
        y += cy;
    }

    public void bounceOffCorner(int top, int bottom){
        // if the y value is at the bottom of the screen
        if (y > bottom - size) {
            reverseY();
        }
        // if y value is at top of screen
        else if (y < top) {
            reverseY();
        }

        // if x value is at left or right side
        if (x < 0) {
            reverseX();
        } else if (x > 640 - size) {
            reverseX();
        }

    }

    public void reverseX() {
        // Reverse's the ball's change in x
        cx *= -1;
    }

    public void reverseY() {
        // Reverse's the ball's change in y
        cy *= -1;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        //method used for collision with paddles
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

}


