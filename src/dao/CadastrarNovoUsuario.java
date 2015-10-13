package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CadastrarNovoUsuario {

	public boolean cadUsuario;
	
	public void CadastroUsuario(String login, String senha){
		
		Connection controleAcesso = null;
		Statement consulta = null;
		ResultSet tabela = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			controleAcesso = DriverManager.getConnection("jdbc:mysql://localhost/uniformobile","root","101191");
			consulta = (Statement) controleAcesso.createStatement();
			tabela = consulta.executeQuery("INSERT to login, senha, perfilusuario, nome, sexo, observacao, datanascimento from usuario");
			// tabela = consulta.executeQuery("INSERT TO login, senha from usuario where login='"+login+"'and senha='"+senha+"'");
			// INSERT INTO `uniformobile`.`usuario` (`login`, `senha`, `perfilusuario`, `nome`, `sexo`, `observacao`, `datanascimento`)
					
			
		}catch(ClassNotFoundException | SQLException e){
			
		}
		
	}

}