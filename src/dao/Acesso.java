package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.*;

import javax.swing.JOptionPane;

public class Acesso {

	public boolean acesso;
	
	public void Acesso(String login, String senha){
		
		Connection controledeAcesso = null;
		Statement consulta = null;
		ResultSet tabela = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			controledeAcesso = DriverManager.getConnection("jdbc:mysql://localhost/uniformobile","root","101191");
			
			consulta = (Statement) controledeAcesso.createStatement();
			tabela = ((java.sql.Statement) consulta).executeQuery("select login,senha from usuario where login='"+login+"'and senha="+senha+"'");
			
			if (tabela.next()){
				JOptionPane.showMessageDialog(null, "Usuário e senha corretas");
				acesso= true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuário e senha incorretas");
				acesso= false;
			}			
		} catch(ClassNotFoundException | SQLException e){
		}
}

}