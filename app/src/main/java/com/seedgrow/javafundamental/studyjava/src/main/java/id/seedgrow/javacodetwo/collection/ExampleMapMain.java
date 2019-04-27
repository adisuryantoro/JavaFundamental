package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.collection;

import java.util.HashMap;
import java.util.Map;

public class ExampleMapMain {
   public static void main(String[] args) {
            //Menggunakan HashMap
            Map<String, ExampleMap> planets = new HashMap<>();
            //method put() untul menambahkan object ke Map
            planets.put("Key-1", new ExampleMap("Mercury", 0.66));
            planets.put("Key-2", new ExampleMap("Venus", 0.82));
            planets.put("Key-3", new ExampleMap("Earth", 1.00));
            //menambahkan ke Map dengan key yang sama
            planets.put("Key-4", new ExampleMap("Mars", 0.11));
            planets.put("Key-4", new ExampleMap("Mars-X", 0.11));

            //method size() untuk check panjnag Map
            System.out.println("Map planets awal: (Size = " + planets.size() + ")");
            //looping key dari map
            for (String key : planets.keySet()) {
                //method get() untuk melihat isi Map berdasarkan key
                System.out.println("\t" + key + " : " + planets.get(key));
            }

            System.out.println();
            //remove Map berdasrkan key
            planets.remove("Key-2");

            System.out.println("Map planets setalah di remove : (Size = " + planets.size() + ")");
            //looping dari value map
            for (ExampleMap planet : planets.values()) {
                System.out.println("\t" + planet);
            }

        }
}
