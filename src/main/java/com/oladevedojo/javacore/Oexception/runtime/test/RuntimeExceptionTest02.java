package com.oladevedojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Argumento Invalido, não pode ser 0");
        }
        return a/b;
    }
}
