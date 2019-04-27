package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.inputoutput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Sangat sederhana");

        System.out.print("Masukkan Angka Pertama :  ");
        int valueOne = scanner.nextInt();

        System.out.print("Masukkan Angka ke-Dua :  ");
        int valaueTwo = scanner.nextInt();

        int result = valueOne + valaueTwo;

        System.out.println("Hasil penjumlahan adaklah : " + result);
    }
}
