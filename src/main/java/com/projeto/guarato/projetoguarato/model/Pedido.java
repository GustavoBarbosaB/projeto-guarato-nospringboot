package com.projeto.guarato.projetoguarato.model;


import com.projeto.guarato.projetoguarato.model.state.Iniciado;
import com.projeto.guarato.projetoguarato.model.state.Pendente;
import com.projeto.guarato.projetoguarato.model.state.State;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pedido")
public class Pedido {

    public int getId() {
        return id;
    }

    /**
     * Estamos gerando o ID automaticamente através do próprio JPA
     * A anotação @OneToOne faz com essa relação entre pedido e comprador e
     * pedido e vendedor seja de "um para um". O Cascade usado é somente para
     * dar o MERGE nas alterações nos objetos, não aceitando por exemplo
     * REMOVE, PERSIST, REFRESH, DETACH, que são outras ações possíveis no
     * método cascade.
     */

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_pedido")
    private int id;

    @ManyToOne
    private Comprador comprador;

    @ManyToOne
    private Vendedor vendedor;

    @OneToMany
    private List<ItemPedido> itens;

    @Transient
    private State state;

    private String stateDB;

    //--------------------------------------------------------------------------------------------------------------------/


    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    protected Pedido()
    {
        state = new Iniciado();
        stateDB = state.getState();
    }

    List<ItemPedido> getItems() {
        return itens;
    }

    public void setItems( List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void cancel(){

        if(state instanceof Pendente) {
            state = Pendente.cancel();
            stateDB = state.getState();
        }
    }

    public void changeState(){
        state = state.nextState();
        stateDB = state.getState();
    }

}
