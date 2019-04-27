package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javaexampleprogram;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ConsonantVowels {

    public static int numVokal(@NotNull String word) {
        int i;
        int jumVokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'I' || word.charAt(i) == 'U' || word.charAt(i) == 'E' || word.charAt(i) == 'O') {
                jumVokal++;
            }
        }
        return jumVokal;
    }

    public static int numKosnonan(@NotNull String word) {
        int i;
        int jumKonsonan = 0;

        for (i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (word.charAt(i) != 'A' && word.charAt(i) != 'I' && word.charAt(i) != 'U' && word.charAt(i) != 'E' && word.charAt(i) != 'O' && word.charAt(i) != ' '){
                jumKonsonan ++;
            }
        }
        return jumKonsonan;
    }

    public static void main(String[] args){
        //Perulangan dengan String
        //Deklarasi Variable
        String word =  "";
        int vokal = 0;
        int konsonan = 0;

        //Masukkan Kalimat
        System.out.println("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        //Memanggil prosedur yang mengembalikan nilai data int
        vokal = numVokal(word);
        konsonan = numKosnonan(word);

        System.out.println("Jumlah huruf vokal : " + vokal);
        System.out.print("Jumlah huruf konsonan : " + konsonan);
    }
}
