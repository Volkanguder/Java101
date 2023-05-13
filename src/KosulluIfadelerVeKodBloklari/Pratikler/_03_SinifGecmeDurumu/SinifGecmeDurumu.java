package KosulluIfadelerVeKodBloklari.Pratikler._03_SinifGecmeDurumu;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        //Kullanıcıdan bilgi girişi için Scanner sınıfını ve Değişkenlerimizi tanımlıyoruz
        Scanner scanner = new Scanner(System.in);
        int matematikNotu, fizikNotu, turkceNotu, kimyaNotu, muzikNotu, gecerliDersSayisi, toplamNot;
        double notOrtalamasi;

        // Matematik notu istenir
        System.out.print("Matematik notunuzu girin: ");
        matematikNotu = scanner.nextInt();

        // Fizik notu istenir
        System.out.print("Fizik notunuzu girin    : ");
        fizikNotu = scanner.nextInt();

        // Türkçe notu istenir
        System.out.print("Türkçe notunuzu girin   : ");
        turkceNotu = scanner.nextInt();

        // Kimya notu istenir
        System.out.print("Kimya notunuzu girin    : ");
        kimyaNotu = scanner.nextInt();

        // Müzik notu istenir
        System.out.print("Müzik notunuzu girin    : ");
        muzikNotu = scanner.nextInt();

        // Geçerli notlar için not ortalaması hesaplanır
        // İlk olarak, gecerliDersSayisi değişkenine 0 değeri atanır
        gecerliDersSayisi = 0;
        toplamNot = 0;

        /*
        Eğer kullanıcının girdiği Matematik notu 0 ile 100 arasında ise (matematikNotu >= 0 && matematikNotu <= 100
        ifadesi true değerini döndürürse), Matematik notu toplamNot değişkenine eklenir (toplamNot += matematikNotu)
        ve geçerli ders sayısı bir arttırılır (gecerliDersSayisi++).
         */
        if (matematikNotu >= 0 && matematikNotu <= 100) {
            toplamNot += matematikNotu;
            gecerliDersSayisi++;
        }

        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplamNot += fizikNotu;
            gecerliDersSayisi++;
        }

        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplamNot += turkceNotu;
            gecerliDersSayisi++;
        }

        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplamNot += kimyaNotu;
            gecerliDersSayisi++;
        }

        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplamNot += muzikNotu;
            gecerliDersSayisi++;
        }

        if (gecerliDersSayisi > 0) {
            notOrtalamasi = (double) toplamNot / gecerliDersSayisi;

            // Not ortalaması 55 den büyük ise "Sınıfı geçti" yazdırılır
            if (notOrtalamasi >= 55) {
                System.out.println("Not ortalaması: " + notOrtalamasi + " Sınıfı geçti.");
            } else {
                System.out.println("Not ortalaması: " + notOrtalamasi + " Sınıfta kaldı.");
            }
        } else {
            System.out.println("Hatalı giriş. Geçerli not giriniz.");
        }
    }
}
