package KosulluIfadelerVeKodBloklari.Odevler._03_ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz : ");
        int year = input.nextInt();

        //Boolean artikYil (leapYear) değişkeni başlangıçta false (yanlış) olarak tanımlanıyor.
        boolean leapYear = false;

        //Yılın 4'e bölümü kontrol edilir
        if (year % 4 == 0) {
            //Yılın 100'e bölümü kontrol edilir
            if (year % 100 == 0) {
                //Yılın 400'e bölümü kontrol edilir
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        //Artık yıl duruma göre çıktı verilir
        if (leapYear) {
            System.out.println(year + " bir artık yıldır! ");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
