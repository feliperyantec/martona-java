package com.oladevedojo.javacore.Hheranca.test;

import com.oladevedojo.javacore.Hheranca.dominio.Endereco;
import com.oladevedojo.javacore.Hheranca.dominio.Funcionario;
import com.oladevedojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("77825-700");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyahisa Shimazu");
        pessoa.setCpf("111111-111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunga");
        funcionario.setCpf("546546565");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-------------------");
        funcionario.imprime();
    }
}
