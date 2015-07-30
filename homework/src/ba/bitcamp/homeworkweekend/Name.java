package ba.bitcamp.homeworkweekend;

import javax.swing.JFrame;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Name extends JFrame {


	private String name = "First name";
	private String lastName = "Last name";
	private JButton button1 = new JButton("First name");
	private JButton button2 = new JButton("Last name");
	private JLabel text = new JLabel(name + " " + lastName);

	/**
	 * Default constructor
	 */
	public Name() {

		setTitle(" Name ");

		setLayout(new BorderLayout());
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(text, BorderLayout.CENTER);

		text.setHorizontalAlignment(NORMAL);
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setResizable(false);
		setLocationRelativeTo(null);
		setSize(500,300);
		setVisible(true);
	}

	/**
	 * This is inner class with array of names.
	 * 
	 */
	static class Names {

		protected String names[] = { "Becir", "Ognjen", "Enver", "Tomislav" };

		/**
		 * Method that generates one random name from names array.
		 * 
		 * @return - Returns name
		 */
		public String generateName() {

			return names[(int) (Math.random() * names.length)];
		}

		@Override
		public String toString() {
			return generateName();
		}

	}

	/**
	 * This is inner class with array of last names.
	 *
	 *
	 */
	static class lastNames {

		public String lastNames[] = { "Omerbasic", "Cetkovic", "Memic","Trifunovic" };

		/**
		 * Method that generates one random last name.
		 * 
		 * @return Returns one of last name.
		 */
		String generateSurnName() {

			return lastNames[(int) (Math.random() * lastNames.length)];
		}

		
		public String toString() {
			return generateSurnName();
		}
	}

	private class Action implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button1) {

				name = new Names().toString();
				text.setText(name + " " + lastName);

			} else if (e.getSource() == button2) {

				lastName = new lastNames().toString();
				text.setText(name + " " + lastName);
			}

		}

	}

	public static void main(String[] args) {
		new Name();
	}
}