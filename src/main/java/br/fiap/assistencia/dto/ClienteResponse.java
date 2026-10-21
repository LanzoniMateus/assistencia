package br.fiap.assistencia.dto;

public record ClienteResponse(
        Long id,
        String nome,
        String telefone,
        String email) {

}
