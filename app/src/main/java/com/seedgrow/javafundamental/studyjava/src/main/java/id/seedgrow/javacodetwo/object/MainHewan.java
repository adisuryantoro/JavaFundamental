package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.object;

public class MainHewan {

    public static void main(String[] args){
        HewanNew Elang = new HewanNew("Elang");
        HewanNew Kucing = new HewanNew("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(6);
        Kucing.jumlahKakiHewan(4);
        Elang.cetakHewan();

    }
}
