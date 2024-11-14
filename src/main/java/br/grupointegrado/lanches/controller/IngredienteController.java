package br.grupointegrado.lanches.controller;

import br.grupointegrado.lanches.model.Ingrediente;
import br.grupointegrado.lanches.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @RequestMapping
    public ResponseEntity<List<Ingrediente>> findAll(){
        return ResponseEntity.ok(this.ingredienteRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Ingrediente> insert(@RequestBody String descricao) {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setDescricao(descricao);
        this.ingredienteRepository.save(ingrediente);
        return ResponseEntity.ok(ingrediente);
    }

}
