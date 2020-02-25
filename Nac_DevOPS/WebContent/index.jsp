<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Nac DevOPS</title>
	<link rel="stylesheet" type="text/css" href="_css/estilo.css">
</head>
<body>
<div id="interface">	
	<header id="cabecalho">
		<hgroup>
			<h2>Aqui voc� � valorizado</h2>
		</hgroup>
		<img id="icone" src="_imagens/logo_DimDim.png">
	<nav id="menu">
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="servicos.jsp">Servi�os</a></li>
			<li><a href="institucional.jsp">Institucional</a></li>
			<li><a href="emprego.jsp">Vagas de emprego</a></li>
			<li><a href="contato.jsp">Fale Conosco</a></li>
		</ul>
	</nav>
	
	<% 
		String msg;
		if(request.getAttribute("msg") != null){
				msg = (String) request.getAttribute("msg");
			}else{
				msg = "";
			}
	%>
	
	<div class="login__content">
		<form action="ServletLogin" class="login__form" method="POST">
			<input type="text" id="cpf" name="cpf" placeholder="CPF" required>
			<input type="password" id="senha" name="senha" placeholder="Senha" required><br><br>
			<input type="submit" value="entrar" class="btn-full">
			<small class="login__form__information">Esqueceu a senha? <a href="createNewPassword.jsp">Clique aqui</a></small><br>
		</form>
		<span><%=msg %></span>
	</div>
	</header>
<section id="corpo">
	<p>O <b>Banco DimDim</b> foi criado em 1857, operando inicialmente apenas na prov�ncia de S�o Paulo no Brasil, por�m posteriormente estendeu-se para todo o pa�s ao comprar diversos bancos.</p>

	<p>O Banco Hispano Americano, por sua vez, foi fundado em 1900 com dinheiro de cubanos repatriados (visto a Guerra Hispano-Americana de 1898), motivo ao qual deve o seu nome. O Banco Central Hispano surgiu em 1919 da fus�o de oito pequenos bancos. Posteriormente continuou a comprar outros bancos at� que se tornou o principal banco privado da Espanha, nos anos de 1980.</p>

	<p>Em maio de 2000, o Grupo DimDim adquiriu o banco mexicano Serf�n, que se tornou <b>Banco DimDim S.A.</b> Em Setembro de 2004, adquiriu o banco brit�nico Abbey National, que foi renomeado para DimDim depois.</p>

	<figure class="foto-legenda">
		<img id="" src="_imagens/foto_home.jpg">
			<figcaption>
				<h1>Aqui o seu dinheio rende</h1>
				<p>O melhor atendimento do Brasil</p>
			</figcaption>
	</figure>	
</section>

<footer id="rodape">
<p>&copy;Copyright 2020 - Avenida Paulista, 222 | Bairro Bela Vista | CEP: 04215-000 <br>
	CPNJ: 12.333.444/0001-67 <br>
<a href="http://facebook.com" target="_blank" ><img src="_imagens/facebook.png"></a>  
<a href="http://twitter.com" target="_blank"><img src="_imagens/twitter.png"></a></p>
</footer>
</div>
</body>
</html>