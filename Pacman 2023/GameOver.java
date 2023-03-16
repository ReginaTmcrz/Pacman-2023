import javax.swing.JFrame;
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GameOver extends JFrame {
    

        GameOver(){

        super("Game Over");
        setDefaultCloseOperation(GameOver.EXIT_ON_CLOSE);
        setSize(480, 540);
        setResizable(false);
        getContentPane().setBackground(new Color(8, 15, 61));
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);

        //Images and gifs
        ImageIcon gameOver = new ImageIcon("GameOver.gif");
        ImageIcon playAgainbg = new ImageIcon("PlayAgain.png");
        ImageIcon backToHome = new ImageIcon("BackToHome.png");
        
        //Game Over Background
        JLabel label = new JLabel();
        label.setIcon(gameOver);
        
        //Play Again Button Properties
        JButton playAgain = new JButton();
        playAgain.setIcon(playAgainbg);
        EventHandler handler = new EventHandler();
        playAgain.addActionListener(handler);
        playAgain.setBorder(BorderFactory.createEmptyBorder());
        
        //Exit Button Properties
        JButton exitBtn = new JButton();
        exitBtn.setIcon(backToHome);
        exitBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler1 handler1 = new EventHandler1();
        exitBtn.addActionListener(handler1);
        
        this.add(label);
        this.add(playAgain);
        this.add(exitBtn);
           
    }

    private class EventHandler implements ActionListener{
     
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Play Again Button
            new Difficulty();
            dispose();   
           
        }
    }
    
    private class EventHandler1 implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {
         
            //Exit Button
            new Welcome();
            dispose();   
           
        }
    }

}
