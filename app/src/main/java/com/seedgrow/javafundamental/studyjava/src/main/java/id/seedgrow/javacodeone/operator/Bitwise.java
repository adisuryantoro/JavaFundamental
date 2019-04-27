package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone.operator;

public class Bitwise {
    //Operator Bitwise for representation biner, "&, |, ^, ~, >> n, << n"

    static int x = 60, y = 97;

    public static void main(String args[]){

        //Operator &
        System.out.println(x & y);

        //Operator |
        System.out.println(x | y);

        //Operator ^
        System.out.println(x ^ y);

        //Operator ~
        System.out.println( ~y );

        //Operator >> 2
        System.out.println(x >> 2);

        //Operator << 2
        System.out.println(y << 2);
    }
}
