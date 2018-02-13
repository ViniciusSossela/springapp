package hello.data.repository;

import hello.data.entity.Produto;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vsossella on 13/02/18.
 */
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
