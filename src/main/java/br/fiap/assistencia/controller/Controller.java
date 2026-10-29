package br.fiap.assistencia.controller;

import br.fiap.assistencia.domain.Cliente;
import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor

public class Controller {
    private final ClienteService service;

    @PostMapping("/salvar")
    public ClienteResponse salvar(@RequestBody ClienteRequest dto){
        return service.salvar(dto);
    }

    @GetMapping("/pesquisar/{id}")
    public ClienteResponse pesquisar(@PathVariable Long id){
        return service.pesquisar(id);
    }

    @GetMapping("/listar")
    public List<ClienteResponse> listar() {
        return service.listar();
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @PutMapping("/atualizar/{id}")
    public ClienteResponse atualizar(@PathVariable Long id,
                                     @RequestBody ClienteRequest dto){
        return service.atualizar(id, dto);
    }

    @GetMapping("/pesquisar-email/{email}")
    public ClienteResponse pesquisarPorEmail(@PathVariable String email){
        return service.pesquisarPorEmail(email);
    }
}
