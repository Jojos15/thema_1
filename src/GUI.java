import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{
	
	private JPanel panel = new JPanel();
	private JButton button = new JButton("TestResults");
	private ArrayList<Test> tests;
	
	public GUI(ArrayList<Test> tests) {

		this.tests = tests;

		panel.add(button);
		this.setContentPane(panel);		
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(200, 200);
		this.setTitle("Test Results");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int pos = 0;
			for(Test t: tests){
				if(t.isPositive()){
					pos++;
				}
			}
			int neg = tests.size() - pos;

			System.out.println("Negative Tests: " + neg + " (" + (neg*100)/ tests.size() + "%), Positive Tests: " + pos + " (" + (pos*100)/ tests.size() + "%)");
		}
		
	}

}
