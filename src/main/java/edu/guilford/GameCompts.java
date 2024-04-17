package edu.guilford;

import java.awt.*;
import javax.swing.JPanel;
import edu.Paddles;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GameCompts extends JPanel {
    //brings the ball to this class
    private Ball gameBall;
    private Paddles leftPaddle;
    private Paddles rightPaddle;
    private int userMouseC;

    //size of the game
    static final int WINDOW_WIDTH = 700, WINDOW_HEIGHT = 500;

    public void paintComponent(Graphics g){
        //method will draw background & update/draw objects on screen
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        //draw game ball
        gameBall.paint(g);

        //draw paddles 
        leftPaddle.paint(g);
        rightPaddle.paint(g);

    }

    public GameCompts() {
        //ball specs goes here 
        gameBall = new Ball(350, 250, 4, 4, 4, new Color(255, 175, 175), 14);
        //paddle specs here
        leftPaddle = new Paddles(10, 200, 150, 10, new Color(128, 185, 175));
        rightPaddle = new Paddles(610, 200, 150, 10, new Color(175, 175, 250));

        userMouseC = 0;

        //listen for motion events on this object
        addMouseMotionListener(new MouseMotionHelper());
            

    }

    // Called once per frame to handle essential game operations
    public void gameLogic() {
        //corner check/bounce
        gameBall.bounceOffCorner(0, WINDOW_HEIGHT);

        //move the ball one frame
        gameBall.moveBall();

        //paddle move towards where the users mouse is
        leftPaddle.moveTowards(userMouseC);
        //allows pc paddle to move with Y cordinate of ball
        rightPaddle.moveTowards(gameBall.getY());

        //if(leftPaddle.checkCollision(gameBall)) {
            //gameBall.reverseX();
        //} 
        //if(rightPaddle.checkCollision(gameBall)) {
            //gameBall.reverseX();
        //}

    }

    public class MouseMotionHelper extends JPanel implements MouseMotionListener {
        //to move paddles
        @Override
        public void mouseDragged(MouseEvent arg0) {
            
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            //tell the user's paddle to move towards the y location
            userMouseC =  arg0.getY();
        }

    }

    

}
