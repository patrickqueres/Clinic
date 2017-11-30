<%@page import="model.Paciente"%>
<%@page import="controle.PacienteControle"%>
<%@page import="model.Consulta"%>
<%@page import="controle.ConsultaControle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ConsultaControle controle= new ConsultaControle();
            PacienteControle controlePaciente = new PacienteControle();
            
            Consulta consulta= new Consulta();
            String id = request.getParameter("id");
            System.out.println("id:"+id);
            if(id!=null){
                consulta.setId(new Long(id));
            }
            
            String idPaciente = request.getParameter("paciente");
            Paciente paciente = controlePaciente.listarPacientePorId(new Long(idPaciente));
            consulta.setPaciente(paciente);
            
            consulta.setData(request.getParameter("dataconsulta"));
            consulta.setRelato(request.getParameter("relato"));
            consulta.setMedicao(request.getParameter("medicacao"));
            consulta.setExames(request.getParameter("exames"));
            
            
            controle.gravar(consulta);
            response.sendRedirect("consulta.jsp");
            
        %>
    </body>
</html>
