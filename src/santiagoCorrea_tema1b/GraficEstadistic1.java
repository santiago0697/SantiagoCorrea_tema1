package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Grafic extends JPanel {
	private int[] coches;

	public Grafic(int[] coches) {
		this.coches = coches;
	}

	private int getBarHeight(int coche) {
		return ((coche * 170) / 40);
	}

	private Color getRandomColor() {
		int r = ThreadLocalRandom.current().nextInt(1, 256);
		int g = ThreadLocalRandom.current().nextInt(1, 256);
		int b = ThreadLocalRandom.current().nextInt(1, 256);

		return new Color(r, g, b);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(0, 0, 0));
		g.drawLine(0, 170, 266, 170);

		int auxCount = 1;
		for (int c : coches) {
			g.setColor(getRandomColor());
			g.drawLine((auxCount * 66), 170, (auxCount * 66), 200-getBarHeight(c));
			auxCount++;
		}
	}
}

public class GraficEstadistic1 extends JFrame {
	public GraficEstadistic1() {
		super("Grafic 1");

		super.add(new Grafic(new int[] { 25, 15, 35 }));

		super.setSize(266, 200);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new GraficEstadistic1();
	}
}
