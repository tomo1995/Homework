package gui.bitcamp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exit extends JFrame {
	
	private static final long serialVersionUID = 8022428776825210588L;

	private JLabel text = new JLabel("Choose One");
	private JButton exitButton = new JButton("Exit");
	private JButton doNotExit = new JButton("Do not Exit");
	
	
	public Exit(){
		setLayout(new BorderLayout());
		add(text);
		add(exitButton, BorderLayout.SOUTH);
		add(doNotExit, BorderLayout.NORTH);
		
		exitButton.addActionListener(new ButtonHandler());
		
		setVisible(true);
		setTitle("Choose one");
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()  == exitButton){
				System.exit(0);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exit mojprozor = new Exit();
	}
	
}
