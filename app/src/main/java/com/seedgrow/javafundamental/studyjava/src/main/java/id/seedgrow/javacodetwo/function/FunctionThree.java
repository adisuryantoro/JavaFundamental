package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.function;

public class FunctionThree {

    public static void main(String[] args){
        //Memanggil Fungsi
        hitungLuas(7,6.5);
    }

    private static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
