package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String args[]){

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Kalkulator Sangat Sederhana");
        int valueOne = 0;
        int valueTwo = 0;

        try{
            System.out.print("Masukkan Angka Pertama : ");
            valueOne = Integer.parseInt(bufferedReader.readLine() );

            System.out.print("Masukkan Angka Kedua : ");
            valueTwo = Integer.parseInt(bufferedReader.readLine());

        }catch (IOException e){
            e.printStackTrace();

        }
        int result = valueOne + valueTwo;
        System.out.println(result);

    }
}
