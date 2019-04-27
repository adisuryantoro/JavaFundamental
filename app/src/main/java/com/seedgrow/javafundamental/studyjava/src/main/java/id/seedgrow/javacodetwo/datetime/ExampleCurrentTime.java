package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.datetime;

public class ExampleCurrentTime {
    public static void main(String[] args){
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah : " + timeNow + "milliseconds");
    }
}
