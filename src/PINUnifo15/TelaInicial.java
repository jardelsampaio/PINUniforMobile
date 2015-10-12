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
	private JDesktopPane desktopPane;
	private JButton btnNewButton;
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
		mnSair.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/001_29.png")));
		mnArquivo.add(mnSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenu mnUniforOnline = new JMenu("Unifor Online");
		mnUniforOnline.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/001_40.png")));
		mnSobre.add(mnUniforOnline);
		
		JMenu mnNewMenu = new JMenu("Vers\u00E3o do programa");
		mnNewMenu.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/001_33.png")));
		mnSobre.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("CheckBox.background"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(desktopPane)
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(desktopPane)
					.addContainerGap())
		);
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 874, Short.MAX_VALUE)
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 468, Short.MAX_VALUE)
		);
		desktopPane.setLayout(gl_desktopPane);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnNewButton.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/001_54.png")));
		toolBar.add(btnNewButton);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void createEvents(){
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Parei nessa parte do vídeo https://youtu.be/TUL3qEoZkR4?list=PLOWSuMndobuYQPttmTBByksBWtONmxPA1&t=1659
			}
		});
	}
}
