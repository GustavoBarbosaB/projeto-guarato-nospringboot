package com.projeto.guarato.projetoguarato.model.state;

public class Finalizado implements State {

    @Override
    public State nextState (){
        return (new Finalizado());
    }

    @Override
    public String getState() {
        return "Finalizado";
    }

    @Override
    public boolean change() {
        return false;
    }
}