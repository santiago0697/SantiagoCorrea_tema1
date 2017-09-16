package santiagoCorrea_tema1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui04 extends JFrame{
	
	private JPanel mainPane;
	public Gui04() {
		super("GUI04");
		
		mainPane = new JPanel(new BorderLayout());
		
		/*
		 * 12 buttons pane
		 */
		JPanel butonsPane = new JPanel(new GridLayout(4, 3));
		
		for (int i = 1; i <= 9; i++) {
			butonsPane.add(new JButton(Integer.toString(i)));
		}
		butonsPane.add(new JButton("" + 0));
		butonsPane.add(new JButton("Start"));
		butonsPane.add(new JButton("Stop"));
		
		/*
		 * 2 pane
		 */
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Aqui el tiempo"),BorderLayout.NORTH);
		p2.add(butonsPane, BorderLayout.CENTER);
		
		
		mainPane.add(p2, BorderLayout.EAST);
		mainPane.add(new JButton("Aqui la comida"), BorderLayout.CENTER);
		super.add(mainPane);
		initialize();
	}
	public void initialize() {
		super.setSize(400, 250);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	/**
	 * Main method
	 */
	public static void main (String args[]) {
		new Gui04();
	}

}
