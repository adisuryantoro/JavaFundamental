package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.casting;

import com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.object.Hewan;

public class ExampleUpcastingDowncasting {
    public static void main(String[] args){
        KucingCasting anggora = new KucingCasting();

        //Secara implisit upcasting
        HewanCasting hewan = anggora;

        //secara explisit melakukan casting dari subclass ke superclass
        hewan = (HewanCasting) anggora;

        HewanCasting hewan2 = new KucingCasting();
        //donwcast hewan ke kuving, casting dari supserclass
        ((KucingCasting) hewan2).meow();
    }

}

