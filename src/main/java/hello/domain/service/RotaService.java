package hello.domain.service;

import hello.data.repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vsossella on 13/02/18.
 */

@Service
public class RotaService {

    @Autowired
    private RotaRepository rotaRepository;

}
