package edu.guilford;

import java.awt.*;

public class GameCompts {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 540;
    
    //Graphics method for drawing objects
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

    }

}
