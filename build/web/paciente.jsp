<%@page import="model.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="controle.PacienteControle"%>
<%@page import="dao.PacienteDAO"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
          
        <title>Cadastro de Pacientes</title>
    </head>
    <body>
        <div class="container center">
        <div class="section center">     
            <div class="row center">
                <div class="col s12 m12">
                <div class="icon-block">
            
                <h5 class="center">Pacientes</h5>

                <form method="GET" action="cadPaciente.jsp">
                <% PacienteControle controle = new PacienteControle();
                    String id = request.getParameter("id");
                    Paciente r=null;
                   if(id!=null){
                       r = controle.listarPacientePorId(new Long(id));
                   
                %>
                    <div class="input-field col s12">
                        <input readonly value="<%=request.getParameter("id")%>" name="id" id="prependedInput" type="text" class="validate">
                        <label for="id">Número</label>
                    </div>
                <%}%>
                <div class="input-field col s12">
                    <input id="prependedInput" name="nome" type="text" class="validate" placeholder="Nome" value="<%=r!=null?r.getNome():""%>">
                    
                </div>
                    
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="endereco" placeholder="Digite o endereço" class="materialize-textarea"><%=r!=null?r.getEndereco():""%></textarea>
               </div>
                
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="celular" placeholder="Digite o celular" class="materialize-textarea"><%=r!=null?r.getCelular():""%></textarea>
                </div>
                    
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="email" placeholder="Digite o email" class="materialize-textarea"><%=r!=null?r.getEmail():""%></textarea>
                </div>
                
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="tiposanguineo" placeholder="Digite o tipo sanguineo" class="materialize-textarea"><%=r!=null?r.getTiposanguineo():""%></textarea>
                </div>
                
                <div class="input-field col s12">
                    <textarea id="prependedInput" name="fatorsanguineo" placeholder="Digite o fator sanguineo" class="materialize-textarea"><%=r!=null?r.getFator():""%></textarea>
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
                    <h5 class="center">Pacientes cadastrados</h5>
                    <table class="centered">
                    <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Endereço</th>
                        <th>Celular</th>
                        <th>e-mail</th>
                        <th>Tipo sanguineo</th>
                        <th>Fator sanguineo</th>
                    </tr>
                    </thead>

                    <tbody> 
                    <% 
                       List pacientes = controle.listarPacientes();
                       for(Object o: pacientes){
                           Paciente paciente = (Paciente) o;
                       
                    %>
                    <tr>
                        <td><%=paciente.getNome()%></td>
                        <td><%=paciente.getEndereco()%></td>
                        <td><%=paciente.getCelular()%></td>
                        <td><%=paciente.getEmail()%></td>
                        <td><%=paciente.getTiposanguineo()%></td>
                        <td><%=paciente.getFator()%></td>
                        <td><a href="remPaciente.jsp?id=<%=paciente.getId()%>"><i class="material-icons">delete</i></a>
                            <a href="paciente.jsp?id=<%=paciente.getId()%>"><i class="material-icons">create</i></a></td>
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
      </body>
</html>
