package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class EditarEvento extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarEvento frame = new EditarEvento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditarEvento() {
		setBounds(100, 100, 450, 300);

	}

}
