package com.oladevedojo.javacore.Bintroducaometodos.test;

import com.oladevedojo.javacore.Bintroducaometodos.dominio.Retorno01;

public class RetornoTest01 {
    public static void main(String[] args) {
        Retorno01 retorno = new Retorno01();
        double resultado = retorno.divideDoisNumeros(10,2);
        System.out.println(resultado);
        System.out.println(retorno.divideDoisNumeros(10,2));
    }
}
