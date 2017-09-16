package santiagoCorrea_tema1b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MiPanelOval extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		Color c = new Color(180,10,120);
		g.setColor(c);
		g.drawString("Dibujar en el panel", 90, 90);
		g.fillOval(1, 1, 90, 90);
	}
}

public class Gui06 extends JFrame{
	public Gui06() {
		super("Ejemplo de dibujo");
		super.add(new MiPanelOval());
		super.setSize(300,200);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Gui06();
	}
}
