package TemelKavramlar.Odevler._02_ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        // meyveler ve kilogram fiyatları için değişkenler tanımlanır
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcının gireceği kilo değerleri için scanner oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // Kullanıcının girdiği değerleri tutmak için değişkenleri oluşturuyoruz
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        // Kullanıcıdan meyve kilo değerlerini alıyoruz
        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo = input.nextDouble();

        // Toplam tutarı hesaplıyoruz
        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo)
                + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        // Toplam tutarı ekrana yazdırıyoruz ve sonuca birim olarak Türk Lirası (TL) ekliyoruz
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
