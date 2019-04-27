package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args){
        //deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Adi";
        heroes[1] = "Haris";
        // heroes[2] = "Surya";  //error ArrayIndexOutOfBoundsException karena Array hanya berjumlah 2 tetapi di isi 3

        //deklarasi ArrasyList
        List planets = new ArrayList();
        //add untuk penambahan objek ke list
        //List masih bisa trus ditambahkan
        planets.add("Bumi");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Merkurius");

        System.out.println("List Planets Awal : ");
        //method size untuk mendapatkan ukutan List
        for (int i = 0; i < planets.size(); i++){
            //mthod get() untuk melihat isi list pada index ke ....
            System.out.println("\t index-"+ i + " = " + planets.get(i));
        }

        System.out.println();
        //method untuk mengapus object dari List
        planets.remove("Venus");

        System.out.println("List Planets setelah di Remove : ");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i + " = " + planets.get(i));
        }


    }
}
