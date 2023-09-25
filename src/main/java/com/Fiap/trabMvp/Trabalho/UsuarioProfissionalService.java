/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.Trabalho;

/**
 *
 * @author Erika Macedo
 */

import com.Fiap.trabMvp.entidade.UsuarioProfissional;
import com.Fiap.trabMvp.repositorio.UsuarioProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioProfissionalService {

    private final UsuarioProfissionalRepository usuarioProfissionalRepository;

    @Autowired
    public UsuarioProfissionalService(UsuarioProfissionalRepository usuarioProfissionalRepository) {
        this.usuarioProfissionalRepository = usuarioProfissionalRepository;
    }

    public List<UsuarioProfissional> getAllUsuariosProfissionais() {
        return usuarioProfissionalRepository.findAll();
    }

    public Optional<UsuarioProfissional> getUsuarioProfissionalById(Long id) {
        return usuarioProfissionalRepository.findById(id);
    }

    public UsuarioProfissional createUsuarioProfissional(UsuarioProfissional usuarioProfissional) {
        return usuarioProfissionalRepository.save(usuarioProfissional);
    }

   public UsuarioProfissional updateUsuarioProfissional(Long id, UsuarioProfissional usuarioProfissional) {
        if (usuarioProfissionalRepository.existsById(id)) {
            UsuarioProfissional existingUsuarioProfissional = usuarioProfissionalRepository.findById(id).get();

            // Atualize todos os campos da entidade existente com os dados da nova entidade
            existingUsuarioProfissional.setNome(usuarioProfissional.getNome());
            existingUsuarioProfissional.setEmail(usuarioProfissional.getEmail());
            existingUsuarioProfissional.setSenha(usuarioProfissional.getSenha());
            existingUsuarioProfissional.setEndereco(usuarioProfissional.getEndereco());
            existingUsuarioProfissional.setTempoProfissao(usuarioProfissional.getTempoProfissao());
            existingUsuarioProfissional.setTipoServico(usuarioProfissional.getTipoServico());
            // Continue atualizando os outros campos conforme necessário

            return usuarioProfissionalRepository.save(existingUsuarioProfissional);
        } else {
            return null; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }

    public boolean deleteUsuarioProfissional(Long id) {
        if (usuarioProfissionalRepository.existsById(id)) {
            usuarioProfissionalRepository.deleteById(id);
            return true;
        } else {
            return false; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }
}

