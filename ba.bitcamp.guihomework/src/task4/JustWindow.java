package task4;

import javax.swing.JOptionPane;

/**
 * This program calculate the sum of all numbers user has input.
 */
public class JustWindow {

	public static void main(String[] args) {

		int sum = 0;

		int choice;
/**
 * We use this loop to see are they equals and to catch all possible exceptions.
 */
		do {

			String b = JOptionPane.showInputDialog("Enter a number");

			try {

				if (!(b.equals(null))) {

					int a = Integer.parseInt(b);

					sum += a;

				}

			} catch (NullPointerException ex) {

				JOptionPane.showMessageDialog(null,
						String.format("Sum is %d", sum));

				System.exit(0);

			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(null, "Wrong input", "Title",
						JOptionPane.ERROR_MESSAGE);

				System.exit(0);

			}

			choice = JOptionPane.showConfirmDialog(null,

			"Don't you want to enter another number? ");

			if (choice == JOptionPane.CANCEL_OPTION) {

				System.exit(0);

			}

		} while (!(choice == JOptionPane.NO_OPTION));

		JOptionPane.showMessageDialog(null, String.format("Sum is %d", sum));

	}

}