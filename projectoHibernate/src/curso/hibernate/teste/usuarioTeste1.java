/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.hibernate.teste;

import curso.hibernate.modelo.EstadoCivil;
import curso.hibernate.modelo.usuario1;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tonny
 */
public class usuarioTeste1 {

    public static void main(String[] args) {
        
        usuario1 usu=new usuario1();
        usu.setNome("Dom Antonio Martinho");
        usu.setDataNascimento(new Date());
        usu.setEstadocivil(EstadoCivil.SOLTEIRO);
        usu.setIdade(20);
  
  SessionFactory factory=new Configuration().configure().buildSessionFactory();
  Session session= factory.openSession();
  session.beginTransaction();
  // session.save(usu);
  usu = (usuario1) session.get(usuario1.class,2);
  usu.setNome("Antonio");
 
//   session.delete(usu);
  session.update(usu);
   //session.delete("Domisio Antonio Martinho", usu);
   session.getTransaction().commit();
   session.close();
//sess
    }
}
