package com.oladevedojo.introducao;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        String dia = "segunda";

        switch (dia) {
            case "domingo":
                System.out.println("Final de Semana");
                break;
            case "segunda":
                System.out.println("Dia Útil");
                break;
            case "terça":
                System.out.println("Dia Útil");
                break;
            case "quarta":
                System.out.println("Dia Útil");
                break;
            case "quinta":
                System.out.println("Dia Útil");
                break;
            case "sexta":
                System.out.println("Dia Útil");
                break;
            case "sabado":
                System.out.println("Final de Semana");
                break;

        }
        byte diaDaSemana = 1;
        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
