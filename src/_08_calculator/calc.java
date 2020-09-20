package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calc implements ActionListener {
	JButton add= new JButton("add");
	JButton subtract= new JButton("subtract");
	JButton multiply= new JButton("multiply");
	JButton divide= new JButton("divide");
	JTextField number1 = new JTextField();
	JTextField number2 = new JTextField();

		 public int add(int num1, int num2) {
			 int result= num1+num2;
			 return result;
		 }
		 public int subtract(int num1, int num2) {
			 int result=num1-num2;
			 return result;
			 
		 }
		 public int multiply(int num1, int num2) {
			 int result=num1*num2;
			 return result;
			 
		 }
		 public int divide(int num1, int num2) {
			 int result=num1/num2;
			 return result;
			 
		 }
		 public void run() {
			 JFrame frame= new JFrame("Calculator");
			 JPanel panel= new JPanel();
			 add.addActionListener(this);
			 subtract.addActionListener(this);
			 multiply.addActionListener(this);
			 divide.addActionListener(this);
			 panel.add(add);
			 panel.add(subtract);
			 panel.add(multiply);
			 panel.add(divide);
			 panel.add(number1);
			 panel.add(number2);
			 

			 frame.add(panel);
			
			 frame.setVisible(true);
			 
		 }
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton buttonClicked = (JButton) e.getSource();
			String txt1= number1.getText();
			int num1= Integer.parseInt(txt1);
			String txt2= number1.getText();
			int num2= Integer.parseInt(txt2);
			
			if (buttonClicked==add) {
				
				add(num1, num2);
				
			}
			
		}
		 
	 }


