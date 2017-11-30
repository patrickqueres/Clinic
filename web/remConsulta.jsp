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
            
            String id = request.getParameter("id");
            if(id!=null){
                controle.remover(new Long(id));
            }
            
            
            response.sendRedirect("consulta.jsp");
        %>
    </body>
</html>
