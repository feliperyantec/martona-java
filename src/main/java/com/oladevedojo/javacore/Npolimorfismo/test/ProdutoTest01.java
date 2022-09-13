package com.oladevedojo.javacore.Npolimorfismo.test;

import com.oladevedojo.javacore.Npolimorfismo.dominio.Computador;
import com.oladevedojo.javacore.Npolimorfismo.dominio.Tomate;
import com.oladevedojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 100000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
