package Donguler.Pratikler._06_ArmstrongSayilariBul;

import java.util.Scanner;

public class ArmstrongSayilariBul {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int sayi = input.nextInt();

        int orjinalSayi = sayi;
        int toplam = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.println("Girilen sayının basamakları toplamı : " + toplam);

        int armstrongToplam = 0;
        sayi = orjinalSayi;

        while (sayi != 0) {
            int basamak = sayi % 10;
            armstrongToplam += Math.pow(basamak, 3);
            sayi /= 10;
        }

        if (armstrongToplam == orjinalSayi) {
            System.out.println(orjinalSayi + " bir Armstrong sayısıdır");
        } else {
            System.out.println(orjinalSayi + " bir Armstrong sayısı değildir");
        }
    }
}
