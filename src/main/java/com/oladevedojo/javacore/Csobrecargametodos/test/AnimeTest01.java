package com.oladevedojo.javacore.Csobrecargametodos.test;

import com.oladevedojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
