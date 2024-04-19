package edu.guilford;

import java.awt.*;
import javax.swing.JPanel;
import edu.Paddles;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GameCompts extends JPanel {
    //attributes
    private Ball gameBall;
    private Paddles leftPaddle;
    private Paddles rightPaddle;
    private int userScore;
    private int pcScore;
    private int userMouseC;
    private int bounces;

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

        //update score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));
        //the drawString method needs a String to print, and a location to print it
        g.drawString("\n"+ userScore , (WINDOW_WIDTH/2)-110, 50);
        g.drawString("\n"+ pcScore , (WINDOW_WIDTH/2)+5, 50);

        g.setColor(Color.WHITE);
        g.drawLine(335, 0, 335, WINDOW_HEIGHT);

    }

    public GameCompts() {
        //ball specs goes here 
        gameBall = new Ball(350, 250, 4, 4, 4, new Color(255, 175, 175), 14);
        //paddle specs here
        leftPaddle = new Paddles(10, 200, 150, 16, new Color(128, 185, 175));
        rightPaddle = new Paddles(610, 200, 140, 13, new Color(175, 175, 250));

        userMouseC = 0;
        //number of bounces start at 0
        // used for difficulty
        bounces = 0;

        //initial score count
        userScore = 0;
        pcScore = 0;

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

        //collision method
        if(leftPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
        bounces++;
        } 
        if(rightPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
        bounces++;
        }

        //increase  bounce speed for difficulty increase
        // after 2 bounces
        if (bounces == 2) {
            // reset count
            bounces = 0;
            // increase speed here
            gameBall.increaseSpeed();
        }

        // check if someone lost
        if (gameBall.getX() < 0) {
            // player has lost
            pcScore++;
        gameReset();
        } else if (gameBall.getX() > WINDOW_WIDTH) {
            // pc has lost
            userScore++;
        gameReset();
        }

    }

    public void gameReset() {
        // pauses game for a second after round ends
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //reset game after either player looses/wins
        // and start a new round
        gameBall.setX(300);
        gameBall.setY(200);
        gameBall.setCx(3);
        gameBall.setCy(3);
        gameBall.setSpeed(4);
        bounces = 0;
    }

    public class MouseMotionHelper extends JPanel implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent arg0) {

        }

        // user can move paddle
        public void mouseMoved(MouseEvent arg0) {
            // tell the user's paddle to move towards the y location
            userMouseC = arg0.getY();
       }
    
    }
}
