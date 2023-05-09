package main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class GameWindow {
    private JFrame jFrame;
    private GamePanel gamePanel;

    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();


        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.addWindowFocusListener(new WindowFocusListener() {


            public void windowLostFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();
            }

            public void windowGainedFocus(WindowEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }
}


