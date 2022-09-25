package com.oladevedojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);

        BufferedWriter br = new BufferedWriter(fw)) {

            br.write("Aula 139\n");
            br.newLine();
            br.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
