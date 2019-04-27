package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//FileInputStream
//FileOutputStream
public class CharacterStream {

    public static void main(String[] args){
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try{
         fileReader = new FileReader("E://latihan_input.txt");
         fileWriter = new FileWriter("E://latihan_output.txt");
         int result;

         while ((result = fileReader.read()) != -1){
             fileWriter.write(result);
         }

        }catch (IOException e) {
            e.printStackTrace();

        } finally {
         try{
             if (fileReader != null){
                 fileReader.close();
             } if (fileWriter != null){
                 fileWriter.close();
             }

         }catch (IOException e){
             e.printStackTrace();
         }
        }
    }
}
