package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteCadastrar {

	public static void main(String[] args) {
		
		try {
			ClienteDAO dao = new ClienteDAO();
			Cliente objeto = new Cliente();
			objeto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo:")));
			objeto.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
			objeto.setCpf(JOptionPane.showInputDialog("Digite o seu CPF:"));
			objeto.setSenha(JOptionPane.showInputDialog("Digite a sua senha:"));
			int resultado = 0;
			resultado = dao.addCliente(objeto);
			if(resultado == 0) {
				System.out.println("N�o cadastrou");
			}else {
				System.out.println("Cadastrado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
