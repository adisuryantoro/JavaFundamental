package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.object;

public class Hewan {

    public void cetakNama(String nama){
        System.out.println("Nama Hewan : " + nama);
    }

    public static void main(String[] args){
        //Membuat objeck dengan nama "objectHewan"
        Hewan objectHewan = new Hewan();
        objectHewan.cetakNama("Kucing");
    }
}
