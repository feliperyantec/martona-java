package com.oladevedojo.javacore.Aintroducaoclasses.test;

import com.oladevedojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Tesla";
        carro.modelo = "Model X";
        carro.ano = 2022;

        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Turing Turbo";
        carro1.ano = 2023;

        System.out.println("Nome: " + carro.nome + "\n" + "Modelo: " + carro.modelo + "\n" + "Ano: " + carro.ano);

        System.out.println("-------------");

        System.out.println("Nome: " + carro1.nome + "\n" + "Modelo: " + carro1.modelo + "\n" + "Ano: " + carro1.ano);
    }
}
