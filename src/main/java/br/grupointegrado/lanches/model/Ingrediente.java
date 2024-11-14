package br.grupointegrado.lanches.model;

import io.swagger.v3.oas.annotations.StringToClassMapItem;
import jakarta.persistence.*;

@Entity
@Table(name = "ingredientes")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(precision = 500)
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescicao() {
        return descricao;
    }

    public void setDescricao(String descicao) {
        this.descricao = descicao;
    }
}
