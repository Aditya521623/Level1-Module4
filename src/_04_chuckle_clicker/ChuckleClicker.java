package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	
	public void makeButtons() {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
JButton joke= new JButton("joke");
JButton punchline= new JButton("punchline");
frame.setVisible(true);
frame.add(panel);
panel.add(joke);
panel.add(punchline);
frame.pack();
		
	}

}
