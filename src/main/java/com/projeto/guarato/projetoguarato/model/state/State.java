package com.projeto.guarato.projetoguarato.model.state;

public interface State {

     State nextState();
     String getState();
     boolean change();

}
