package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.bean.Cliente;
import br.com.fiap.conexao.Conexao;

public class ClienteDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public ClienteDAO()throws Exception{
		con = new Conexao().conectar();
	}
	
	public void close()throws Exception{
		con.close();
	}
	
	public int addCliente(Cliente objeto)throws Exception{
		stmt = con.prepareStatement("INSERT INTO TB_CLIENTE(CD_CLIENTE,NM_NOME,NR_CPF,DS_SENHA)VALUES(?,?,?,?)");
		stmt.setInt(1, objeto.getCodigo());
		stmt.setString(2, objeto.getNome());
		stmt.setString(3, objeto.getCpf());
		stmt.setString(4, objeto.getSenha());
		return stmt.executeUpdate();
	}
	
	public Cliente getCliente(int codigo)throws Exception{
		stmt = con.prepareStatement("SELECT * FROM TB_CLIENTE WHERE CD_CLIENTE = ?");
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if(rs.next()) {
			return new Cliente(
							rs.getInt("CD_CLIENTE"),
							rs.getString("NM_NOME"),	
							rs.getString("NR_CPF"),
							rs.getString("DS_SENHA")
							);
		}else {
			return new Cliente();
		}
	}
	
	public boolean validarLoginCliente(String cpf, String senha) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM TB_CLIENTE WHERE NR_CPF=? AND DS_SENHA=?");
		stmt.setString(1, cpf);
		stmt.setString(2, senha);
		rs = stmt.executeQuery();
			return rs.next();
		
	}

}