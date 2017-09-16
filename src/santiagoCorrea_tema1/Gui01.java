package santiagoCorrea_tema1;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;

public class Gui01 extends JFrame{

	/**
	 * Swing components
	 */
	private JButton mainButton;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Gui01();
	}

	/**
	 * Create the application.
	 */
	public Gui01() {
		super("Ejemplo 01 con boton");
		
		/*
		 * Panel create
		 */
		panel = new JPanel();
		/*
		 * Button add
		 */
		mainButton = new JButton("Aceptar");
		panel.add(mainButton);

		super.add(panel);

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		super.setBounds(100, 100, 450, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}

}
