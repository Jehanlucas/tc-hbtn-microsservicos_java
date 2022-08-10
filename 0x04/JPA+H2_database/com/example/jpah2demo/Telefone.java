package com.example.jpah2demo;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private int DDD ;
    private String numero ;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cliente cliente;

    public Telefone() {
    }

    public Telefone(Long id, int DDD, String numero) {
        this.id = id;
        this.DDD = DDD;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
