package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.TextArea;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.factories.DefaultComponentFactory;


import dao.Acesso;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PINUnifor15 {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

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
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setBounds(261, 203, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(261, 231, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(318, 200, 201, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(318, 228, 201, 20);
		frame.getContentPane().add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso cl = new Acesso();
				cl.Acesso(txtUsuario.getText(),txtSenha.getText());
				if(cl.acesso == true){
					TelaInicial tl = new TelaInicial();
					tl.show();
					tl.setExtendedState(new TelaInicial().MAXIMIZED_BOTH);
					dispose();
					}
				if(cl.acesso == false){
					txtUsuario.setText("");
					txtSenha.setText("");
					txtUsuario.requestFocus();
				}
				cl.acesso = false;
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(277, 256, 242, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("|");
		label.setBounds(422, 287, 75, 14);
		frame.getContentPane().add(label);
		
		JLabel lblReportarErro = new JLabel("reportar erro");
		lblReportarErro.setBounds(432, 287, 65, 14);
		frame.getContentPane().add(lblReportarErro);
	}
}
