package edu.guilford;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Home {
    public static void main(String[] args){
        //Window created
        JFrame gameWindow = new JFrame("2D Ping-Pong Game");
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //size of window is 700x600
        gameWindow.setSize(700,600);
    
        //Instantiate new game
        GameCompts game = new GameCompts();
        //Add game to JFrame
        gameWindow.add(game);
    
        gameWindow.setVisible(true);
           
        }
    }