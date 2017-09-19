/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.hibernate.teste;

import curso.hibernate.modelo.Endereco;
import curso.hibernate.modelo.EstadoCivil;
import curso.hibernate.modelo.usuario2;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tonny
 */
public class usuarioTeste {
    
    
    public static void main(String [] args){
        
        usuario2 usu=new usuario2();
     //  usu.setId(3);
        usu.setNome("Antonio Elton Domisio");
        usu.setDataNascimento( new Date());
        usu.setIdade(30);
        usu.setEstadocivil(EstadoCivil.CASSADO);
        
//            Endereco endereco=new Endereco();
//            endereco.setLogadouro("Rua teste");
//            endereco.setNumero(123);
//            endereco.setCidade("Maputo");
            
        //    usu.setEndereco(endereco);
        
            
//                 Endereco enderecoComercial=new Endereco();
//            enderecoComercial.setLogadouro("Rua Filipe Samuel Magaia");
//            enderecoComercial.setNumero(1129);
//            enderecoComercial.setCidade("Maputo");
        
   SessionFactory factory=new Configuration().configure().buildSessionFactory();
   
   Session session= factory.openSession();
   session.beginTransaction();
   session.save(usu);
   session.getTransaction().commit();
   session.close();
}
}