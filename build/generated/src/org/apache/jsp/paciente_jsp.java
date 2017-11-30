package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Paciente;
import java.util.List;
import controle.PacienteControle;
import dao.PacienteDAO;

public final class paciente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("          \n");
      out.write("        <title>Cadastro de Pacientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container center\">\n");
      out.write("        <div class=\"section center\">     \n");
      out.write("            <div class=\"row center\">\n");
      out.write("                <div class=\"col s12 m12\">\n");
      out.write("                <div class=\"icon-block\">\n");
      out.write("            \n");
      out.write("                <h5 class=\"center\">Pacientes</h5>\n");
      out.write("\n");
      out.write("                <form method=\"GET\" action=\"cadPaciente.jsp\">\n");
      out.write("                ");
 PacienteControle controle = new PacienteControle();
                    String id = request.getParameter("id");
                    Paciente r=null;
                   if(id!=null){
                       r = controle.listarPacientePorId(new Long(id));
                   
                
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <input readonly value=\"");
      out.print(request.getParameter("id"));
      out.write("\" name=\"id\" id=\"prependedInput\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"id\">Número</label>\n");
      out.write("                    </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <input id=\"prependedInput\" name=\"nome\" type=\"text\" class=\"validate\" placeholder=\"Nome\" value=\"");
      out.print(r!=null?r.getNome():"");
      out.write("\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"endereco\" placeholder=\"Digite o endereço\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getEndereco():"");
      out.write("</textarea>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"celular\" placeholder=\"Digite o celular\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getCelular():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"email\" placeholder=\"Digite o email\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getEmail():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"tiposanguineo\" placeholder=\"Digite o tipo sanguineo\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getTiposanguineo():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"fatorsanguineo\" placeholder=\"Digite o fator sanguineo\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getFator():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input col s12\">\n");
      out.write("                 <button class=\"btn waves-effect waves-light red\" type=\"submit\" name=\"gravar\">Cadastrar\n");
      out.write("                        <i class=\"material-icons right\">add</i>\n");
      out.write("                 </button>\n");
      out.write("                <button class=\"btn waves-effect waves-light\" type=\"reset\" name=\"limpar\">Limpar\n");
      out.write("                        <i class=\"material-icons right\">clear</i>\n");
      out.write("                 </button>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col s18 m12\">\n");
      out.write("                <div class=\"icon-block\">\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <h5 class=\"center\">Pacientes cadastrados</h5>\n");
      out.write("                    <table class=\"centered\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nome</th>\n");
      out.write("                        <th>Endereço</th>\n");
      out.write("                        <th>Celular</th>\n");
      out.write("                        <th>e-mail</th>\n");
      out.write("                        <th>Tipo sanguineo</th>\n");
      out.write("                        <th>Fator sanguineo</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody> \n");
      out.write("                    ");
 
                       List pacientes = controle.listarPacientes();
                       for(Object o: pacientes){
                           Paciente paciente = (Paciente) o;
                       
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(paciente.getNome());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(paciente.getEndereco());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(paciente.getCelular());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(paciente.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(paciente.getTiposanguineo());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(paciente.getFator());
      out.write("</td>\n");
      out.write("                        <td><a href=\"remPaciente.jsp?id=");
      out.print(paciente.getId());
      out.write("\"><i class=\"material-icons\">delete</i></a>\n");
      out.write("                            <a href=\"paciente.jsp?id=");
      out.print(paciente.getId());
      out.write("\"><i class=\"material-icons\">create</i></a></td>\n");
      out.write("                    </tr>          \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br><br>\n");
      out.write("  </div>\n");
      out.write("      </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
