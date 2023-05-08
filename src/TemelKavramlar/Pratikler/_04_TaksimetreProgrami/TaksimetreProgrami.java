package TemelKavramlar.Pratikler._04_TaksimetreProgrami;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        //değişkenlerimizi tanımlıyoruz
        double mesafe, tutar;

        //Kullanıcıdan veri alıp (Scanner sınıfı ile) onu işliyoruz
        Scanner km = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi (KM cinsinden) giriniz: ");
        mesafe = km.nextDouble();

        //Alınan veriyi ödenecek ücret tespiti için kullanıyoruz
        //Tutar değişkenine, açılış ücreti (10 TL) ve gidilen mesafe başına hesaplanan ücret (2.20 TL) çarpımı eklenir
        tutar = 10 + (mesafe * 2.20);
        //Ücretin minimum 20 TL olması için bir kontrol yapılır. Eğer hesaplanan tutar 20 TL'den az ise, tutar 20 TL olarak belirlenir.
        tutar = (tutar < 20) ? 20 : tutar;

        //Hesaplanan tutar ekrana yazdırılır
        System.out.println("Toplam tutar : " + tutar + " TL");
    }
}
