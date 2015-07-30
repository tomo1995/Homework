package ba.bitcamp.homeworkweekend;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Columns extends JFrame {
	
	private int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private JButton[] buttons = new JButton[10];
	private int counter = 0;
	private int[] nums = new int[5];
	private int index = 0;
	
	/**
	 * Default constructor.
	 */	
	public Columns() {

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(arr[i]));
			add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}

		setLayout(new GridLayout(2, 5, 10, 10));
		setLocationRelativeTo(null);
		setTitle("Columns ");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Columns();
	}
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i < buttons.length; i++){
				
				if(e.getSource() == buttons[i]){
					if(Integer.parseInt(buttons[i].getText()) > 4){
						buttons[i-5].setEnabled(false);
					}else{
						buttons[i+5].setEnabled(false);
					}
					nums[index] = Integer.parseInt(buttons[i].getText());
					counter++;
					index++;
				}
			}	
				if(counter % 5 == 0){
					JOptionPane.showMessageDialog(null, Arrays.toString(nums));
					for(int i = 0; i < buttons.length ; i++){
						buttons[i].setEnabled(true);
					}
					index = 0;
					counter = 0;
				}
			
		}
		
	}
}