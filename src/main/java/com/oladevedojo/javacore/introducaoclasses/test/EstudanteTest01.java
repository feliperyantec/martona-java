package com.oladevedojo.javacore.introducaoclasses.test;

import com.oladevedojo.javacore.introducaoclasses.dominio.Estudante;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
