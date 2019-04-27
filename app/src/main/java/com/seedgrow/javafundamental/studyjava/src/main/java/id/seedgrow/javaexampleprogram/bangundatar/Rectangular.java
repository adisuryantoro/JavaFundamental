package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javaexampleprogram.bangundatar;

public class Rectangular implements BangunDatar {

    Rectangular(){}

    @Override
    public double luas(int s1, int s2){
        return (s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2){
        return (s1 + s2 );
    }
}
