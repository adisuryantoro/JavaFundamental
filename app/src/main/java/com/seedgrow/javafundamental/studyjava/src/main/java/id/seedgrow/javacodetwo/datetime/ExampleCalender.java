package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleCalender {
    public static void main(String[] args){
        //Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Date hari ini adalah : " + calendar.getTime());

        System.out.println();

        //Menampilkan date secara di custom
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun : " + calendar.get(Calendar.YEAR));

        System.out.println();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
        String dateFormat = simpleDateFormat.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal setelah di format : " + dateFormat);
    }
}
