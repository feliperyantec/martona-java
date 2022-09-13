package com.oladevedojo.javacore.Npolimorfismo.servico;

import com.oladevedojo.javacore.Npolimorfismo.dominio.Computador;
import com.oladevedojo.javacore.Npolimorfismo.dominio.Produto;
import com.oladevedojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
