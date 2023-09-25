/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.Trabalho;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.entidade.ContratacaoServico;
import com.Fiap.trabMvp.repositorio.ContratacaoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

@Service
public class ContratacaoServicoService {

    private final ContratacaoServicoRepository contratacaoServicoRepository;

    @Autowired
    public ContratacaoServicoService(ContratacaoServicoRepository contratacaoServicoRepository) {
        this.contratacaoServicoRepository = contratacaoServicoRepository;
    }

    public List<ContratacaoServico> getAllContratacoesServico() {
        return contratacaoServicoRepository.findAll();
    }

    public Optional<ContratacaoServico> getContratacaoServicoById(Long id) {
        return contratacaoServicoRepository.findById(id);
    }

    public ContratacaoServico createContratacaoServico(ContratacaoServico contratacaoServico) {
        return contratacaoServicoRepository.save(contratacaoServico);
    }

    public ContratacaoServico updateContratacaoServico(Long id, ContratacaoServico contratacaoServico) {
        ContratacaoServico updatedContratacao = contratacaoServicoRepository.findById(id).orElse(null);
        if (updatedContratacao != null) {
            updatedContratacao.setTipoServico(contratacaoServico.getTipoServico());
            updatedContratacao.setTempoServico(contratacaoServico.getTempoServico());
            updatedContratacao.setValorServico(contratacaoServico.getValorServico());
            updatedContratacao.setDataContratacao(contratacaoServico.getDataContratacao());
            updatedContratacao.setPagamento(contratacaoServico.getPagamento());
            updatedContratacao.setUsuarioProfissional(contratacaoServico.getUsuarioProfissional());
            updatedContratacao.setUsuarioCliente(contratacaoServico.getUsuarioCliente());

            return contratacaoServicoRepository.save(updatedContratacao);

        } else {
            return null; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }

    public boolean deleteContratacaoServico(Long id) {
        if (contratacaoServicoRepository.existsById(id)) {
            contratacaoServicoRepository.deleteById(id);
            return true;
        } else {
            return false; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }
}
