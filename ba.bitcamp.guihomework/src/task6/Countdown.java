package task6;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.Timer;
/** 
 *This program contains timer, and when we input number in seconds it counts to zero.
 */
public class Countdown extends JFrame {

	private static final long serialVersionUID = -4273224563630059223L;

	private JPanel panel = new JPanel();

	private JButton button = new JButton("Start");

	private JLabel label = new JLabel();

	private JTextField field = new JTextField();

	private Timer t;

	private int a;

	public static void main(String[] args) {

		new Countdown();

	}

	public Countdown() {

		add(panel);

		panel.setLayout(new GridLayout(3, 1));

		panel.add(label);

		panel.add(field);

		panel.add(button);

		button.addActionListener(new Action());

		t = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (a == 1) {

					t.stop();

				}

				label.setText((--a) + "");

			}

		});

		setTitle("Frame1");

		setSize(600, 400);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button) {

				String s = field.getText();

				a = Integer.parseInt(s);

				t.start();

			}

		}

	}

}