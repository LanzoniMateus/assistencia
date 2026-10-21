package br.fiap.assistencia.dto;

public record ClienteRequest(
        String nome,
        String telefone,
        String email,
        String senha) {
}
