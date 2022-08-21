package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        //
        int salario = 70000;
        String taxa;

        if (salario <= 34712) {
            taxa = "9,70%";
        } else if (salario >= 34713 && salario < 68508) {
            taxa = "37,35";
        }else {
            taxa = "49,50%";
        }

        //String taxa = salario <= 34712 ? "9,70%" : salario >= 34713 && salario <= 68507 ? "37,35%" : "49,50";

        System.out.println(taxa);

        //double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salario <= 34712) {
            valorImposto = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * segundaFaixa;
        } else {
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }



}
