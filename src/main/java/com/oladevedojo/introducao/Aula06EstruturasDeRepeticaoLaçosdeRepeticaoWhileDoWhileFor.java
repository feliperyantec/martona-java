package com.oladevedojo.introducao;

public class Aula06EstruturasDeRepeticaoLaÃ§osdeRepeticaoWhileDoWhileFor {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 23) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while"+ ++count);
        }while (count < 10);

        for (int i=0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }
}




