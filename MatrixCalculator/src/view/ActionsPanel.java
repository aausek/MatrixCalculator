package view;

import java.awt.BorderLayout;
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
	
	private JPanel top;
	private JPanel bottom;

	private Frame frame; 

	public ActionsPanel(Frame pFrame) {

		frame = pFrame;
		top = new JPanel();
		bottom= new JPanel();
		top.setLayout(new GridLayout(2,2));
		bottom.setLayout(new GridLayout(1,1));

		setLayout(new BorderLayout());
		
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

		top.add(btnLongest);
		top.add(btnEven);
		top.add(btnGreater);
		top.add(btnAverage);
		bottom.add(btnInitialize);
		
		add(top,BorderLayout.CENTER);
		add(bottom,BorderLayout.SOUTH);

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

























