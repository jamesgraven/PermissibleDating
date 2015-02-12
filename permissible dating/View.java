
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class View extends JFrame implements ActionListener
{

    JLabel info;
    JTextField input;
    JButton go;
    
    public View()
    {
        setLayout(new FlowLayout());
        
        info = new JLabel("Enter your age here...");
        info.setSize(20, 20);
        add(info);
        
        input = new JTextField(20);
        input.setEditable(true);
        add(input);
        
        go = new JButton("Find matches");
        go.setSize(20, 20);
        go.addActionListener(this);
        add(go);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object cause = e.getSource();
        
        if(cause==go)
        {
           double f = Double.parseDouble(input.getText());
       
           int foo = (int) Math.floor(f);
           
           if(model.getHighest(foo)==0||model.getHighest(foo)==0)
           {
        	   
        	  DatingAges gui = new DatingAges("Sorry, but "+foo+" is too young to date.", "");
        	  gui.setSize(300, 200);
        	  gui.setDefaultCloseOperation(1);
           	  gui.setVisible(true);
           }
           else
           {
        	   String g = "The highest age you can date is "+ model.getHighest( foo) ;
        	   String h = "The lowest age you can date is " + model.getLowest( foo);
            
            	DatingAges gui = new DatingAges(g, h);
            	gui.setSize(300, 200);
            	gui.setDefaultCloseOperation(1);
            	gui.setVisible(true);
           }
            
        }
    }
    
}
