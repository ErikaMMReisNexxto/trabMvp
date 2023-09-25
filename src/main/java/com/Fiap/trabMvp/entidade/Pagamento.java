/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.entidade;

/**
 *
 * @author Erika Macedo
 */
import jakarta.persistence.*;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagamento_seq")
    @SequenceGenerator(name = "pagamento_seq", sequenceName = "pagamento_seq", allocationSize = 1)
    @Column(name = "id_pagamento")
    private Long id;

    @Column(name = "valor")
    private float valor;

    @Column(name = "tipo_pagamento", length = 50)
    private String tipoPagamento;
    
    public Pagamento() {}

    public Pagamento(Long id, float valor, String tipoPagamento) {
        this.id = id;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
