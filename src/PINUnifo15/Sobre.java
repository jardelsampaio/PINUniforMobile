package PINUnifo15;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;

public class Sobre extends JInternalFrame {
	private JButton btnSalvar;
	private JTextField tNome;
	private JTextField tSobreNome;
	private JTextField tData;
	private JTextField tSenha;
	private JTextField tCadastrarUsuario;
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnF;
	private JComboBox comboPerfilUsuario;
	private JTextField tObservacao;



	/**
	 * Create the frame.
	 */
	public Sobre() {
		setFrameIcon(new ImageIcon(Sobre.class.getResource("/img/edit.png")));
		setTitle("Sobre o usu\u00E1rio");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(0, 0, 921, 600);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.scrollbar);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cadastrar novo usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel painelBotoes = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
						.addComponent(painelBotoes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(painelBotoes, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(Sobre.class.getResource("/img/001_53.png")));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Sobre.class.getResource("/img/001_29.png")));
		GroupLayout gl_painelBotoes = new GroupLayout(painelBotoes);
		gl_painelBotoes.setHorizontalGroup(
			gl_painelBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelBotoes.createSequentialGroup()
					.addContainerGap(687, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addContainerGap())
		);
		gl_painelBotoes.setVerticalGroup(
			gl_painelBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelBotoes.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_painelBotoes.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		painelBotoes.setLayout(gl_painelBotoes);
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		
		JLabel lblSexo = new JLabel("Sexo:");
		
		rdbtnM = new JRadioButton("M");
		
		rdbtnF = new JRadioButton("F");
		
		tNome = new JTextField();
		tNome.setColumns(10);
		
		tSobreNome = new JTextField();
		tSobreNome.setColumns(10);
		
		tData = new JTextField();
		tData.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		
		tSenha = new JTextField();
		tSenha.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		
		JLabel lblExAbc = new JLabel("(dica de senha: abc123)");
		lblExAbc.setForeground(SystemColor.controlShadow);
		
		comboPerfilUsuario = new JComboBox();
		
		tCadastrarUsuario = new JTextField();
		tCadastrarUsuario.setColumns(10);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usu\u00E1rio:");
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		
		tObservacao = new JTextField();
		tObservacao.setColumns(10);
		
		JLabel lblopcional = new JLabel("(opcional)");
		lblopcional.setForeground(SystemColor.controlShadow);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(tObservacao, GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblObservao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblopcional))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNome)
									.addGap(12))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDataDeNascimento)
										.addComponent(lblSobrenome)
										.addComponent(lblUsurio)
										.addComponent(lblSenha)
										.addComponent(lblTipoDeUsurio))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(tSenha, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblExAbc))
										.addComponent(tCadastrarUsuario, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
										.addComponent(tSobreNome, 245, 245, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(tData, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSexo)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtnM)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnF))
										.addComponent(comboPerfilUsuario, 0, 245, Short.MAX_VALUE))
									.addGap(535))
								.addComponent(tNome, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tSobreNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSobrenome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo)
						.addComponent(rdbtnM)
						.addComponent(rdbtnF)
						.addComponent(tData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDataDeNascimento))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tCadastrarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsurio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblExAbc)
						.addComponent(tSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboPerfilUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoDeUsurio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblObservao)
						.addComponent(lblopcional))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tObservacao, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(129, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

	}
}
