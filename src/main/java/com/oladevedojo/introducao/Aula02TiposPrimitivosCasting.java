package com.oladevedojo.introducao;

public class Aula02TiposPrimitivosCasting {
    public static void main(String[] args) {
        int idade = (int) 10000000000L;
        long numeroGrande = (long)  155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
    }
}