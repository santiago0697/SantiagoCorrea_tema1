package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Grafic2 extends JPanel {
	private int[] coches;

	public Grafic2(int[] coches) {
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
		g.drawLine(0, 170, 296, 170);

		int auxCount = 1;
		for (int c : coches) {
			g.setColor(getRandomColor());
			g.fillRect((auxCount * 66), (200 - getBarHeight(c)), 30, (getBarHeight(c) - 30));
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(c), (auxCount * 66) + 5, (195 - getBarHeight(c)));
			auxCount++;
		}
	}
}

public class GraficEstadistic2 extends JFrame {
	public GraficEstadistic2() {
		super("Grafic 2");

		super.add(new Grafic2(new int[] { 25, 15, 35 }));

		super.setSize(296, 200);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new GraficEstadistic2();
	}
}
