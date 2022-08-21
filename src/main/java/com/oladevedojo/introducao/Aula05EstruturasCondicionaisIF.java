package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisIF {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        }

        // isAutorizadoComprarBebida == false
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }

        System.out.println("Fora do if");
    }
}
