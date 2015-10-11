package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class PINUnifor15 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PINUnifor15 window = new PINUnifor15();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PINUnifor15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnTeste = new JButton("TESTE1");
		frame.getContentPane().add(btnTeste, BorderLayout.WEST);
		
		JButton btnTeste_1 = new JButton("TESTE2");
		frame.getContentPane().add(btnTeste_1, BorderLayout.SOUTH);
	}

}