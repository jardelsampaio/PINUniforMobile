package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class RelatorioEstatisticaUsuario extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioEstatisticaUsuario frame = new RelatorioEstatisticaUsuario();
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
	public RelatorioEstatisticaUsuario() {
		setBounds(100, 100, 450, 300);

	}

}
