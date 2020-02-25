<div class="menu">
<ul>
<li><a class="btn-crud" href="index.jsp">Home</a></li>
<li><a class="btn-crud" href="clienteServlet?acao=carregar">Cadastrar</a></li>
<li><a class="btn-crud" href="clienteServlet?acao=listar">Listar</a></li>
<li class="dir"><a class="btn-crud" href="Logar?acao=deslogar">Deslogar</a></li>
<li class="dir nome"><span>Usuário: <%= session.getAttribute("nome") %></span></li>
</ul>
</div>