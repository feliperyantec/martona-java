package com.oladevedojo.javacore.Qstring.Test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        System.out.println(nome2 == nome);
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        // Strings são imutáveis
    }
}
