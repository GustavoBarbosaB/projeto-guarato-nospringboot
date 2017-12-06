package com.projeto.guarato.projetoguarato.repository;

import com.projeto.guarato.projetoguarato.model.Pedido;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

    Pedido findById(int id);
}
