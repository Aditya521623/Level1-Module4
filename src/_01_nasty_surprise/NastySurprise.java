package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Trick");
	JButton button2 = new JButton("Treat");

	public void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton buttonClicked = (JButton) e.getSource();

		if (buttonClicked == button) {
			showPictureFromTheInternet(
					"https://hips.hearstapps.com/countryliving.cdnds.net/17/47/2048x1365/gallery-1511194376-cavachon-puppy-christmas.jpg?resize=980:*");
		}
		if (buttonClicked == button2) {
			showPictureFromTheInternet("https://reductress.com/wp-content/uploads/2015/06/clock-tower.jpg");
		}

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
