package com.oladevedojo.javacore.Bintroducaometodos.test;

import com.oladevedojo.javacore.Bintroducaometodos.dominio.Calculadora;
import com.oladevedojo.javacore.Bintroducaometodos.dominio.TipoPrimitivo01;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        TipoPrimitivo01 tipoPrimitivo01 = new TipoPrimitivo01();

        int[] numeros = {1, 2, 3, 4, 5};

        tipoPrimitivo01.somaArray(numeros);
        tipoPrimitivo01.somaVarArgs(1,2,3,4,5,6,7,8,9);

    }
}
