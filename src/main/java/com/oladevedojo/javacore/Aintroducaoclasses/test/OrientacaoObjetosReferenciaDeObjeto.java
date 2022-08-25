package com.oladevedojo.javacore.Aintroducaoclasses.test;

import com.oladevedojo.javacore.Aintroducaoclasses.dominio.Carro;

public class OrientacaoObjetosReferenciaDeObjeto {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";

        carro2.nome = "Mustang";

        carro1 = carro2;

        System.out.println(carro1.nome);
    }
}
