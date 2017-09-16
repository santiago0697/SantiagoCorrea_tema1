package santiagoCorrea_tema1;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Gui00 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Gui00();
	}

	/**
	 * Create the application.
	 */
	public Gui00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ejemplo00");
		frame.setVisible(true);
	}

}
