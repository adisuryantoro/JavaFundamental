package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javaexampleprogram.bangundatar;

public class Circle implements BangunDatar{

    private double phi = 3.1414;

    Circle(){}

    @Override
    public double luas(int s1, int s2){
        return 0;
    }

    @Override
    public double keliling(int s1, int s2){
        return 0;
    }

    //Metode Overload
    public double luas(int r){
        return (phi * r * r);
    }

    public double keliling(int r){
        return (2 * phi * r);
    }
}

