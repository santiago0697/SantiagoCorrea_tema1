package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;

public class Utils {
	
	/*
	 * Dibuja en un panel un eje de cordenadas
	 */
	public static void drawAxis(Graphics g, JPanel pane) {
		int separacion = 20;
		g.setColor(Color.BLACK);
		g.drawLine(0, pane.getHeight() / 2, pane.getWidth(), pane.getHeight() / 2);
		g.drawLine(pane.getWidth() / 2, 0, pane.getWidth() / 2, pane.getHeight());

		/*
		 * draw X sticks
		 */
		for (int i = 0; i <= pane.getWidth(); i += separacion) {
			g.drawLine(i, pane.getHeight() / 2 + 3, i, pane.getHeight() / 2 - 3);
		}

		/*
		 * draw Y sticks
		 */
		for (int i = 0; i <= pane.getHeight(); i += separacion) {
			g.drawLine(pane.getWidth() / 2 + 3, i, pane.getWidth() / 2 - 3, i);
		}
	}
	
	/*
	 * Genera un colo aleatorio
	 */
	public static Color getRandomColor() {
		int r = ThreadLocalRandom.current().nextInt(1, 256);
		int g = ThreadLocalRandom.current().nextInt(1, 256);
		int b = ThreadLocalRandom.current().nextInt(1, 256);

		return new Color(r, g, b);
	}
}
