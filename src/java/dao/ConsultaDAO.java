/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import model.Consulta;

/**
 *
 * @author patrick
 */
public class ConsultaDAO{
    
    public void cadastrar(Consulta p) throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        
    }

    
    public void alterar(Consulta p) throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

    
    public void excluir(Long id) throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        Consulta p = em.find(Consulta.class,id);
        if(p!=null)
            em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    
    public List listarTodos() throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        TypedQuery<Consulta> consulta = em.createQuery("SELECT p FROM Consulta p",Consulta.class);
        List<Consulta> consultas = consulta.getResultList();
        em.close();
        return consultas;
    }

    
    public Consulta listarPorId(Long id) throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        Consulta p = em.find(Consulta.class, id);        
        em.close();
        return p;
    }

 }
