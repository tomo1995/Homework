package ba.bitcamp.homeworkweekend;

	

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Numbers extends JFrame {

	
	private int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
	private JButton[] buttons = new JButton[10];
	private int counter = 0;
	private String s = "";
	
	public static void main(String[] args) {
		new Numbers();
	}
	
	public Numbers(){
		
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton(Integer.toString(arr[i]));
			add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}
		
		setLayout(new GridLayout(10,1, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Numbers");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i < buttons.length; i++){
	
				if(e.getSource() == buttons[i]){
					s += buttons[i].getText();
					counter++;
				}
			}	
				if(counter % 3 == 0){
					JOptionPane.showMessageDialog(null, "Number: " + s);
					s = "";
					counter = 0;
				}
			
		}
		
	}
	
	
}