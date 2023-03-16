import java.awt.Color;

public class App { 
    public static void main (String[] args) {

        Home main = new Home();    
 
        main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
        main.setSize(480,540);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        main.getContentPane().setBackground(new Color(8, 15, 61));
        
        }
    }
    
    
