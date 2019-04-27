package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javaexampleprogram;

import java.util.Scanner;

public class AirTemparature {
    public static void main(String[] args){
        //Deklarasi Variabek
        int Temperatur;

        //Output
        System.out.println("Contoh If");
        System.out.print("Temperatur (derajat C) = ");

        //Scanne untuk memasukkan Temperatur
        Scanner scanner = new Scanner(System.in);
        //Temperatur dalam type data Integer
        Temperatur = scanner.nextInt();

        //Proses pengecekan menggunakan IF
        if (Temperatur < 0){
            System.out.println("Wujud Air Beku " + Temperatur);
        } else if ((0 <= Temperatur) && (Temperatur <= 100)){
            System.out.println("Wujud Air Cair " + Temperatur);
        } else if (Temperatur > 100){
            System.out.println("Wujud Air Mendidih " + Temperatur);
        }

    }
}
