/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.util.Objects;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pessoa implements Comparable<Pessoa> {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 15, nullable = false)
    private String CPF;
    @Column(length = 15, nullable = false)
    private String RG;
    @Column(length = 15, nullable = false)
    private String telefone;
    @Column(length = 100, nullable = false)
    private String endereco;
    @Column(length = 15, nullable = false)
    private String numero;
    @ManyToOne
    private Cidade cidade;
    

    
    
     

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    public boolean equals(Object obj) {
        final Pessoa other = (Pessoa) obj;
        if( obj == null){
            return false;
        }
        if( getClass() != obj.getClass()){
            return false;
        }
        if(!Objects.equals(this.nome, other.nome)){
            return false;
        }
            return true;
    }
    


    @Override
    public int compareTo(Pessoa p) {
            return nome.compareTo(p.getNome());
            
    }
    
    }
    
    
    

