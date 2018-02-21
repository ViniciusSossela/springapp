package hello.domain.service;

import hello.data.entity.Cliente;
import hello.data.entity.Usuario;
import hello.data.repository.ClienteRepository;
import hello.data.repository.RotaRepository;
import hello.data.repository.TabelaPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Cliente> findAll() {
        List<Cliente> clientes = new ArrayList<>();
        clienteRepository.findAll().forEach(clientes::add);
        return clientes;
    }

}
