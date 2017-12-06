package com.projeto.guarato.projetoguarato.model.state;


public class Iniciado implements State{

       @Override
    public State nextState() {
        return new Pendente();
    }

    @Override
    public String getState() {
        return "Iniciado";
    }

    @Override
    public boolean change() {
        return false;
    }
}
