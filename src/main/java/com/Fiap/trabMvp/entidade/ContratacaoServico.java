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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contratacao_servico")
@NoArgsConstructor
@AllArgsConstructor
public class ContratacaoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contratacao_servico_seq")
    @SequenceGenerator(name = "contratacao_servico_seq", sequenceName = "CONTRATACAO_SERVICO_SEQ", allocationSize = 1)
    @Column(name = "id_contratacao_servico")
    private Long idServico;

    @ManyToOne
    @JoinColumn(name = "id_usuario_profissional")
    private UsuarioProfissional usuarioProfissional;

    @ManyToOne
    @JoinColumn(name = "id_usuario_cliente")
    private UsuarioCliente usuarioCliente;

    @Column(name = "tipo_servico", length = 50)
    private String tipoServico;

    @Column(name = "tempo_servico")
    private int tempoServico;

    @Column(name = "valor_servico")
    private float valorServico;

    @Column(name = "data_contratacao")
    private Date dataContratacao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pagamento")
    private Pagamento pagamento;


    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public UsuarioProfissional getUsuarioProfissional() {
        return usuarioProfissional;
    }

    public void setUsuarioProfissional(UsuarioProfissional usuarioProfissional) {
        this.usuarioProfissional = usuarioProfissional;
    }

    public UsuarioCliente getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(UsuarioCliente usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public float getValorServico() {
        return valorServico;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }


    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    


    // Modificação aqui para armazenar apenas os IDs dos usuários

    public Long getIdUsuarioProfissional() {
        return usuarioProfissional != null ? usuarioProfissional.getId(): null;
    }

    public void setIdUsuarioProfissional(Long idUsuarioProfissional) {
        if (usuarioProfissional == null) {
            usuarioProfissional = new UsuarioProfissional();
        }
        usuarioProfissional.setId(idUsuarioProfissional);
    }

    public Long getIdUsuarioCliente() {
        return usuarioCliente != null ? usuarioCliente.getId(): null;
    }

    public void setIdUsuarioCliente(Long idUsuarioCliente) {
        if (usuarioCliente == null) {
            usuarioCliente = new UsuarioCliente();
        }
        usuarioCliente.setId(idUsuarioCliente);
    }

    // Resto dos getters e setters permanecem os mesmos
}
