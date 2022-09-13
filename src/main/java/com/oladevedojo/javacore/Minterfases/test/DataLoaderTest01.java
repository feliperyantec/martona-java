package com.oladevedojo.javacore.Minterfases.test;

import com.oladevedojo.javacore.Minterfases.dominio.DatabaseLoader;
import com.oladevedojo.javacore.Minterfases.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
