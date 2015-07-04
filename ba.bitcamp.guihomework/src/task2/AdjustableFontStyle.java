package task2;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdjustableFontStyle extends JFrame {


	private static final long serialVersionUID = 921905246549259973L;
	JLabel label = new JLabel("Label");
	private JCheckBox box1 = new JCheckBox("Bold");
	private JCheckBox box2 = new JCheckBox("Italic");
	JButton button = new JButton("Apply");
	
	public static void main(String[] args) {
		new AdjustableFontStyle();
	}
	/**
	 * Default constructor.
	 */
	public AdjustableFontStyle(){
		setLayout(new GridLayout(4, 1));
		add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(box1);
		add(box2);
		add(button);
		
		button.addActionListener(new Action());
		box1.setSelected(true);
		box1.setEnabled(true);
		box2.setSelected(true);
		box2.setEnabled(true);
		
		setTitle("Nul");
		setSize(500,300 );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	/**
	 *We implemented Action listener because of button.
	 *We use check boxes to set font.
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(box1.isSelected()&& box2.isSelected()){
			label.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
			}
			else if(box1.isSelected() ){
				label.setFont(new Font("Arial", Font.BOLD, 20));
				
			}else if(box2.isSelected()){
				label.setFont(new Font("Italic", Font.ITALIC, 20));
			}else {
				label.setFont(new Font("Arial", Font.PLAIN, 20));
			}
		}
	 }
	}