package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latest_Tweet implements ActionListener {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField text= new JTextField();
	JButton search= new JButton();
	public void run(){
		search.addActionListener(this);
		frame.add(panel);
		panel.add(text);
		panel.add(search);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonClicked= (JButton) e.getSource();	
	
	if (buttonClicked==search) {
		System.out.println("TWEET TWEEt");
	}
	}
}
