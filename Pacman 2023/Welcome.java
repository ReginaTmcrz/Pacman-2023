import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.time.chrono.ThaiBuddhistChronology;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.*;


public class Welcome extends JFrame implements ActionListener{
   
    Board board = new Board();
    JButton nextBtn = new JButton();
    JTextField username = new JTextField();

   
    Welcome(){

        super("Welcome");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(465,534);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(8, 15, 61));

        //Images and Gifs
        ImageIcon  welcomeBG = new ImageIcon("WelcomeBG.gif");
        ImageIcon  continueBtn = new ImageIcon("continue.png");

        // Welcome Page Background
        JLabel welcomePage = new JLabel();
        welcomePage.setIcon(welcomeBG);

        //Username Textfield
        username.setPreferredSize(new Dimension(300,40));

        // Next Button Properties
        nextBtn.setFont(new Font("Serif Bold", Font.BOLD,20));
        nextBtn.setIcon(continueBtn);
        nextBtn.setBorder(BorderFactory.createEmptyBorder());
        nextBtn.setContentAreaFilled(false);
        EventHandler handler = new EventHandler();
        nextBtn.addActionListener(handler);

        this.add(welcomePage);
        this.add(username);
        this.add(nextBtn);

    }

    // For Username Input
    private class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (username.getText().length() <= 0) {
            
            JOptionPane.showMessageDialog(null, "you must enter a username");

            }else{

               board.playerName = username.getText();
                new Difficulty();
                dispose();  

            }
    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException();
    }

    
}
