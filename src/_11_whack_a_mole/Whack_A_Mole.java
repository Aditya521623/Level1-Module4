package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_A_Mole implements ActionListener {
	Date start = new Date();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	int hits = 0;
	public void run() {

		frame.setSize(300, 800);
		frame.setVisible(true);
		frame.add(panel);

		int randNumber = rand.nextInt(24);
		drawButtons(randNumber);
		frame.setSize(400, 800);

	}

	public void drawButtons(int randNum) {
		for (int i = 0; i < 24; i++) {
			if (i == randNum) {
				JButton mole = new JButton("MOLE!!");
				mole.addActionListener(this);
				panel.add(mole);

			} else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);

			}

		}

	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		String txt = buttonClicked.getText();
				
			if (!txt.equals("MOLE!!")) {
				speak("Incorrect");
				frame.dispose();
				frame = new JFrame();
				frame.setVisible(true);
				panel = new JPanel();
				frame.add(panel);
				frame.setSize(400, 800);
				int randNumber = rand.nextInt(24);
				drawButtons(randNumber);

			} else {
				frame.dispose();
				frame = new JFrame();
				frame.setVisible(true);
				panel = new JPanel();
				frame.add(panel);
				frame.setSize(400, 800);
				int randNumber = rand.nextInt(24);
				drawButtons(randNumber);
				hits += 1;
			}

		
		if (hits == 10) {
			endGame(start, 10);

		}
	}

}
