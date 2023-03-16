import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Home extends JFrame {

    Home() {
        super("Home Page");
        this.setLayout(new FlowLayout());

        //Images and Gifs
        ImageIcon pacmanIcon = new ImageIcon("HomePage.gif");
        ImageIcon starbtn = new ImageIcon("StartGame.png");

        //Home Page Background 
        JLabel label = new JLabel();
        label.setIcon(pacmanIcon);

        //Start Game Button Properties
        JButton startButton = new JButton();
        startButton.setBorder(BorderFactory.createEmptyBorder());
        startButton.setIcon(starbtn);
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.add(label);
        this.add(startButton);

    }

    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
        
        // To open new frame (welcome page)    
        new Welcome();
        dispose();

        }
    }
}