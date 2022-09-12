package com.oladevedojo.javacore.Kenumeracao.test;

import com.oladevedojo.javacore.Kenumeracao.dominio.Cliente;
import com.oladevedojo.javacore.Kenumeracao.dominio.TipoCliente;
import com.oladevedojo.javacore.Kenumeracao.dominio.TipoPagamento;

import static com.oladevedojo.javacore.Kenumeracao.dominio.TipoPagamento.CREDITO;
import static com.oladevedojo.javacore.Kenumeracao.dominio.TipoPagamento.DEBITO;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
