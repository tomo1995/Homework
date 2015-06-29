package gui.bitcamp;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame {
	private JLabel text = new JLabel("Press One To Disable The Other");
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	
	public Buttons(){
		setLayout(new BorderLayout());
		add(text);
		add(button2, BorderLayout.SOUTH);
		add(button1, BorderLayout.NORTH);
		
		button1.addActionListener(new Button());
		button2.addActionListener(new Button());
		
		button2.setEnabled(false);
		
		setVisible(true);
		setTitle("Task3");
		setSize(1200, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buttons mojProzor = new Buttons();
	}
	
	public class Button implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button1){
				if(button1.isEnabled()==true){
					button1.setEnabled(false);
					button2.setEnabled(true);
				}
			} else{
				button1.setEnabled(true);
				button2.setEnabled(false);
				
				
			}
			
		}
		
	}

}
