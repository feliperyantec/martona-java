package com.oladevedojo.introducao;

public class Aula04OperadoresRelacionais {
    public static void main(String[] args) {
        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != operadores logiscos sempre retornam valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenosQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte"+isDezMaiorQueVinte);
        System.out.println("isDezMenosQueVinte"+isDezMenosQueVinte);
        System.out.println("isDezIgualVinte"+isDezIgualVinte);
        System.out.println("isDezIgualDez"+isDezIgualDez);
        System.out.println("isDezDiferenteDez"+isDezDiferenteDez);
    }
}
