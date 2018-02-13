package hello.data.repository;

import hello.data.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vsossella on 13/02/18.
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
