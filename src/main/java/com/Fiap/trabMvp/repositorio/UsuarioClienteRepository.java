/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.entidade.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Long> {
   
}
