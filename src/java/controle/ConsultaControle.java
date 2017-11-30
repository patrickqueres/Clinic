/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ConsultaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JList;
import model.Consulta;

/**
 *
 * @author patrick
 */
public class ConsultaControle {
    
    public void gravar(Consulta p) throws SQLException{
        
        if(p.getId()==null){
        
            cadastrar(p);
            
        }else{
            alterar(p);
        
        }
    }
    private void cadastrar(Consulta p) throws SQLException{
        ConsultaDAO dao = new ConsultaDAO();
        dao.cadastrar(p);
        
        
    }
    public void remover(Long id) throws SQLException{
        ConsultaDAO dao = new ConsultaDAO();
        dao.excluir(id);
        
        
    }
    private void alterar(Consulta p) throws SQLException{
        ConsultaDAO dao = new ConsultaDAO();
        dao.alterar(p);
        
    }
    public List listarConsultas() throws SQLException{
        ConsultaDAO dao = new ConsultaDAO();        
        return dao.listarTodos();
        
    }
    public Consulta listarConsultaPorId(Long id) throws SQLException{
        ConsultaDAO dao = new ConsultaDAO();        
        return dao.listarPorId(id);
        
    }

        
}