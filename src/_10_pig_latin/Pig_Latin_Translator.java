package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig_Latin_Translator implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton translate = new JButton("translate");
	JTextField text = new JTextField();
	public void run() {
		translate.addActionListener(this);
		frame.add(panel);
		panel.add(text);
		panel.add(translate);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		
		if (buttonClicked == translate) {
			
		}
		
	}
}
