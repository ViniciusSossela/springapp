package hello.data.repository;

import hello.data.entity.TabelaPrecoProduto;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vsossella on 27/03/18.
 */
public interface TabelaPrecoProdutoRepository extends CrudRepository<TabelaPrecoProduto, Long> {
}
