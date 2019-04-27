package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone.operator;

public class Instanceof {

    static String message = "Allah yang Maha Kuasa atas Segalanya";

    //Check condition
    //Values TRUE or FALSE
    public static void main(String args[]) {
        Instanceof newmessage = new Instanceof();

        System.out.println(newmessage instanceof Instanceof);
        System.out.println(message instanceof String);
    }
}
