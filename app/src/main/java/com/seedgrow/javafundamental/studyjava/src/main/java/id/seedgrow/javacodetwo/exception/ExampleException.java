package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.exception;

import java.io.File;
import java.io.FileReader;

//Checked ExampleException
//Uncheked ExampleException
//Error
public class ExampleException {

    //try-catch
    //multiple try-catch
    public static void main(String[] args) {

        try {
            //Mencoba membaca berkas .txt
            File file = new File("E://Cara Mengajar.txt");
            FileReader fileReader = new FileReader(file);

            //Dijalankan saat file berhasil di baca
            System.out.println("Read File Berhasil");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        //cathch{   )

        //Finally untuk mengakhiri seluruh proses/Clean up cpde
//        finally {
//
//        }

    }

}
