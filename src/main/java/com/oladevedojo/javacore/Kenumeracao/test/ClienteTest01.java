package com.oladevedojo.javacore.Kenumeracao.test;

import com.oladevedojo.javacore.Kenumeracao.dominio.Cliente;
import com.oladevedojo.javacore.Kenumeracao.dominio.TipoCliente;

import java.awt.event.ActionListener;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente4= new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
