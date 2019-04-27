package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone.variabel;

public class Constans {
    static int radius;
    //Contans marked with the FINAL and variable with Uppercase
    static final double PI = 3.14;

    public static void main(String args[]){
        //cannot be changed value
        //Constans.PI = 3.14159;
        Constans.radius = 7;
        double luas = Constans.radius * Constans.radius * Constans.PI;

        System.out.println("Jari-jari: " + Constans.radius);
        System.out.println("Luas: " + luas);
    }
}
