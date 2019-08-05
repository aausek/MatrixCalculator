package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.ControlClass;

public class Frame extends JFrame{

	private ActionsPanel jpActions;
	private ControlClass controller;
	
	public Frame(ControlClass pController) {

		controller = pController;
		setLayout(new BorderLayout());
		jpActions = new ActionsPanel(this);
		add(jpActions, BorderLayout.CENTER);
		

		setTitle("MatrixCalculator");
		setSize(new Dimension(320, 180));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void displayMessageToUser(String pMessage) {

		JOptionPane.showMessageDialog(this, pMessage);
	}
	
	public void displayErrorToUser(String pMessage) {

		JOptionPane.showMessageDialog(this, pMessage, "Warning!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void requestInitializeSlots() {
		
		String d = JOptionPane.showInputDialog(this, "Please input the dimensions:");
		short d2 = Short.parseShort(d);
		controller.reqInitializeSlots(d2);
	}
	
	public void requestLongest() {

		controller.reqLongestNumber();

	}
	public void requestCountEvenNumbers() {
		
		controller.reqCountEvenNumbers();;
		
	}
	public void requestCountGreaterNumbers() {
		
		String n = JOptionPane.showInputDialog(this, "Please input the number:");
		long n2 = Long.parseLong(n);
		controller.reqCountGreaterNumbers(n2);
		
	}
	public void requestNumbersAverage() {
		
		controller.reqNumbersAverage();
		
	}
	
}
