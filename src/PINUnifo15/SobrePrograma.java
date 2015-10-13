package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SobrePrograma extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobrePrograma frame = new SobrePrograma();
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
	public SobrePrograma() {
		setBounds(100, 100, 450, 300);

	}

}
