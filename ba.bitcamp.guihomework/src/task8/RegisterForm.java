package task8;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JPasswordField;

import javax.swing.JTextField;
/**
 *This program contains place for Username and places for passwords.
 */
public class RegisterForm extends JFrame {

	private JPanel panel = new JPanel();

	private JLabel label1 = new JLabel("Username");

	private JLabel label2 = new JLabel("Enter Password");

	private JLabel label3 = new JLabel("Confirm Password");

	private JTextField field = new JTextField();

	private JPasswordField pass1 = new JPasswordField();

	private JPasswordField pass2 = new JPasswordField();

	private JButton button1 = new JButton("Clear");

	private JButton button2 = new JButton("Submit");

	private boolean hasNumber = false;

	private boolean hasSpecialCharacter = false;

	public static void main(String[] args) {

		new RegisterForm();

	}
	/**
	 * Default Constructor.
	 */
	public RegisterForm() {

		add(panel);

		panel.setLayout(new GridLayout(4, 2));

		panel.add(label1);

		panel.add(field);

		panel.add(label2);

		panel.add(pass1);

		panel.add(label3);

		panel.add(pass2);

		panel.add(button1);

		panel.add(button2);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == button1) {

					field.setText("");

					pass1.setText("");

					pass2.setText("");

				}

			}

		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == button2) {

					char[] s = pass1.getPassword();

					char[] s1 = pass2.getPassword();

					String f = String.valueOf(s);

					String f1 = String.valueOf(s1);

					String st = field.getText();

					for (int i = 0; i < s.length; i++) {

						if (s[i] >= 48 && s[i] <= 57) {

							hasNumber = true;

						}

						if ((s[i] >= 33 && s[i] <= 47)
								|| (s[i] >= 58 && s[i] <= 64)
								|| (s[i] >= 91 && s[i] <= 96)
								|| (s[i] >= 123 && s[i] <= 126)) {

							hasSpecialCharacter = true;

						}

					}

					if (!(f.equals(f1))) {

						JOptionPane.showMessageDialog(null,
								"Passwords don't match");

					} else if (st.length() < 6 || f.length() < 6) {

						JOptionPane
								.showMessageDialog(null,
										"Username or pasword are too short, you need six characters at least.");

					} else if (hasNumber == false
							|| hasSpecialCharacter == false) {

						JOptionPane
								.showMessageDialog(null,
										"You need to have at least one number and one character in your password.");

					}

				}

			}

		});

		setTitle("Frame1");

		setSize(600, 400);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}