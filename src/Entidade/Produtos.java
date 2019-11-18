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

/**
 *
 * @author lukas
 */
@Entity
public class Produtos  implements Comparable<Produtos>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String quantidade_estoque;
    @Column(length = 100, nullable = false)
    private String valor;
    

 
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

   
   

    public String getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(String quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
    
     @Override
    public String toString() {
        return nome;
    }
    public boolean equals(Object obj) {
        final Produtos other = (Produtos) obj;
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
    public int compareTo(Produtos p) {
            return nome.compareTo(p.getNome());
            
    }
    
    
    
    
}
