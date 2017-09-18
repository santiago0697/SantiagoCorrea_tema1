package santiagoCorrea_tema1b;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class RepeatEquPane extends JPanel {
	double[] numbers;

	int endPoint = 0;

	public RepeatEquPane(double[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public void paintComponent(Graphics g) {
		Utils.drawAxis(g, this);
		this.drawEquacionXTimes(g, numbers[0], numbers[1], numbers[2], -50, 50, 3);
	}

	private void drawEquacionXTimes(Graphics g, double a, double b, double c, double minX, double maxX, int times) {
		g.setColor(Utils.getRandomColor());

		for (int x = 0; x < times; x++) {

			for (double i = minX + (endPoint * x); i < maxX + (endPoint * x); i++) {
				/*
				 * Formula para sacar los puntos de union entre las lineas
				 */
				double y = ((double) Math.pow(i, 2) * a) + i * b + c;
				double xp = i + 1;
				double yp = ((double) Math.pow(xp, 2) * a) + xp * b + c;
				/*
				 * Dibujar las lineas que forman la parabola
				 */
				if (x == 0 && i == maxX - 1) {
					endPoint = (int) i;
				}
				g.drawLine((int) (realX(i)), (int) (realY(y)), (int) (realX(xp)), (int) (realY(yp)));
			}
		}
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

public class Equacion2 extends JFrame {
	public Equacion2() {
		super("Equacion 2");
		super.add(new RepeatEquPane(new double[] { -0.07, -8, -5 }));

		init();
	}

	private void init() {
		super.setResizable(false);
		super.setSize(1000, 600);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Equacion2();
	}
}
