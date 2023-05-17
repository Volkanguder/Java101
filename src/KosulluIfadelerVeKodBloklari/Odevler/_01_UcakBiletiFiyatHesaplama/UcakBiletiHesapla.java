package KosulluIfadelerVeKodBloklari.Odevler._01_UcakBiletiFiyatHesaplama;

import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) :");
        int traveltype = input.nextInt();

        // Uçuşun normal tutarı hesaplanır (mesafe * 0.10)
        double normalFare = distance * 0.10;

        // Başlangıçta indirimli tutar, normal tutara eşitlenir
        double discountedFare = normalFare;

        // Geçerlilik kontrolü yapılır
        // Mesafe, yaş ve yolculuk tipi geçerli değilse hatalı veri mesajı yazdırılır
        if (distance <= 0 || age <= 0 || (traveltype != 1 && traveltype != 2)) {
            System.out.println("Hatalı veri girdiniz!!!");
            input.close();
            return;
        }
        // Yaşa göre indirim hesaplamaları yapılır
        if (age < 12) {
            // Kişi 12 yaşından küçükse bilet fiyatına %50 indirim uygulanır
            discountedFare -= normalFare * 0.50;
        } else if (age <= 24) {
            // Kişi 12-24 yaş arasındaysa bilet fiyatına %10 indirim uygulanır
            discountedFare -= normalFare * 0.10;
        } else if (age >= 65) {
            // Kişi 65 yaşından büyükse bilet fiyatına %30 indirim uygulanır
            discountedFare -= normalFare * 0.30;
        }

        // Yolculuk tipine göre indirim hesaplamaları yapılır
        if (traveltype == 2) {
            // Yolculuk tipi gidiş-dönüşse bilet fiyatına %20 indirim uygulanır
            discountedFare -= discountedFare * 0.20;

            // Toplam tutar gidiş-dönüş olduğu için iki katına çıkarılır
            discountedFare *= 2;
        }
        // Toplam tutar ekrana yazdırılır
        System.out.println("Toplam Tutar = " + discountedFare + " TL");
    }
}
