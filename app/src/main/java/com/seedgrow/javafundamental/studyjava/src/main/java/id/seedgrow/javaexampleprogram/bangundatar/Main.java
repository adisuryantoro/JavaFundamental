package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javaexampleprogram.bangundatar;

import java.util.Scanner;

public class Main {
    private static char choice;
    private static Scanner scanner = new Scanner(System.in);

    //Menampilkan pilihan
    public static void mainMenu(){
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("====================");
        System.out.print("Masukan Menu : ");
        choice = scanner.next().charAt(0);
    }

    public static void main(String[] args){
        //Deklarasi Variabel
        Rectangular rectangular;
        Triangle triangle;
        Circle circle;
        Plane plane;
        int s1, s2, r;

        //Inisialiasasi
        rectangular = new Rectangular();
        circle = new Circle();
        triangle = new Triangle();
        plane = new Plane();

        //Panggil method Menu
        mainMenu();

        //Kondisi untuk pilihan menu
        switch (choice){
            case '1': {
                System.out.println("Masukkan Panjang Persegi : ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan Lebar Persegi : ");
                s2 = scanner.nextInt();
                System.out.println("Luas Persegi Panjang : " + rectangular.luas(s1, s2));
                System.out.println("Keliling Persegi Panjang : " + rectangular.keliling(s1, s2));
                break;
            }
            case '2' :{
                System.out.println("Masukkan Panjang Sisi Persegi");
                s1 = scanner.nextInt();
                System.out.println("Luas Persgi : " + plane.luas(s1));
                System.out.println("Keliling Persegi : " + plane.keliling(s1));
                break;

            }
            case '3' :{
                System.out.println("Masukkan Alas Segitiga Siku : ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan Tinggi Segitiga Siku : ");
                s2 = scanner.nextInt();
                System.out.println("Luas Segitiga Siku : " + triangle.luas(s1, s2));
                System.out.println("Keliling Segitiga Siku : " + triangle.keliling(s1, s2));
                break;
            }
            case '4' : {
                System.out.println("Masukkan Jari-jari Lingkaran : ");
                r = scanner.nextInt();
                System.out.println("Luas Lingkaran : " + circle.luas(r));
                System.out.println("Keliling Lingkaran  : " + circle.keliling(r));
                break;

            }
        }
        System.out.println("\n");
        mainMenu();
    }
}
