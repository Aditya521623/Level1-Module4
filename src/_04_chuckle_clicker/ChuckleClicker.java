package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke= new JButton("joke");
	JButton punchline= new JButton("punchline");
	
	public void makeButtons() {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
frame.setVisible(true);
frame.add(panel);
panel.add(joke);
panel.add(punchline);
joke.addActionListener(this);
frame.pack();

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonPressed= (JButton) e.getSource();
		if (buttonPressed==joke) {
			JOptionPane.showMessageDialog(null, "joke");
			
		}
		else if(buttonPressed==punchline) {
			JOptionPane.showMessageDialog(null, "punchline");
		}
	}

}
