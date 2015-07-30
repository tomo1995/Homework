package task5;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *Thos pprogram contains three sliders which we use to change colors.
 */
public class RGBWindow extends JPanel {
	private int red;
	private int blue;
	private int green;
	private JButton click;
	public static void main(String[] args) {
		JFrame window = new JFrame("Picker");
		
		RGBWindow cp = new RGBWindow(500, 500);
		window.add(cp);
		window.setSize(500 , 500);
		window.setVisible(true);
	}
	
	public RGBWindow(int width, int height) {
		
		initButton(width, height);
		
		int SliderHeight = height/7;
		Dimension sliderDimension = new Dimension(width - 50, SliderHeight);
		JSlider redSlider = new JSlider(0, 255);
		initSlider(redSlider, "red", sliderDimension);
		
		JSlider blueSlider = new JSlider(0, 255);
		
		initSlider(blueSlider, "blue", sliderDimension);
		
		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "green", sliderDimension);
		
		JLabel redLabel = new JLabel("Red");
		JLabel blueLabel = new JLabel("Blue");
		JLabel greenLabel = new JLabel("Green");
		
		add(click);
		add(redLabel);
		add(redSlider);
		add(blueLabel);
		add(blueSlider);
		add(greenLabel);
		add(greenSlider);
	}
	private void initSlider(JSlider slider, String name, Dimension d ){
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JSlider changed = (JSlider)e.getSource();
				
				switch(name){
				case "red":
					red = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				}
				updateButton();
			}
		});
	}
	private void updateButton (){
		
		click.setBackground(new Color(red, blue, green));
		click.setForeground(new Color(255-red, 255-blue, 255-green));
		click.setFont(new Font("Monospaced", Font.BOLD, 25));
	}
	private void initButton (int width, int height){
		click = new JButton("Cick me");
		click.setPreferredSize(new Dimension(width, height/2));
		click.setOpaque(true);
		click.setBorderPainted(false);
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copy = String.format("%d, %d, %d", red, blue, green);
				clip.setContents(new StringSelection(copy), null);
			}
		});
		updateButton();
	}
}