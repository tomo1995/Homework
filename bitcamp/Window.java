package gui.bitcamp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	private JLabel tekst = new JLabel("Hello World");
	private JButton helloButton = new JButton("Hello");
	
	public Window(){
		setLayout(new BorderLayout());
		add(tekst);
		add(helloButton, BorderLayout.SOUTH);
		
		helloButton.addActionListener(new ButtonHandler());
		
		
		
		
		setVisible(true);
		setTitle("Hello World");
		setSize(500, 250);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		
		Window mojprozor = new Window();
		
	}
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == helloButton) {
			JOptionPane.showMessageDialog(null, "OK");
			System.exit(0);
			}
		}
		
	}
	
}
