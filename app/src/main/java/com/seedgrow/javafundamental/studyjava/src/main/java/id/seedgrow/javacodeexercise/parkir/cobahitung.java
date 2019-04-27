package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeexercise.parkir;

import java.util.Scanner;

public class cobahitung {
    public static void main(String[] args){
        String nama; //untuk nama mahasiswa
        double rata; //untuk nilai rata-rata

        int[] nilai = new int[100]; //untuk nilai yang diinputkan
        Scanner input = new Scanner(System.in); //membuat form input

        /* Mengambil data nama mahasiswa dan jumlah mata kuliahnya */
        System.out.print("Nama anda: ");
        nama = input.nextLine();

        System.out.print("Jumlah mata kuliah: ");
        double jml = input.nextInt();

        /* Mulai berhitung~ */
        int sum = 0; //deklarasi int dengan nama sum, digunakan untuk menjumlahkan nilai-nilai yg diinputkan
        for (int i=1; i<= jml ;i++ ) {
            try{
                System.out.print("Nilai MK"+i+": "); //print form input nilai sebanyak mata kuliah
                nilai[i] = input.nextInt(); //form nilai. Bertipe array supaya bisa dihitung
                sum += nilai[i]; //menjumlahkan nilai-nilai mata kuliah
            } catch (Exception e){
                e.printStackTrace();
                break;
            }
        }

        rata = sum/jml; //menghitung rata-rata: jumlah nilai dibagi total mata kuliah
        int jmls = (int)(jml); //mengkonvert jml (double) ke int

        /* Tampilkan hasil */
        System.out.println("\n"+nama+", Total nilai "+jmls+" mata kuliahmu= "+sum); //tampilkan output
        System.out.println("dengan rata-rata= "+rata); //tampilkan output lagi
    }
}

