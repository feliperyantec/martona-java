package com.oladevedojo.javacore.Npolimorfismo.servico;

import com.oladevedojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RespositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Ssalvando em memoria");
    }
}
