package santiagoCorrea_tema1;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui03b extends JFrame{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Gui03b();
	}
	
	private JPanel pane;

	/**
	 * Create the application.
	 */
	public Gui03b() {
		super("GUI03B");
		
		pane = new JPanel(new GridLayout(4, 3, 5, 5));
		
		for (int i = 1; i <= 10; i++) {
			pane.add(new JButton(Integer.toString(i)));
		}
		
		
		super.add(pane);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		super.setSize(200, 200);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}

}
