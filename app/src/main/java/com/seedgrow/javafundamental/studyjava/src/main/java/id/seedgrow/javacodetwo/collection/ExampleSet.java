package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args){
        //deklarasi HashSet
        Set<String> planets = new HashSet();
        //add untuk penambahan objek ke list
        //List masih bisa trus ditambahkan
        //Set hanya akan membaca satu list jika data yang di masukkan sama
        planets.add("Bumi");
        planets.add("Bumi");
        planets.add("Bumi");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Merkurius");

        System.out.println("List Planets Awal : (Size = "+ planets.size()+") ");
        //method size untuk mendapatkan ukutan List
        for (String planet : planets){
            //mthod get() untuk melihat isi list pada index ke ....
            System.out.println("\t" + planet);
        }

        System.out.println();
        //method untuk mengapus object dari List
        planets.remove("Venus");

        System.out.println("List Planets setelah di Remove : ");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t" +  iterator.next());
        }


    }
}
