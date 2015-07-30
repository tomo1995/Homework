package task1;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AdjustableFontSize extends JFrame {
	private JSlider slider = new JSlider(8, 100);
	private JLabel text = new JLabel("Text");

	public static void main(String[] args) {
		new AdjustableFontSize();
	}
/**
 * Default constructor.
 * We use slider to control size of Font.
 */
	public AdjustableFontSize() {

		setLayout(new GridLayout(2, 0));
		add(text);
		text.setFont(new Font("Serif", Font.BOLD, 25));
		slider.addChangeListener(new Change());
		add(slider);
		text.setHorizontalAlignment(JLabel.CENTER);
		setTitle("Nul");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
/**
 * Change listener is implemented because of slider.
 */
	private class Change implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			text.setFont(new Font("Serif", Font.BOLD, slider.getValue()));
		}

	}
}