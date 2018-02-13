package hello.data.repository;

import hello.data.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vsossella on 13/02/18.
 */
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
