package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.object;

public class HewanNew {
    String nama;
    int berat, jumlahKaki;

    //Constructor di jalankan saat pertama kali object diciptakan
    public HewanNew(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat + "Kg");
        System.out.println("Jumlah Kaki : " + jumlahKaki + "\n");
    }
}
