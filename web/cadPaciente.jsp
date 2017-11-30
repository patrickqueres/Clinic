<%@page import="model.Paciente"%>
<%@page import="controle.PacienteControle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            PacienteControle controle= new PacienteControle();
            Paciente paciente= new Paciente();
            String id = request.getParameter("id");
            System.out.println("id:"+id);
            if(id!=null){
                paciente.setId(new Long(id));
            }
            paciente.setNome(request.getParameter("nome"));
            paciente.setEndereco(request.getParameter("endereco"));
            paciente.setCelular(request.getParameter("celular"));
            paciente.setEmail(request.getParameter("email"));
            paciente.setTiposanguineo(request.getParameter("tiposanguineo"));
            paciente.setFator(request.getParameter("fatorsanguineo"));
            
            
            controle.gravar(paciente);
            response.sendRedirect("paciente.jsp");
            
        %>
    </body>
</html>
