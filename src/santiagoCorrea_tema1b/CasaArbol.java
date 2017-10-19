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
		//TREE
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
}

public class CasaArbol extends JFrame {

	public CasaArbol() {
		super("Casa Arbol");
		add(new MainPane());

		init();
	}

	private void init() {
		super.setResizable(false);
		super.setSize(500, 500);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
	}

	public static void main(String args[]) {
		new CasaArbol();
	}

}
