package com.oladevedojo.javacore.Bintroducaometodos.dominio;

public class Retorno02 {
    public double divideDoisNumeros2(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }
}
