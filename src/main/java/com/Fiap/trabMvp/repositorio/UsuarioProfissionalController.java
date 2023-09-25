/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.Trabalho.UsuarioProfissionalService;
import com.Fiap.trabMvp.entidade.UsuarioProfissional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuariosprofissionais")
public class UsuarioProfissionalController {

    private final UsuarioProfissionalService usuarioProfissionalService;

    @Autowired
    public UsuarioProfissionalController(UsuarioProfissionalService usuarioProfissionalService) {
        this.usuarioProfissionalService = usuarioProfissionalService;
    }

    @GetMapping
    public List<UsuarioProfissional> getAllUsuariosProfissionais() {
        return usuarioProfissionalService.getAllUsuariosProfissionais();
    }

    @GetMapping("/{id}")
    public UsuarioProfissional getUsuarioProfissionalById(@PathVariable Long id) {
        return usuarioProfissionalService.getUsuarioProfissionalById(id)
                .orElse(null); // Ou lançar uma exceção indicando que o recurso não foi encontrado.
    }

    @PostMapping
    public UsuarioProfissional createUsuarioProfissional(@RequestBody UsuarioProfissional usuarioProfissional) {
        return usuarioProfissionalService.createUsuarioProfissional(usuarioProfissional);
    }

    @PutMapping("atuliza/{id}")
    public UsuarioProfissional updateUsuarioProfissional(@PathVariable Long id, @RequestBody UsuarioProfissional usuarioProfissional) {
        return usuarioProfissionalService.updateUsuarioProfissional(id, usuarioProfissional);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteUsuarioProfissional(@PathVariable Long id) {
        return usuarioProfissionalService.deleteUsuarioProfissional(id);
    }
}

