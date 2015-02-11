
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
			String age = input.getText();
			
			
		}
	}
	
}
