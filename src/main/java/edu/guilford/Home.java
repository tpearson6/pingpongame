package edu.guilford;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home {
    public static void main(String[] args){
        //window created
        JFrame gameWindow = new JFrame("2D Ping-Pong Game");
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //size of window screen is 650x520
        gameWindow.setSize(650,520);
    
        //instantiate new game
        GameCompts game = new GameCompts();
        //add game to JFrame
        gameWindow.add(game);

        //make window visible
        gameWindow.setVisible(true);

        Timer timer = new Timer(33, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call game logic method
                //method is called before repainting screen so the balls position gets updated and then the screen is repainted
                game.gameLogic(); 

                // whatever the timer does every repeat goes here
                // now repaints the screen
                game.repaint();

            }
        });

        // start the timer
        timer.start();

        }
    }