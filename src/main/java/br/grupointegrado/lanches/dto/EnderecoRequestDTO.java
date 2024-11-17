package br.grupointegrado.lanches.dto;

import br.grupointegrado.lanches.model.Cliente;

public record EnderecoRequestDTO(String logradouro, String cidade, Cliente cliente) {
}
