/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */

import com.Fiap.trabMvp.entidade.UsuarioProfissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioProfissionalRepository extends JpaRepository<UsuarioProfissional, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
