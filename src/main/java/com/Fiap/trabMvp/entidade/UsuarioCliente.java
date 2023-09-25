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
@Table(name = "UsuarioCliente")
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCliente extends Usuario {

    @Column(name = "tamanho_casa")
    private int tamanhoCasa;

    @Column(name = "numero_quartos")
    private int numeroQuartos;

    @Column(name = "numero_banheiros")
    private int numeroBanheiros;



    public int getTamanhoCasa() {
        return tamanhoCasa;
    }

    public void setTamanhoCasa(int tamanhoCasa) {
        this.tamanhoCasa = tamanhoCasa;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

   
}

