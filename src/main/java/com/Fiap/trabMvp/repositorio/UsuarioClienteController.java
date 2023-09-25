/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */

import com.Fiap.trabMvp.Trabalho.UsuarioClienteService;
import com.Fiap.trabMvp.entidade.UsuarioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuariosclientes")
public class UsuarioClienteController {

    private final UsuarioClienteService usuarioClienteService;

    @Autowired
    public UsuarioClienteController(UsuarioClienteService usuarioClienteService) {
        this.usuarioClienteService = usuarioClienteService;
    }

    @GetMapping
    public List<UsuarioCliente> getAllUsuariosClientes() {
        return usuarioClienteService.getAllUsuariosClientes();
    }

    @GetMapping("/{id}")
    public UsuarioCliente getUsuarioClienteById(@PathVariable Long id) {
        return usuarioClienteService.getUsuarioClienteById(id)
                .orElse(null); // Ou lançar uma exceção indicando que o recurso não foi encontrado.
    }

    @PostMapping
    public UsuarioCliente createUsuarioCliente(@RequestBody UsuarioCliente usuarioCliente) {
        return usuarioClienteService.createUsuarioCliente(usuarioCliente);
    }

    @PutMapping("/atualiza/{id}")
    public UsuarioCliente updateUsuarioCliente(@PathVariable Long id, @RequestBody UsuarioCliente usuarioCliente) {
        return usuarioClienteService.updateUsuarioCliente(id, usuarioCliente);
    }

    @DeleteMapping("deleta/{id}")
    public boolean deleteUsuarioCliente(@PathVariable Long id) {
        return usuarioClienteService.deleteUsuarioCliente(id);
    }
}
