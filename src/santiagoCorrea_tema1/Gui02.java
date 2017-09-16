package santiagoCorrea_tema1;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui02 extends JFrame{


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Gui02();
	}

	private JPanel panel;
	/**
	 * Create the application.
	 */
	public Gui02() {
		super("GUI02");
		
		/*
		 * panel init
		 */
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
		
		for (int i = 0; i <= 10 ; i++) {
			panel.add(new Button("Button "+i));
		}
		
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
