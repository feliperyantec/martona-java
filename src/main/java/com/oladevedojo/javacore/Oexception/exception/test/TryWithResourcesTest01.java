package com.oladevedojo.javacore.Oexception.exception.test;

import com.oladevedojo.javacore.Oexception.exception.dominio.Leitor01;
import com.oladevedojo.javacore.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {

        }
    }
}
