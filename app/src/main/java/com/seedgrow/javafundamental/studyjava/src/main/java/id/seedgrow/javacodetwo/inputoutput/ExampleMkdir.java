package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.inputoutput;

import java.io.File;

public class ExampleMkdir {

    public static void main(String[] args){
        String dirname = "E://java/latihan";
        File file = new File(dirname);

        //Buat directory
        file.mkdirs();
    }
}
