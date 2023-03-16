
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MazeColor extends JFrame{

    public static Color GREEN;
	public static Color RED;
	public static Color BLUE;

    MazeColor (){
        super("Maze Color");
        this.setDefaultCloseOperation(MazeColor.EXIT_ON_CLOSE);
        this.setSize(470, 530);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(8,15,61));
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        //Images, Gifs
        ImageIcon mazeColorBg = new ImageIcon("MazeColor2.gif");
        ImageIcon redBtnBg = new ImageIcon("red.png");
        ImageIcon greenBtnBg = new ImageIcon("green.png");
        ImageIcon blueBtnBg = new ImageIcon("blue.png");
        ImageIcon backBtnIcon = new ImageIcon("back.png");

        //Maze Color Backgroudnd
        JLabel label = new JLabel();
        label.setIcon(mazeColorBg);

        //Red Button Properties
        JButton redBtn = new JButton();
        redBtn.setIcon(redBtnBg);
        redBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler redHandler = new EventHandler(Color.RED);
        redBtn.addActionListener(redHandler);

        // Green Button Properties
        JButton greenBtn = new JButton();
        greenBtn.setIcon(greenBtnBg);
        greenBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler greenHandler = new EventHandler(Color.GREEN);
        greenBtn.addActionListener(greenHandler);

        // Blue Button Properties
        JButton blueBtn = new JButton();
        blueBtn.setIcon(blueBtnBg);
        blueBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler blueHandler = new EventHandler(Color.BLUE);
        blueBtn.addActionListener(blueHandler);
       
        // Back Button Properties
        JButton backBtn = new JButton();
        backBtn.setIcon(backBtnIcon);
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        EventHandler1 backHandler = new EventHandler1();
        backBtn.addActionListener(backHandler);
            
        add(label);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);
        add(backBtn);

    }
   
    // For maze color changes
    private class EventHandler implements ActionListener {
        Color colors;
      
        public EventHandler(Color colorOfMaze) {
         this.colors = colorOfMaze; 

        }

        public void actionPerformed(ActionEvent event) {

            Board board = new Board(); 
            board.mazeColor = this.colors;
                      
            new Pacman();
            dispose();
            
        }
    }

    // For back button
    private class EventHandler1 implements ActionListener{      
        public void actionPerformed(ActionEvent event) {
            new Difficulty(); 
            dispose();

        }
    }       
}


       
                
        
    

