package santiagoCorrea_tema1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui03 extends JFrame{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Gui03();
	}

	private JPanel panel;
	/**
	 * Create the application.
	 */
	public Gui03() {
		super("Gui03");
		
		/*
		 * Panel init
		 */
		panel = new JPanel(new BorderLayout(5,10));

		panel.add(new JButton("1"), BorderLayout.EAST);
		panel.add(new JButton("2"), BorderLayout.SOUTH);
		panel.add(new JButton("3"), BorderLayout.WEST);
		panel.add(new JButton("4"), BorderLayout.NORTH);
		panel.add(new JButton("5"), BorderLayout.CENTER);
		
		
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
