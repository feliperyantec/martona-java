package com.oladevedojo.javacore.Npolimorfismo.servico;

import com.oladevedojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RespositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Saslvando em um arquivo");
    }
}
