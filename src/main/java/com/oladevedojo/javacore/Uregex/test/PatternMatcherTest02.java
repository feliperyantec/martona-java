package com.oladevedojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o qye nao for digito
        // \s = espaços em branco (incluindo \t \n \f \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, digitos _
        // \W = Tudo o que nao for incluso no \w
        // []
        // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "0 0x 0X 0x1255A 0X15";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHex = 0xDFA;
        System.out.println(numeroHex);
    }
}
