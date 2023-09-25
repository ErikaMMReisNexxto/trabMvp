/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.Trabalho;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.entidade.UsuarioCliente;
import com.Fiap.trabMvp.repositorio.UsuarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioClienteService {

    private final UsuarioClienteRepository usuarioClienteRepository;

    @Autowired
    public UsuarioClienteService(UsuarioClienteRepository usuarioClienteRepository) {
        this.usuarioClienteRepository = usuarioClienteRepository;
    }

    public List<UsuarioCliente> getAllUsuariosClientes() {
        return usuarioClienteRepository.findAll();
    }

    public Optional<UsuarioCliente> getUsuarioClienteById(Long id) {
        return usuarioClienteRepository.findById(id);
    }

    public UsuarioCliente createUsuarioCliente(UsuarioCliente usuarioCliente) {
        return usuarioClienteRepository.save(usuarioCliente);
    }

   public UsuarioCliente updateUsuarioCliente(Long id, UsuarioCliente usuarioCliente) {
        if (usuarioClienteRepository.existsById(id)) {
            UsuarioCliente existingUsuarioCliente = usuarioClienteRepository.findById(id).get();

            // Atualize todos os campos da entidade existente com os dados da nova entidade
            existingUsuarioCliente.setNome(usuarioCliente.getNome());
            existingUsuarioCliente.setEmail(usuarioCliente.getEmail());
            existingUsuarioCliente.setSenha(usuarioCliente.getSenha());
            existingUsuarioCliente.setEndereco(usuarioCliente.getEndereco());
            existingUsuarioCliente.setTamanhoCasa(usuarioCliente.getTamanhoCasa());
            existingUsuarioCliente.setNumeroQuartos(usuarioCliente.getNumeroQuartos());
            existingUsuarioCliente.setNumeroBanheiros(usuarioCliente.getNumeroBanheiros());
            // Continue atualizando os outros campos conforme necessário

            return usuarioClienteRepository.save(existingUsuarioCliente);
        } else {
            return null; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }

    public boolean deleteUsuarioCliente(Long id) {
        if (usuarioClienteRepository.existsById(id)) {
            usuarioClienteRepository.deleteById(id);
            return true;
        } else {
            return false; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
        }
    }
}


