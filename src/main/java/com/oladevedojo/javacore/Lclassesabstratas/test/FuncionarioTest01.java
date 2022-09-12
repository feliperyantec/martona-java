package com.oladevedojo.javacore.Lclassesabstratas.test;

import com.oladevedojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.oladevedojo.javacore.Lclassesabstratas.dominio.Funcionario;
import com.oladevedojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nani", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
