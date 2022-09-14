package com.oladevedojo.javacore.Npolimorfismo.servico;

import com.oladevedojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RespositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em bando de dados");
    }
}
