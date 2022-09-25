package com.oladevedojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Aula 139\n");
            fw.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
