package hello.domain.service;

import hello.data.entity.TabelaPreco;
import hello.data.repository.TabelaPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsossella on 13/02/18.
 */

@Service
public class TabelaPrecoService {

    @Autowired
    private TabelaPrecoRepository tabelaPrecoRepository;

    public TabelaPreco save(TabelaPreco tabelaPreco) {
        return tabelaPrecoRepository.save(tabelaPreco);
    }

    public List<TabelaPreco> findAll() {
        List<TabelaPreco> tabelaPrecos = new ArrayList<>();
        tabelaPrecoRepository.findAll().forEach(tabelaPrecos::add);
        return tabelaPrecos;
    }

}
