
import javax.swing.*;
import javax.tools.DocumentationTool.Location;
import javax.xml.namespace.QName;

import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Pacman extends JFrame {

    public Pacman() {  
          
        initUI();      
    }

    private void initUI() { 
        
        add(new Board());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(460,560);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
   
    }     
}
 
