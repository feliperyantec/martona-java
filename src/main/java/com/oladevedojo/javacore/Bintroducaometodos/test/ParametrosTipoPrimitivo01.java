package com.oladevedojo.javacore.Bintroducaometodos.test;

import com.oladevedojo.javacore.Bintroducaometodos.dominio.TipoPrimitivo01;

public class ParametrosTipoPrimitivo01 {
    public static void main(String[] args) {
        TipoPrimitivo01 tipoPrimitivo01 = new TipoPrimitivo01();
        int num1 = 1;
        int num2 = 2;
        tipoPrimitivo01.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
