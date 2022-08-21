package com.oladevedojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean SEMPRE MINUSCULAS
        int idade = 10; // variaveis // primeira palavra com inicial minusculas restante maiuscula
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 59;

        System.out.println(idade); // sem concatenação
        System.out.println("A idade é "+idade+" anos"); // com concatenação
        System.out.println(falso); // com concatenação
        System.out.println("char "+caractere);
        // CRTL+D duplicar linha
    }
}
