package task3;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * This program has space for username and space for password.
 * We use enter except button.
 */
public class Login extends JFrame {
	private JLabel label = new JLabel("Name");
	private JLabel label1 = new JLabel("Password");
	private JTextField text = new JTextField();
	private JPasswordField pass = new JPasswordField("");
	public static void main(String[] args) {
		new Login();
	}
	/**
	 * Default Constructor
	 */
	public Login (){
		setLayout(new GridLayout(2, 2, 5 ,5));
		
		add(label);
		add(text);
		text.setFont(new Font("Arial", Font.PLAIN, 20));
		add(label1);
		add(pass);
		pass.setFont(new Font("Arial", Font.BOLD, 20));
		pass.addActionListener(new Action(
				));
			
			
		
		setTitle("Login");
		setSize(500,300 );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	/**
	 *Implementing ActionListener for password.
	 */
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String correctPassword = "1234";
			String givenPassword = String.valueOf(pass.getPassword());
			String correctName = "Mujo";
			String givenName = text.getText();
			
			if (correctPassword.equals(givenPassword) && correctName.equals(givenName) ) {
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, "Password or name are not good");
			}
			
		}
		
	}
		
		
	}