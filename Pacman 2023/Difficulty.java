import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.security.cert.LDAPCertStoreParameters;
import java.awt.event.ActionEvent;
import java.awt.*;


public class Difficulty extends JFrame  {

    Difficulty(){

        super("Difficulty");     
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(465,534);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(8, 15, 61));
        
        // Difficulty Backgorund
        ImageIcon selectDiffcultyBg = new ImageIcon("SelectDifficulty.gif");
        JLabel label = new JLabel();
        label.setIcon(selectDiffcultyBg);
         
        //Images and Gifs
        ImageIcon easyBtnIcon = new ImageIcon("easy.png");
        ImageIcon medBtnIcon = new ImageIcon("medium.png");
        ImageIcon hardBtnIcon = new ImageIcon("hard.png");
        ImageIcon backBtnIcon = new ImageIcon("back.png");
       
        //Easy Button Properties
        JButton easyButton = new JButton();
        easyButton.setIcon(easyBtnIcon);
        easyButton.setBorder(BorderFactory.createEmptyBorder());
        EventHandler easyHandler = new EventHandler(9, 6);
        easyButton.addActionListener(easyHandler);

        //Medium Button Properties
        JButton mediumButton = new JButton();
        mediumButton.setIcon(medBtnIcon);
        mediumButton.setBorder(BorderFactory.createEmptyBorder());
        EventHandler mediumHandler = new EventHandler(6, 9);
        mediumButton.addActionListener(mediumHandler);

        //Hard Button Properties
        JButton hardButton = new JButton();
        hardButton.setIcon(hardBtnIcon);
        hardButton.setBorder(BorderFactory.createEmptyBorder());
        EventHandler hardHandler = new EventHandler(3, 12);
        hardButton.addActionListener(hardHandler);

        //Back Button Properties
        JButton backBtn = new JButton();
        backBtn.setIcon(backBtnIcon);
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler1 backHandler = new EventHandler1();
        backBtn.addActionListener(backHandler);
                   
        add(label);
        add(easyButton);
        add(mediumButton);
        add(hardButton);
        add(backBtn);

    }

    // Pacman lives and ghost changes
    private class EventHandler implements ActionListener {
            int lives;
            int ghost;

        EventHandler(int livesLeft, int numOfGhost) {      
            this.lives = livesLeft;
            this.ghost = numOfGhost;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Board board = new Board();
            board.pacsLeft = this.lives;
            board.N_GHOSTS = this.ghost;

            new MazeColor();
            dispose();
        }
    }

    // To open new frame (welcome page)
    private class EventHandler1 implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {
       
            new Welcome();
            dispose();   
           
        }
    }  
}