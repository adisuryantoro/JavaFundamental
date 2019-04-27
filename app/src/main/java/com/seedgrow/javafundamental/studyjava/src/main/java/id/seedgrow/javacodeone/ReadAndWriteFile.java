package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodeone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWriteFile {

    // Method tulis file
    public static void tulisFile(String teks, String namaFile) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(
                    new FileWriter(namaFile, true)));
            out.println(teks);
            out.close();
        } catch (IOException e) {
            System.out.println("Gagal menulis ke file " + namaFile);
            e.printStackTrace();
        }
    }

    // Method baca file
    public static String bacaFile(String namaFile) {
        BufferedReader br = null;
        String stringHasil = "";

        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(namaFile));
            while ((sCurrentLine = br.readLine()) != null) {
                stringHasil = stringHasil + sCurrentLine + "\n";
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca file " + namaFile);
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return stringHasil;
    }

    public static void main(String args[]) {
        String namaFile = "E:\\ContohTeksTwo.txt";

        System.out.print("Masukkan Teks: ");

        for (int i = 0; i < 5; i++) {
            ReadAndWriteFile.tulisFile("Teks ke-" + i, namaFile);
        }

        String hasil = ReadAndWriteFile.bacaFile(namaFile);
        System.out.println(hasil);
    }
}
