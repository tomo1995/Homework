package task9;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.JTextField;
/**
 *In this program we use TextIO to check the file. 
 */
public class ImportTextFile extends JFrame {

	private static final long serialVersionUID = 8510349306043130220L;

	private JPanel panel = new JPanel();

	private JTextField field = new JTextField();

	private JTextArea area = new JTextArea();

	public static void main(String[] args) {

		new ImportTextFile();

	}
	/**
	 * Default Constructor.
	 */
	public ImportTextFile() {

		add(panel);

		panel.setLayout(new BorderLayout());

		panel.add(field, BorderLayout.NORTH);

		panel.add(area, BorderLayout.CENTER);

		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					TextIO.readFile(field.getText());

					String s = "";

					while (!(TextIO.eof())) {

						s += TextIO.getln() + "\n";

					}

					area.setText(s);

				} catch (Exception ex) {

					JOptionPane.showMessageDialog(null, "No such file");

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