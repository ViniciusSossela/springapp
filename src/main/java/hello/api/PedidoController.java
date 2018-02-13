package hello.api;

import hello.data.entity.Pedido;
import hello.domain.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @CrossOrigin
    @RequestMapping(name = "/", method = RequestMethod.POST)
    public Pedido save(@RequestBody Pedido pedidoInput) {
        return pedidoService.save(pedidoInput);
    }
}
