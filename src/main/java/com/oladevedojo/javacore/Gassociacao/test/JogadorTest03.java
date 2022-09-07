package com.oladevedojo.javacore.Gassociacao.test;

import com.oladevedojo.javacore.Gassociacao.dominio.Jogador;
import com.oladevedojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time1 = new Time("Brasil");
        Time time2 = new Time("Argentina");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time1);
        jogador2.setTime(time2);

        time1.setJogadores(jogadores);

        System.out.println("---- Jogador ----");

        jogador.imprime();

        System.out.println("---- Time ----");

        time1.imprime();
        time2.imprime();
    }
}
