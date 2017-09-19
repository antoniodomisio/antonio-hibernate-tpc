/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.hibernate.modelo;


import java.util.*;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Transient;

/**
 *
 * @author Tonny
 */

//@Entity(name="hibernate")

public class usuario2 {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
 // @Temporal(TemporalType.DATE)
  private Date dataNascimento;
//@Transient
 private Integer idade;
//@Enumerated(EnumType.STRING)
 private EstadoCivil estadocivil;
//@Embedded
//@AttributeOverrides({
//    @AttributeOverride(name=" logadouro",column=@Column(name="rua"))
//})
 //   private Endereco endereco;
//    private Endereco enderecoComercial;
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
     //@Embedded
// @AttributeOverrides({
//    @AttributeOverride(name=" logadouro",column=@Column(name="log")),
//    @AttributeOverride(name=" cidade",column=@Column(name="cid")),
//  @AttributeOverride(name="numero",column=@Column(name="num"))
//})
 //   private Endereco enderecoComercial;
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
    
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
//@Temporal(TemporalType.DATE)
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
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
//  //@Embedded
////  @AttributeOverrides({
////     @AttributeOverride(name="logadouro",column=(name="rua"))
////  })
//    @Embedded
//@AttributeOverrides({
//    @AttributeOverride(name=" logadouro",column=@Column(name="rua"))
//})
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//    @Embedded
//    public Endereco getEnderecoComercial() {
//        return enderecoComercial;
//    }
//
//    public void setEnderecoComercial(Endereco enderecoComercial) {
//        this.enderecoComercial = enderecoComercial;
//    }
//    
//    
// @Embedded
// @AttributeOverrides({
//    @AttributeOverride(name=" logadouro",column=@Column(name="log")),
//    @AttributeOverride(name=" cidade",column=@Column(name="cid")),
//  @AttributeOverride(name="numero",column=@Column(name="num"))
//})
//    public Endereco getEnderecoComercial() {
//        return enderecoComercial;
//    }
//
//    public void setEnderecoComercial(Endereco enderecoComercial) {
//        this.enderecoComercial = enderecoComercial;
//    }
    
    
}
