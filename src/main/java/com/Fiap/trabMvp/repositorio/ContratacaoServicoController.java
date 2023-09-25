/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fiap.trabMvp.repositorio;

/**
 *
 * @author Erika Macedo
 */
import com.Fiap.trabMvp.Trabalho.ContratacaoServicoService;
import com.Fiap.trabMvp.entidade.ContratacaoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contratacaoservico")
public class ContratacaoServicoController {

    private final ContratacaoServicoService contratacaoServicoService;

    @Autowired
    public ContratacaoServicoController(ContratacaoServicoService contratacaoServicoService) {
        this.contratacaoServicoService = contratacaoServicoService;
    }

    @GetMapping
    public List<ContratacaoServico> getAllContratacoesServico() {
        return contratacaoServicoService.getAllContratacoesServico();
    }

    @GetMapping("/{id}")
    public ContratacaoServico getContratacaoServicoById(@PathVariable Long id) {
        return contratacaoServicoService.getContratacaoServicoById(id)
                .orElse(null); // Ou lançar uma exceção indicando que o recurso não foi encontrado.
    }
    @GetMapping("/teste")
    public String getteste(@PathVariable Long id) {
        return "testando pont"; // Ou lançar uma exceção indicando que o recurso não foi encontrado.
    }

    @PostMapping
    public ContratacaoServico createContratacaoServico(@RequestBody ContratacaoServico contratacaoServico) {
        return contratacaoServicoService.createContratacaoServico(contratacaoServico);
    }

    @PutMapping("/atuliza/{id}")
    public ContratacaoServico updateContratacaoServico(@PathVariable Long id, @RequestBody ContratacaoServico contratacaoServico) {
        return contratacaoServicoService.updateContratacaoServico(id, contratacaoServico);
    }

    @DeleteMapping("/deleta/{id}")
    public boolean deleteContratacaoServico(@PathVariable Long id) {
        return contratacaoServicoService.deleteContratacaoServico(id);
    }
}

