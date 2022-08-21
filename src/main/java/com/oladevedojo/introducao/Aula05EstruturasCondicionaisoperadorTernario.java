package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisoperadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        // outro metodo
        // String resultado = (condicao) ? verdadeiro : falso;
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
    }
}
