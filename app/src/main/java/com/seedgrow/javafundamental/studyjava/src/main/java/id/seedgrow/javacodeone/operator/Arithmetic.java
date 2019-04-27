package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone.operator;

public class Arithmetic {
    // Operator Arithmetic "+, -, *, /, %, ++, --"

    //Declaration with the same type data are separated by commas
    static int x = 10, y = 15, result = 0;

    public static void main(String args[]){

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        //Operator +
        result = x + y;
        System.out.println("Results Additon: " + result);

        //Opetor -
        result = x - y;
        System.out.println("Results Reduction: " + result);

        //Opetor *
        result = x * y;
        System.out.println("Results Multiplication: " + result);

        //Opetor /
        result = x / y;
        System.out.println("Results Division: " + result);

        //Opetor %
        result = x - y;
        System.out.println("Results Modulus: " + result);

        //Opetor ++
        x++;
        System.out.println("Results level up: " + x);

        //Operator --
        y--;
        System.out.println("Results level down: " + y);



    }
}
