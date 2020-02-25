package br.com.fiap.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.dao.ClienteDAO;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClienteDAO clienteDAO = null;
       
	HttpSession session;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		session = request.getSession();
		
		System.out.println(cpf);
		System.out.println(senha);
		
		try {
			ClienteDAO dao = new ClienteDAO();
			if(dao.validarLoginCliente(cpf, senha) == true) {
				session.setAttribute("nome", dao.getCliente(1).getNome());
				response.sendRedirect("contato.jsp");
			}else {
				request.setAttribute("msg"," CPF ou senha inválidos!");
				request.getRequestDispatcher("index.jsp").forward(request,response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
