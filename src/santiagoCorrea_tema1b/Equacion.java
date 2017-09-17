package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

class EquPane extends JPanel {

	double[][] numbers;

	public EquPane(double[][] numbers) {
		this.numbers = numbers;
	}

	@Override
	public void paintComponent(Graphics g) {
		this.drawAxis(g);
		for (double parabola[] : numbers) {
			this.drawEquacion(g, parabola[0], parabola[1], parabola[2], -this.getWidth() / 2, this.getWidth() / 2);
		}
	}

	private void drawAxis(Graphics g) {
		int separacion = 20;
		g.setColor(Color.BLACK);
		g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
		g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

		/*
		 * draw X sticks
		 */
		for (int i = 0; i <= this.getWidth(); i += separacion) {
			g.drawLine(i, this.getHeight() / 2 + 3, i, this.getHeight() / 2 - 3);
		}

		/*
		 * draw Y sticks
		 */
		for (int i = 0; i <= this.getHeight(); i += separacion) {
			g.drawLine(this.getWidth() / 2 + 3, i, this.getWidth() / 2 - 3, i);
		}
	}

	private void drawEquacion(Graphics g, double a, double b, double c, double minX, double maxX) {
		double escala = 1.1;
		g.setColor(this.getRandomColor());
		for (double i = minX; i < maxX; i++) {
			/*
			 * Formula para sacar los puntos de union entre las lineas
			 */
			double y = ((double) Math.pow(i, 2) * a) + i * b + c;
			double xp = i + 1;
			double yp = ((double) Math.pow(xp, 2) * a) + xp * b + c;
			/*
			 * Dibujar las lineas que forman la parabola
			 */
			g.drawLine((int) (realX(i) * escala), (int) (realY(y) * escala), (int) (realX(xp) * escala),
					(int) (realY(yp) * escala));
		}
	}

	private Color getRandomColor() {
		int r = ThreadLocalRandom.current().nextInt(1, 256);
		int g = ThreadLocalRandom.current().nextInt(1, 256);
		int b = ThreadLocalRandom.current().nextInt(1, 256);

		return new Color(r, g, b);
	}

	/*
	 * Cordenadas reales parser
	 */
	private double realX(double x) {
		return (x + this.getWidth() / 2);
	}

	private double realY(double y) {
		return (-y + this.getWidth() / 2);
	}

}

public class Equacion extends JFrame {
	public final Vector2 windowBounds = new Vector2(500, 500);

	public Equacion() {
		super("Equacion");
		super.add(new EquPane(new double[][] { { -0.07, -8, -5 }, { 0.05, 3, 6 }, { -0.02, 2.2, 50 } }));
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
