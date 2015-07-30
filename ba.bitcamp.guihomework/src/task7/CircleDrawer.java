package task7;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JSlider;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;
/**
 *In this program we use mouse to set the center of circle, and we can change the size
 *of circle using slider.
 */
public class CircleDrawer extends JFrame {

	private static final long serialVersionUID = 6557145973514805824L;

	private JSlider slider = new JSlider(10, 200, 50);

	private JPanel panel = new MyPanel();

	private int x;

	private int y;

	private int ovalSize;

	public static void main(String[] args) {

		new CircleDrawer();

	}

	public CircleDrawer() {

		add(panel);

		panel.add(slider);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				ovalSize = slider.getValue();

				repaint();

			}

		});

		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

				// TODO Auto-generated method stub

			}
			/**
			 * When we press the mouse we change coordinates of circle.
			 */
			@Override
			public void mousePressed(MouseEvent e) {

				x = e.getX();

				y = e.getY();

				repaint();

			}

			@Override
			public void mouseExited(MouseEvent e) {

				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {

				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}

		});

		setTitle("Frame1");

		setSize(600, 400);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 3661526956101640366L;

		@Override
		protected void paintComponent(Graphics g) {

			// TODO Auto-generated method stub

			super.paintComponent(g);

			g.setColor(Color.BLACK);

			g.drawOval(x - ovalSize / 2, y - ovalSize / 2, ovalSize, ovalSize);

		}

	}

}