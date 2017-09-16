package santiagoCorrea_tema1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	/*
	 * Vars
	 */
	private JPanel mainPane;

	/**
	 * Constructor
	 */
	public Ventana() {
		super("Ventana");

		/*
		 * MainPane
		 */
		mainPane = new JPanel(new GridBagLayout());

		/**
		 * Textarea form
		 */
		JTextArea textArea = new JTextArea("Area texto");
		GridBagConstraints constrains = new GridBagConstraints();
		constrains.gridx = 0;
		constrains.gridy = 0;
		constrains.gridwidth = 2;
		constrains.gridheight = 2;
		constrains.weighty = 1.0;
		constrains.fill = GridBagConstraints.BOTH;
		mainPane.add(textArea, constrains);

		/**
		 * Buttons add
		 */
		// 1
		constrains.weighty = 0.0;
		JButton b1 = new JButton("Boton 1");
		constrains.gridx = 2;
		constrains.gridy = 0;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		constrains.weighty = 1.0;
		constrains.anchor = GridBagConstraints.NORTH;
		constrains.fill = GridBagConstraints.NONE;
		mainPane.add(b1, constrains);
		// 2
		constrains.weighty = 0.0;
		constrains.anchor = GridBagConstraints.CENTER;
		JButton b2 = new JButton("Boton 2");
		constrains.gridx = 2;
		constrains.gridy = 1;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		constrains.weighty = 1.0;
		constrains.anchor = GridBagConstraints.NORTH;
		mainPane.add(b2, constrains);
		// 3
		constrains.weighty = 0.0;
		constrains.anchor = GridBagConstraints.CENTER;
		JButton b3 = new JButton("Boton 3");
		constrains.gridx = 0;
		constrains.gridy = 2;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		mainPane.add(b3, constrains);
		// 4
		JButton b4 = new JButton("Boton 4");
		constrains.gridx = 2;
		constrains.gridy = 2;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		mainPane.add(b4, constrains);

		/*
		 * TextField
		 */
		JTextField campoTexto = new JTextField("Campo texto");
		constrains.gridx = 1;
		constrains.gridy = 2;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		constrains.weightx = 1.0;
		constrains.fill = GridBagConstraints.HORIZONTAL;
		mainPane.add(campoTexto, constrains);

		super.add(mainPane);
		initialize();
	}

	public void initialize() {
		super.setSize(800, 600);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Ventana();
	}
}
