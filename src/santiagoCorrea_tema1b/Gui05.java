package santiagoCorrea_tema1b;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MiPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Interfaz grafica", 40, 40);
	}
}
public class Gui05 extends JFrame{
	public Gui05() {
		super("Ejemplo de dibujo");
		super.add(new MiPanel());
		super.setSize(200, 100);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Gui05();
	}
}
