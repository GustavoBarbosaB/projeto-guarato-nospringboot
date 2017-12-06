package com.projeto.guarato.projetoguarato.service;

import com.projeto.guarato.projetoguarato.model.Pedido;
import com.projeto.guarato.projetoguarato.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void save(Pedido pedido){

    }

    public void delete(Integer id){
        pedidoRepository.delete(id);
    }

    public List<Pedido> getPedidos()
    {
        return pedidoRepository.findAll();
    }

    public Pedido findPedido(Integer id){
        return pedidoRepository.findById(id);
    }


}
