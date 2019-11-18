/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author lukas
 */
@Entity
public class Pedidos implements Comparable<Pedidos>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   
    @Column(length = 100, nullable = false, unique = true)
    private String numero;
    
    @ManyToOne
    private Pessoa pessoas;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    
    public Pessoa getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoas) {
        this.pessoas = pessoas;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(Pedidos o) {
        
        return this.numero.compareTo(o.getNumero());
        
    }

    
    
    
}
