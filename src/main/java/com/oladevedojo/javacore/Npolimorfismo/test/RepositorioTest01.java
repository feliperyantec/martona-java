package com.oladevedojo.javacore.Npolimorfismo.test;

import com.oladevedojo.javacore.Npolimorfismo.repositorio.Repositorio;
import com.oladevedojo.javacore.Npolimorfismo.servico.RespositorioArquivo;
import com.oladevedojo.javacore.Npolimorfismo.servico.RespositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RespositorioArquivo();
        repositorio.salvar();
    }
}
