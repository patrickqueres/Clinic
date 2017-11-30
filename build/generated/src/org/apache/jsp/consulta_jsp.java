package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controle.PacienteControle;
import model.Paciente;
import model.Consulta;
import java.util.List;
import controle.ConsultaControle;
import dao.ConsultaDAO;

public final class consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("        <title>Cadastro de Consultas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container center\">\n");
      out.write("        <div class=\"section center\">     \n");
      out.write("            <div class=\"row center\">\n");
      out.write("                <div class=\"col s12 m12\">\n");
      out.write("                <div class=\"icon-block\">\n");
      out.write("            \n");
      out.write("                <h5 class=\"center\">Consultas</h5>\n");
      out.write("\n");
      out.write("                <form method=\"GET\" action=\"cadConsulta.jsp\">\n");
      out.write("                ");
 ConsultaControle controle = new ConsultaControle();
                PacienteControle controlePaciente = new PacienteControle();
                    String id = request.getParameter("id");
                    Consulta r=null;
                   if(id!=null){
                       r = controle.listarConsultaPorId(new Long(id));
                   
                
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
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <select name=\"paciente\">\n");
      out.write("                      <option value=\"\" disabled>   Selecione o paciente</option>\n");
      out.write("                      ");
 
                        List<Paciente> pacientes = controlePaciente.listarPacientes();
                        for(Paciente p : pacientes){
      out.write("\n");
      out.write("                      %>\n");
      out.write("                      <option value=\"");
      out.print(p.getId());
      out.write('"');
      out.write(' ');
      out.print(r!=null&&r.getPaciente().getId() == p.getId()?"selected":" ");
      out.write('>');
      out.print(p.getNome());
      out.write("</option>                            \n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"dataconsulta\" placeholder=\"Digite a data da consulta\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getData():"");
      out.write("</textarea>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"relato\" placeholder=\"Digite o relato do paciente\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getRelato():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"medicacao\" placeholder=\"Digite a medicação prescrita\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getMedicao():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <textarea id=\"prependedInput\" name=\"exames\" placeholder=\"Digite os exames solicitados\" class=\"materialize-textarea\">");
      out.print(r!=null?r.getExames():"");
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
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
      out.write("                    <h5 class=\"center\">Consultas cadastrados</h5>\n");
      out.write("                    <table class=\"centered\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Paciente</th>\n");
      out.write("                        <th>Data da consulta</th>\n");
      out.write("                        <th>Relatos</th>\n");
      out.write("                        <th>Medicação</th>\n");
      out.write("                        <th>Exames solicitados</th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody> \n");
      out.write("                    ");
 
                       List consultas = controle.listarConsultas();
                       for(Object o: consultas){
                           Consulta consulta = (Consulta) o;
                       
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(consulta.getPaciente().getNome() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(consulta.getData());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(consulta.getRelato());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(consulta.getMedicao());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(consulta.getExames());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                        <td><a href=\"remConsulta.jsp?id=");
      out.print(consulta.getId());
      out.write("\"><i class=\"material-icons\">delete</i></a>\n");
      out.write("                            <a href=\"consulta.jsp?id=");
      out.print(consulta.getId());
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
      out.write("    <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("    <script src=\"materialize.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">//<![CDATA[\n");
      out.write("        window.onload=function(){\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('select').material_select();\n");
      out.write("        });\n");
      out.write("        }//]]> \n");
      out.write("</script>\n");
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
