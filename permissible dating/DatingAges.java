package swag;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Write a description of class DatingAges here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatingAges extends JFrame
{
    public DatingAges(String label, String label2)
    {
        setLayout(new FlowLayout());
        
        JLabel l = new JLabel();
        l.setSize(20, 20);
        l.setText(label);
        
        add(l);
        
        JLabel s = new JLabel();
        s.setSize(20, 20);
        s.setText(label2);
        
        add(s);
        
    }
}