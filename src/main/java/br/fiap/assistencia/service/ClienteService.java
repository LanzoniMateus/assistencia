package br.fiap.assistencia.service;

import br.fiap.assistencia.domain.Cliente;
import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {
    private ClienteRepository repo;

    public ClienteResponse salvar(ClienteRequest request){
        Cliente cliente = mapper.paraEntidade(request);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(clienteSalvo);
    }

}
