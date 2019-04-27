package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream
//FileOutputStream
public class ByteStream {

    public static void main(String[] args){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
         fileInputStream = new FileInputStream("E://latihan_input.txt");
         fileOutputStream = new FileOutputStream("E://latihan_output.txt");
         int result;

         while ((result = fileInputStream.read()) != -1){
             fileOutputStream.write(result);
         }

        }catch (IOException e) {
            e.printStackTrace();

        } finally {
         try{
             if (fileInputStream != null){
                 fileInputStream.close();
             } if (fileOutputStream != null){
                 fileOutputStream.close();
             }

         }catch (IOException e){
             e.printStackTrace();
         }
        }
    }
}
