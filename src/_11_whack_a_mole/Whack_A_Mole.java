package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Whack_A_Mole implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel=new JPanel();
	Random rand= new Random();

	public void run() {
	
		frame.setSize(300,800);
		frame.setVisible(true);
		frame.add(panel);
		
		int randNumber= rand.nextInt(24);
		drawButtons(randNumber);
		frame.setSize(400,800);
		
		
		
			
		
	
		
	
	}
	public void drawButtons(int randNum) {
		for(int i=0; i<24; i++) {
			if (i==randNum) {
				JButton mole= new JButton("MOLE!!");
				mole.addActionListener(this);
				panel.add(mole);
				
			}
			else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
				
				
			}
			
			
		}
		
		
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonClicked = (JButton) e.getSource();
	String txt= buttonClicked.getText();
	if(!txt.equals("MOLE!!")) {
		speak("Incorrect");
		frame.dispose();
		frame=new JFrame();
		frame.setVisible(true);
		panel=new JPanel();
		frame.add(panel);
		frame.setSize(400,800);
		int randNumber= rand.nextInt(24);
		drawButtons(randNumber);
		
	}
	
	
		
	}

}
