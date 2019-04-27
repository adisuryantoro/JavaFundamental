package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone.operator;

public class Logic {
    //Operator Logic "&&, ||, !"
    //Value TRUS or Fales
    static int x = 10, y = 15;

    public static void main(String args[]){

        //Operator && TRUE if true condition or otherwise
        //Logic.x = 20;
        System.out.println((x < y) && ( y > x ));

        //Operator || TRUE if one is true, FALSE if condition not true
        //Logic.x = 20;
        //Logic.y = 10;
        System.out.println((x < y) || ( y > x ));

        //Operator ! (Negation) RIGHT to be WRONG, WRONG to be RIGHT
        //Logic.x = 20;
        System.out.println(!(x < y));


    }
}
