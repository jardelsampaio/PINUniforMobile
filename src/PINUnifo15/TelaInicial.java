package PINUnifo15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setBackground(Color.WHITE);
		setTitle("UniforOnline - Para desktops");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.setBounds(10, 11, 120, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("USU\u00C1RIOS");
		btnNewButton_1.setBounds(10, 45, 120, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EVENTOS");
		btnNewButton_2.setBounds(10, 79, 120, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("RELAT\u00D3RIOS");
		btnNewButton_3.setBounds(10, 113, 120, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnTorpedo = new JButton("TORPEDO");
		btnTorpedo.setBounds(10, 214, 120, 29);
		contentPane.add(btnTorpedo);
		
		JButton btnContato = new JButton("CONTATO");
		btnContato.setBounds(10, 180, 120, 29);
		contentPane.add(btnContato);
		
		JButton btnFinanceiro = new JButton("FINANCEIRO");
		btnFinanceiro.setBounds(10, 146, 120, 29);
		contentPane.add(btnFinanceiro);
		
		JButton btnSairDoSistema = new JButton("SAIR");
		btnSairDoSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairDoSistema.setBounds(10, 521, 120, 29);
		contentPane.add(btnSairDoSistema);
		
		JLabel lblNewLabel = new JLabel("Unifor Online - Bem vindo");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 32));
		lblNewLabel.setBounds(152, 11, 427, 47);
		contentPane.add(lblNewLabel);
	}
}
