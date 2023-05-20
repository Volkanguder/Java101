package Donguler.Pratikler._06_ArmstrongSayilariBul;

import java.util.Scanner;

public class ArmstrongSayilariBul {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int sayi = input.nextInt();

        // Sayının orijinal değerini tutmak için bir değişken oluşturulur
        int orjinalSayi = sayi;
        // Basamakların toplamını tutmak için bir değişken oluşturulur
        int toplam = 0;

        while (sayi != 0) {
            // Sayının son basamağı bulunur
            int basamak = sayi % 10;
            // Basamak toplama eklenir
            toplam += basamak;
            // Sayıda son basamak çıkarılarak güncellenir
            sayi /= 10;
        }

        System.out.println("Girilen sayının basamakları toplamı : " + toplam);

        // Armstrong sayısı için basamakların üçüncü kuvvetlerinin toplamını tutmak için bir değişken oluşturulur
        int armstrongToplam = 0;
        // Sayıyı tekrar orjinal değeriyle günceller
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
