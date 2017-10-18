package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MainPane extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		g.drawRect(50, 50, 50, 50);

	}

	private void drawSol(Graphics g) {
		g.setColor(Color.YELLOW);
		// g.drawOval(x, y, width, height);

	}
}

public class CasaArbol extends JFrame {

	public CasaArbol() {
		super("Casa Arbol");
		init();
		add(new MainPane());
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
