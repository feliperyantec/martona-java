package com.oladevedojo.javacore.Bintroducaometodos.test;

import com.oladevedojo.javacore.Bintroducaometodos.dominio.Retorno02;

public class RetornoTest02 {
    public static void main(String[] args) {
        Retorno02 retorno02 = new Retorno02();
        double resultado = retorno02.divideDoisNumeros2(10, 0);
        System.out.println(resultado);
        System.out.println(retorno02.divideDoisNumeros2(20, 0));
        System.out.println("----------------------");
        retorno02.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
