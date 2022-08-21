package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        //
        int salario = 444000;
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

        double porcentagem = 49.50;
        double salario1 = 852;

        double resultado = porcentagem % salario1;

        System.out.println(resultado);
    }



}
