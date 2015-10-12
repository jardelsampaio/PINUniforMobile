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
import java.text.Normalizer.Form;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private Form form1;

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
		initComponentes();
		createEvents();
	}
	
	private void initComponentes(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicial.class.getResource("/img/UNIFOR_Logo_21.gif")));
		setBackground(Color.WHITE);
		setTitle("UniforOnline - Para desktops");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Exit.png")));
		mnArquivo.add(mnSair);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenu mnUsurio = new JMenu("Usu\u00E1rio");
		mnUsurio.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/People.png")));
		mnCadastrar.add(mnUsurio);
		
		JMenu mnNovoUsuario = new JMenu("Novo usuario");
		mnNovoUsuario.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Person.png")));
		mnUsurio.add(mnNovoUsuario);
		
		JMenu mnEditarUsurio = new JMenu("Editar usu\u00E1rio");
		mnEditarUsurio.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Redo.png")));
		mnUsurio.add(mnEditarUsurio);
		
		JMenu mnExcluirUsurio = new JMenu("Excluir usu\u00E1rio");
		mnExcluirUsurio.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Delete.png")));
		mnUsurio.add(mnExcluirUsurio);
		
		JMenu mnEvento = new JMenu("Evento");
		mnEvento.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Calendar.png")));
		mnCadastrar.add(mnEvento);
		
		JMenu mnNewMenu_1 = new JMenu("Novo");
		mnNewMenu_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Create.png")));
		mnEvento.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Editar");
		mnNewMenu_2.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Redo.png")));
		mnEvento.add(mnNewMenu_2);
		
		JMenu mnExcluir_1 = new JMenu("Excluir");
		mnExcluir_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Delete.png")));
		mnEvento.add(mnExcluir_1);
		
		JMenu mnEstabelecimento = new JMenu("Estabelecimento");
		mnEstabelecimento.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Company.png")));
		mnCadastrar.add(mnEstabelecimento);
		
		JMenu mnNovo = new JMenu("Novo");
		mnNovo.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Create.png")));
		mnEstabelecimento.add(mnNovo);
		
		JMenu mnEditar_1 = new JMenu("Editar");
		mnEditar_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Redo.png")));
		mnEstabelecimento.add(mnEditar_1);
		
		JMenu mnExcluir = new JMenu("Excluir");
		mnExcluir.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Delete.png")));
		mnEstabelecimento.add(mnExcluir);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
		
		JMenu mnNewMenu_3 = new JMenu("Usu\u00E1rios");
		mnNewMenu_3.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/People.png")));
		mnRelatrios.add(mnNewMenu_3);
		
		JMenu mnUsuriosAtivos = new JMenu("Usu\u00E1rios ativos");
		mnNewMenu_3.add(mnUsuriosAtivos);
		
		JMenu mnNewMenu_4 = new JMenu("Estabelecimento");
		mnNewMenu_4.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Company.png")));
		mnRelatrios.add(mnNewMenu_4);
		
		JMenu mnTodosEstabelecimentos = new JMenu("Todos estabelecimentos");
		mnNewMenu_4.add(mnTodosEstabelecimentos);
		
		JMenu mnNewMenu_5 = new JMenu("Eventos");
		mnNewMenu_5.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/Calendar.png")));
		mnRelatrios.add(mnNewMenu_5);
		
		JMenu mnMediaDeVisitante = new JMenu("Media de visitante");
		mnNewMenu_5.add(mnMediaDeVisitante);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenu mnUniforOnline = new JMenu("Unifor Online");
		mnSobre.add(mnUniforOnline);
		
		JMenu mnNewMenu = new JMenu("Vers\u00E3o do programa");
		mnSobre.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 894, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void createEvents(){
	}
}
