package com.oladevedojo.javacore.Npolimorfismo.test;

import com.oladevedojo.javacore.Npolimorfismo.dominio.Computador;
import com.oladevedojo.javacore.Npolimorfismo.dominio.Produto;
import com.oladevedojo.javacore.Npolimorfismo.dominio.Tomate;
import com.oladevedojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2022");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
