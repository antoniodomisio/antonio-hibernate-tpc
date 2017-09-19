/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.hibernate.modelo;

import java.beans.Transient;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




/**
 *
 * @author Tonny
 */

@Entity
public class usuario1 {
    @Id
    @GeneratedValue
    //o @ GeneratedValue e usado quando o id e incrementado
    //ou seja o usuario nao precisa de introduzir o codigo
    private Integer id;
    private String nome;
    private Date dataNascimento;
     private Integer idade;
     private EstadoCivil estadocivil;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //@ transient quer dizer que a idade nao vai ser guardada no banco de dados
   @Transient
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }
     

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
    
    
}
