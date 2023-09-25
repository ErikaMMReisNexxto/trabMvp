/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.entidade.ContratacaoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratacaoServicoRepository extends JpaRepository<ContratacaoServico, Long> {
}
