package hello.domain.service;

import hello.data.entity.TabelaPreco;
import hello.data.repository.TabelaPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
