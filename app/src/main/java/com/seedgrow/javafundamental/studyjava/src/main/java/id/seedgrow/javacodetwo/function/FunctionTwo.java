package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.function;

//Function dengan nilai balik
public class FunctionTwo {

    public static void main(String[] args){
        double nPanjang = 7;
        double nLuas = 6.5;

        //Memanggil Fungsi
        double hasil = hitungLuas(nPanjang, nLuas);
        System.out.println("Hasilnya adalah : " + hasil);
    }

    private static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
