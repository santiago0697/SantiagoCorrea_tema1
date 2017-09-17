package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class EquPane extends JPanel {

	public EquPane() {
	}

	@Override
	public void paintComponent(Graphics g) {
		this.drawAxis(g);
	}

	private void drawAxis(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
		g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

		/*
		 * draw X sticks
		 */
		for (int i = 0; i <= this.getWidth(); i += 10) {
			g.drawLine(i, this.getHeight() / 2 + 3, i, this.getHeight() / 2 - 3);
		}

		/*
		 * draw Y sticks
		 */
		for (int i = 0; i <= this.getHeight(); i += 10) {
			g.drawLine(this.getWidth() / 2 + 3, i, this.getWidth() / 2 - 3, i);
		}
	}
}

public class Equacion extends JFrame {
	public final Vector2 windowBounds = new Vector2(500, 500);

	public Equacion() {
		super("Equacion");
		super.add(new EquPane());
		init();
	}

	/**
	 * Jframe attributes and
	 */
	private void init() {
		super.setSize((int) windowBounds.getX(), (int) windowBounds.getY());
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
	}

	/**
	 * Main method (start point)
	 */
	public static void main(String args[]) {
		new Equacion();
	}

	/**
	 * Custom vector2 method
	 * 
	 * @author santi
	 *
	 */
	class Vector2 {
		private double x, y;

		public Vector2(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return this.x;
		}

		public double getY() {
			return this.y;
		}
	}

}
