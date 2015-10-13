package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class RelatorioEstabelecimentosRentaveis extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioEstabelecimentosRentaveis frame = new RelatorioEstabelecimentosRentaveis();
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
	public RelatorioEstabelecimentosRentaveis() {
		setBounds(100, 100, 450, 300);

	}

}
