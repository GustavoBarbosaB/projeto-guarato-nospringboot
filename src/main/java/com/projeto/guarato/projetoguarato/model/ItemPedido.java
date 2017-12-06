package com.projeto.guarato.projetoguarato.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "item_pedido")
public class ItemPedido implements Serializable {

    @EmbeddedId
    private ItemPedidoId id;

    private int qtd;

    public ItemPedido() {
    }

    public ItemPedido(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
