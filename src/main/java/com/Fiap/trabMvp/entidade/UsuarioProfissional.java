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
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@PrimaryKeyJoinColumn(name = "id_usuario")
@Table(name = "UsuarioProfissional")
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioProfissional extends Usuario {

    @Column(name = "tempo_profissao")
    private int tempoProfissao;

    @Column(name = "tipo_servico")
    private String tipoServico;



    public int getTempoProfissao() {
        return tempoProfissao;
    }

    public void setTempoProfissao(int tempoProfissao) {
        this.tempoProfissao = tempoProfissao;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }


}
