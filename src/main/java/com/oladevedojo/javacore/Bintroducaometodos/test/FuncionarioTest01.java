package com.oladevedojo.javacore.Bintroducaometodos.test;

import com.oladevedojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 45;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
    }
}
