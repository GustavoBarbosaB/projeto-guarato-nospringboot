package com.projeto.guarato.projetoguarato.controller;

import com.projeto.guarato.projetoguarato.model.Pedido;
import com.projeto.guarato.projetoguarato.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @GetMapping
    public List<Pedido> pedido(){

        return pedidoService.getPedidos();

    }


    /**
     * @param id (obrigatorio)
     * @return retonar todos pedidos por id
     */
    @GetMapping("/{id}")
    public Pedido pedido(@PathVariable("id") int id){

        List<Pedido> dbPedidos = (List<Pedido>) pedidoService.getPedidos();

        for(Pedido aux: dbPedidos)
        {
            if(aux.getId() == id){
                return aux;
            }
        }

        return null;
    }

    @PostMapping
    public String addPedido(@RequestBody Pedido pedido, BindingResult result){

        if (result.hasErrors()) {
            return "error";
        }

        pedidoService.save(pedido);

        return "Salvo com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String removePedido(@PathVariable int id )
    {
        Pedido pedido = pedidoService.findPedido(id);

        if(pedido == null)
            return "Nada removido!";

        pedidoService.delete(id);

        return "Removido com sucesso!";
    }
/*

    @RequestMapping(value = "/changePedido/{id}", method = PUT)
    public String changePedido(@RequestBody Pedido pedido, @PathVariable int id)
    {
        int i;
        for(i = 0; i < pedidos.size() ;i++)
        {
            if(pedidos.get(i).getId() == id) {
                changePedidoHelp(pedido,pedidos.get(i));
                break;
            }
        }

        if(i==pedidos.size())
            return "Not exist";

        return "OK changed";
    }

*/

}
