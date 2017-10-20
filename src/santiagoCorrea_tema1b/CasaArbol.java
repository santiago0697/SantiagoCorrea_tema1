package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MainPane extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		drawSol(g);
		drawTree(g);
		drawHouse(g);
	}

	private void drawSol(Graphics g) {
		// SUN
		g.setColor(Color.ORANGE);
		g.drawOval(getWidth() - 150, 15, 100, 100);
		g.drawOval(getWidth() - 130, 30, 30, 30);
		g.drawOval(getWidth() - 100, 30, 30, 30);

		// EYES
		g.setColor(Color.BLACK);
		g.drawOval(getWidth() - 120, 40, 10, 10);
		g.drawOval(getWidth() - 90, 40, 10, 10);

		// LIGHTS
		g.setColor(Color.RED);
		g.drawLine(getWidth() - 140, 20, getWidth() - 200, 0);
		g.drawLine(getWidth() - 150, 60, getWidth() - 220, 45);
		g.drawLine(getWidth() - 150, 90, getWidth() - 220, 120);

	}

	private void drawTree(Graphics g) {
		// TREE
		g.setColor(Color.BLACK);
		g.drawLine(getWidth() - 120, getHeight() - 50, getWidth() - 120, getHeight() - 200);
		g.drawLine(getWidth() - 140, getHeight() - 50, getWidth() - 140, getHeight() - 200);
		g.drawLine(getWidth() - 140, getHeight() - 200, getWidth() - 120, getHeight() - 200);

		// LEAVES
		g.setColor(Color.GREEN);
		g.drawOval(getWidth() - 120, getHeight() - 250, 70, 70);
		g.drawOval(getWidth() - 180, getHeight() - 300, 100, 100);
		g.drawOval(getWidth() - 170, getHeight() - 230, 60, 60);
		g.drawOval(getWidth() - 230, getHeight() - 280, 100, 100);
	}

	private void drawHouse(Graphics g) {
		// HOUSE
		g.setColor(Color.BLACK);
		g.drawLine(100, getHeight() - 50, 100, getHeight() - 200);
		g.drawLine(250, getHeight() - 50, 250, getHeight() - 200);

		// DOOR
		g.drawLine(150, getHeight() - 50, 150, getHeight() - 125);
		g.drawLine(200, getHeight() - 50, 200, getHeight() - 125);
		g.drawLine(200, getHeight() - 125, 150, getHeight() - 125);

		g.drawLine(150, getHeight() - 125, 190, getHeight() - 105);
		g.drawLine(150, getHeight() - 50, 190, getHeight() - 30);
		g.drawLine(190, getHeight() - 30, 190, getHeight() - 105);

		g.drawOval(180, getHeight() - 70, 10, 10);

		// WINDOWS
		g.drawRect(120, getHeight() - 190, 40, 40);
		g.drawRect(190, getHeight() - 190, 40, 40);
		g.drawLine(140, getHeight() - 190, 140, getHeight() - 150);
		g.drawLine(210, getHeight() - 190, 210, getHeight() - 150);

		// ROOF
		g.setColor(Color.RED);
		g.drawLine(60, getHeight() - 200, 100, getHeight() - 200);
		g.drawLine(60, getHeight() - 200, 175, getHeight() - 275);

		g.drawLine(290, getHeight() - 200, 175, getHeight() - 275);
		g.drawLine(290, getHeight() - 200, 250, getHeight() - 200);

		g.drawLine(260, getHeight() - 220, 260, getHeight() - 275);
		g.drawLine(230, getHeight() - 240, 230, getHeight() - 275);
		g.drawLine(230, getHeight() - 275, 260, getHeight() - 275);

		g.setColor(getBackground());
		g.fillRect(230, getHeight() - 239, 30, 30);

		// FLOOR
		g.setColor(Color.GREEN);
		g.drawLine(0, getHeight() - 50, 150, getHeight() - 50);
		g.drawLine(200, getHeight() - 50, getWidth() - 140, getHeight() - 50);
		g.drawLine(getWidth() - 120, getHeight() - 50, getWidth(), getHeight() - 50);
		
		//SMOKE
		g.setColor(Color.GRAY);
		g.drawOval(240, getHeight() - 300, 20, 20);
		g.drawOval(220, getHeight() - 340, 40, 40);
		g.drawOval(260, getHeight() - 380, 40, 50);
		g.drawOval(200, getHeight() - 420, 60, 50);

	}
}

public class CasaArbol extends JFrame {

	public CasaArbol() {
		super("Casa Arbol");
		add(new MainPane());

		init();
	}

	private void init() {
		super.setResizable(false);
		super.setSize(600, 500);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
	}

	public static void main(String args[]) {
		new CasaArbol();
	}

}
