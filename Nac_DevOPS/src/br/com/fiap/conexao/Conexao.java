package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection conectar()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM83752","210683");
	}

}
