package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisELSEeIF {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juveil
        // idade >= 18 categoria adulto
        int idade = 15;

        if (idade < 15) {
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }
        String categoria;

        if (idade < 19) {
            categoria = "categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "categoria juvenil";
        } else {
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }

}
