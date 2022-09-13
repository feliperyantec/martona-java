package com.oladevedojo.javacore.Minterfases.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregando Dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bando de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no bando de dados");
    }
}
