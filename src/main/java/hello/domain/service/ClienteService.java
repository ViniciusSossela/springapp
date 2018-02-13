package hello.domain.service;

import hello.data.entity.Cliente;
import hello.data.repository.ClienteRepository;
import hello.data.repository.RotaRepository;
import hello.data.repository.TabelaPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vsossella on 13/02/18.
 */

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private RotaRepository rotaRepository;

    @Autowired
    private TabelaPrecoRepository tabelaPrecoRepository;

    public Cliente save(Cliente cliente) {
        cliente.setRota(rotaRepository.findOne(cliente.getRota().getId()));
        cliente.setTabelaPreco(tabelaPrecoRepository.findOne(cliente.getTabelaPreco().getId()));
        return clienteRepository.save(cliente);
    }

}
