/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2020-02-25 00:58:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emprego_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>Nac DevOPS</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"_javascript/funcoes.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"interface\">\t\r\n");
      out.write("\t<header id=\"cabecalho\">\r\n");
      out.write("\t\t<hgroup>\r\n");
      out.write("\t\t\t<h2>Aqui você é valorizado</h2>\r\n");
      out.write("\t\t</hgroup>\r\n");
      out.write("\t\t<img id=\"icone\" src=\"_imagens/logo_DimDim.png\">\r\n");
      out.write("\t\t<img id=\"icone_2\" src=\"_imagens/emprego.png\">\r\n");
      out.write("\t<nav id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li onmouseover=\"mudaFoto('_imagens/home.png')\"\r\n");
      out.write("\t\t\tonmouseout=\"mudaFoto('_imagens/emprego.png')\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t<li onmouseover=\"mudaFoto('_imagens/especificacoes.png')\"\r\n");
      out.write("\t\t\tonmouseout=\"mudaFoto('_imagens/emprego.png')\"><a href=\"servicos.jsp\">Serviços</a></li>\r\n");
      out.write("\t\t\t<li onmouseover=\"mudaFoto('_imagens/inst.jpg')\"\r\n");
      out.write("\t\t\tonmouseout=\"mudaFoto('_imagens/emprego.png')\"><a href=\"institucional.jsp\">Institucional</a></li>\r\n");
      out.write("\t\t\t<li onmouseover=\"mudaFoto('_imagens/emprego.png')\"\r\n");
      out.write("\t\t\tonmouseout=\"mudaFoto('_imagens/emprego.png')\"><a href=\"emprego.jsp\">Vagas de emprego</a></li>\r\n");
      out.write("\t\t\t<li onmouseover=\"mudaFoto('_imagens/contato.png')\"\r\n");
      out.write("\t\t\tonmouseout=\"mudaFoto('_imagens/emprego.png')\"><a href=\"contato.jsp\">Fale Conosco</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("<section id=\"corpo\">\r\n");
      out.write("\t\r\n");
      out.write("\t<p>O <b>Banco DimDim</b> foi criado em 1857, operando inicialmente apenas na província de São Paulo no Brasil, porém posteriormente estendeu-se para todo o país ao comprar diversos bancos.</p>\r\n");
      out.write("\r\n");
      out.write("\t<p>O Banco Hispano Americano, por sua vez, foi fundado em 1900 com dinheiro de cubanos repatriados (visto a Guerra Hispano-Americana de 1898), motivo ao qual deve o seu nome. O Banco Central Hispano surgiu em 1919 da fusão de oito pequenos bancos. Posteriormente continuou a comprar outros bancos até que se tornou o principal banco privado da Espanha, nos anos de 1980.</p>\r\n");
      out.write("\r\n");
      out.write("\t<p>Em maio de 2000, o Grupo DimDim adquiriu o banco mexicano Serfín, que se tornou <b>Banco DimDim S.A.</b> Em Setembro de 2004, adquiriu o banco britânico Abbey National, que foi renomeado para DimDim depois.</p>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer id=\"rodape\">\r\n");
      out.write("<p>&copy;Copyright 2020 - Avenida Paulista, 222 | Bairro Bela Vista | CEP: 04215-000 <br>\r\n");
      out.write("\tCPNJ: 12.333.444/0001-67 <br>\r\n");
      out.write("<a href=\"http://facebook.com\" target=\"_blank\" ><img src=\"_imagens/facebook.png\"></a>  \r\n");
      out.write("<a href=\"http://twitter.com\" target=\"_blank\"><img src=\"_imagens/twitter.png\"></a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}