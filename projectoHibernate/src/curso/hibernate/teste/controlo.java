/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.hibernate.teste;

import curso.hibernate.modelo.usuario1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Tonny
 */
public class controlo {
        EntityManagerFactory emf;
    EntityManager  em;
    
     public void remover(usuario1 a){
         em.getTransaction().begin();
        Query o = em.createNativeQuery("delete aluno from aluno where matricula="+a.getIdade());
        o.executeUpdate();
        em.getTransaction().commit();
        emf.close();
    }
}
