package controller;

//Model <--> Controller <--> View

import model.MatrixCalculator;
import view.Frame;

public class ControlClass {

	private MatrixCalculator calculator;
	private Frame frame;

	public ControlClass(){

		calculator = new MatrixCalculator();
		frame = new Frame(this);
		frame.setVisible(true);
	}
	
	public void reqInitializeSlots(short pDimension) {
		
		try {
			calculator.initializeSlots(pDimension);
			String message = "The matrix was initialized";
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}

	public void reqLongestNumber() {

		try {
			calculator.getLongestNumber();
			long n = calculator.getLongestNumber();
			String message = "The longest number is " + n;
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}
	public void reqCountEvenNumbers() {

		try {
			calculator.countEvenNumbers();
			short n = calculator.countEvenNumbers();
			String message = "There is/are " + n + " numbers in the matrix";
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}
	public void reqCountGreaterNumbers(long pNumber) {

		try {

			short n = calculator.countGreaterNumbers(pNumber);
			String message = "There is/are " + n + " greater than " + pNumber;
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}
	public void reqNumbersAverage() {

		try {
			calculator.getNumbersAverage();
			float n = calculator.getNumbersAverage();
			String message = "The average is: " + n;
			frame.displayMessageToUser(message);
		}
		catch(Exception e) {

			frame.displayErrorToUser(e.getMessage());
		}
	}

	public static void main(String[] args) {

		ControlClass c = new ControlClass();
	}
}
