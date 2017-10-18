package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Waves extends JPanel {

	private int factor = 200;
	private int points;
	private double[] sines;
	private int[] pts;

	public Waves(int repeticiones) {
		points = factor * repeticiones * 2;
		sines = new double[points];
		for (int i = 0; i < points; i++) {
			double radians = (Math.PI / factor) * i;
			sines[i] = Math.sin(radians);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int maxWidth = getWidth();
		double hstep = (double) maxWidth / (double) points;
		int maxHeight = getHeight();
		pts = new int[points];
		for (int i = 0; i < points; i++) {
			pts[i] = (int) (sines[i] * maxHeight / 2 * .95 + maxHeight / 2);
		}
		g.setColor(Color.RED);
		for (int i = 1; i < points; i++) {
			int x1 = (int) ((i - 1) * hstep);
			int x2 = (int) (i * hstep);
			int y1 = pts[i - 1];
			int y2 = pts[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}

}

public class Equacion2 extends JFrame {

	public Equacion2() {
		super("Equacion 2");
		Waves wave = new Waves(5);
		add(wave);
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
