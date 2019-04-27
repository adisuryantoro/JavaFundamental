package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.overloading;

public class OverloadingOne {

    public static void main(String[] args){
        double nPanjang = 7;
        double nLuas = 6.5;

        //Memanggil Fungsi
        double hasil = hitungLuas(nPanjang, nLuas);
        System.out.println("Hasilnya adalah : " + hasil);

        int nPanjang1 = 7;
        int nLuas2 = 6;

        //Memanggil Fungsi
        int hasil2 = hitungLuas(nPanjang1, nLuas2);
        System.out.println("Hasilnya adalah : " + hasil2);


    }

    private static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    private static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
