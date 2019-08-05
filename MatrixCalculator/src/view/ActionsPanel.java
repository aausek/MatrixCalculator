package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class ActionsPanel extends JPanel implements ActionListener {

	public final static String INITIALIZE = "initialize matrix";
	public final static String LONGEST = "get longest";
	public final static String EVEN = "get even numbers";
	public final static String GREATER = "get greater numbers";
	public final static String AVERAGE = "to get average";

	private JButton btnInitialize;
	private JButton btnLongest;
	private JButton btnEven;
	private JButton btnGreater;
	private JButton btnAverage;

	private Frame frame; 

	public ActionsPanel(Frame pFrame) {

		frame = pFrame;

		setLayout(new FlowLayout(FlowLayout.CENTER));
		//setLayout(new GridLayout(3,2));
		
		btnInitialize = new JButton("Initialize Matrix");
		btnInitialize.setActionCommand(INITIALIZE);
		btnInitialize.addActionListener(this);

		btnLongest = new JButton("Longest Number");
		btnLongest.setActionCommand(LONGEST);
		btnLongest.addActionListener(this);

		btnEven = new JButton("Even Numbers");
		btnEven.setActionCommand(EVEN);
		btnEven.addActionListener(this);

		btnGreater = new JButton("Greater than");
		btnGreater.setActionCommand(GREATER);
		btnGreater.addActionListener(this);

		btnAverage = new JButton("Average");
		btnAverage.setActionCommand(AVERAGE);
		btnAverage.addActionListener(this);

		add(btnLongest);
		add(btnEven);
		add(btnGreater);
		add(btnAverage);
		add(btnInitialize);

		TitledBorder title = new TitledBorder("Actions");
		setBorder(title);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();


		if(command.equals(INITIALIZE)) {

			frame.requestInitializeSlots();
		}
		if(command.equals(LONGEST)) {

			frame.requestLongest();
		}
		if(command.equals(EVEN)) {

			frame.requestCountEvenNumbers();
		}
		if(command.equals(GREATER)) {

			frame.requestCountGreaterNumbers();
		}
		if(command.equals(AVERAGE)) {

			frame.requestNumbersAverage();
		}
	}
}

























