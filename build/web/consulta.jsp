<%@page import="controle.PacienteControle"%>
<%@page import="model.Paciente"%>
<%@page import="model.Consulta"%>
<%@page import="java.util.List"%>
<%@page import="controle.ConsultaControle"%>
<%@page import="dao.ConsultaDAO"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
        <title>Cadastro de Consultas</title>
    </head>
    <body>
        <div class="container center">
        <div class="section center">     
            <div class="row center">
                <div class="col s12 m12">
                <div class="icon-block">
            
                <h5 class="center">Consultas</h5>

                <form method="GET" action="cadConsulta.jsp">
                <% ConsultaControle controle = new ConsultaControle();
                PacienteControle controlePaciente = new PacienteControle();
                    String id = request.getParameter("id");
                    Consulta r=null;
                   if(id!=null){
                       r = controle.listarConsultaPorId(new Long(id));
                   
                %>
                    <div class="input-field col s12">
                        <input readonly value="<%=request.getParameter("id")%>" name="id" id="prependedInput" type="text" class="validate">
                        <label for="id">Número</label>
                    </div>
                <%}%>
                
                <div class="input-field col s12">
                    <select name="paciente">
                      <option value="" disabled>   Selecione o paciente</option>
                      <% 
                        List<Paciente> pacientes = controlePaciente.listarPacientes();
                        for(Paciente p : pacientes){%>
                      %>
                      <option value="<%=p.getId()%>" <%=r!=null&&r.getPaciente().getId() == p.getId()?"selected":" "%>><%=p.getNome()%></option>                            
                      <%}%>
                    </select>
                </div>
                    
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="dataconsulta" placeholder="Digite a data da consulta" class="materialize-textarea"><%=r!=null?r.getData():""%></textarea>
               </div>
                
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="relato" placeholder="Digite o relato do paciente" class="materialize-textarea"><%=r!=null?r.getRelato():""%></textarea>
                </div>
                    
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="medicacao" placeholder="Digite a medicação prescrita" class="materialize-textarea"><%=r!=null?r.getMedicao():""%></textarea>
                </div>
                
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="exames" placeholder="Digite os exames solicitados" class="materialize-textarea"><%=r!=null?r.getExames():""%></textarea>
                </div>
                
                    
                <div class="input col s12">
                 <button class="btn waves-effect waves-light red" type="submit" name="gravar">Cadastrar
                        <i class="material-icons right">add</i>
                 </button>
                <button class="btn waves-effect waves-light" type="reset" name="limpar">Limpar
                        <i class="material-icons right">clear</i>
                 </button>
                </div>
                </form>
                </div>
                </div>
                
                <div class="col s18 m12">
                <div class="icon-block">
                    <br><br><br>
                    <h5 class="center">Consultas cadastrados</h5>
                    <table class="centered">
                    <thead>
                    <tr>
                        <th>Paciente</th>
                        <th>Data da consulta</th>
                        <th>Relatos</th>
                        <th>Medicação</th>
                        <th>Exames solicitados</th>
                        
                    </tr>
                    </thead>

                    <tbody> 
                    <% 
                       List consultas = controle.listarConsultas();
                       for(Object o: consultas){
                           Consulta consulta = (Consulta) o;
                       
                    %>
                    <tr>
                        <td><%=consulta.getPaciente().getNome() %></td>
                        <td><%=consulta.getData()%></td>
                        <td><%=consulta.getRelato()%></td>
                        <td><%=consulta.getMedicao()%></td>
                        <td><%=consulta.getExames()%></td>
                        
                        <td><a href="remConsulta.jsp?id=<%=consulta.getId()%>"><i class="material-icons">delete</i></a>
                            <a href="consulta.jsp?id=<%=consulta.getId()%>"><i class="material-icons">create</i></a></td>
                    </tr>          
                    <%}%>
                    </tbody>
                    </table>
            
            
                </div>
                </div>

        
      </div>

    </div>
    <br><br>
  </div>
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="materialize.js"></script>
    <script type="text/javascript">//<![CDATA[
        window.onload=function(){
        $(document).ready(function() {
            $('select').material_select();
        });
        }//]]> 
</script>
      </body>
</html>
