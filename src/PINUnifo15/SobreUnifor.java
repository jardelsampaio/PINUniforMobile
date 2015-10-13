package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SobreUnifor extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobreUnifor frame = new SobreUnifor();
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
	public SobreUnifor() {
		setBounds(100, 100, 450, 300);

	}

}
