package com.oladevedojo.javacore.Bintroducaometodos.dominio;

public class TipoPrimitivo01 {
    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 35;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
