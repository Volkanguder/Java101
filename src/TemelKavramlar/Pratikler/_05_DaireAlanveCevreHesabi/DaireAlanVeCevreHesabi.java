package TemelKavramlar.Pratikler._05_DaireAlanveCevreHesabi;

import java.util.Scanner;

public class DaireAlanVeCevreHesabi {
    public static void main(String[] args) {

        //Değişkenleri tanımla
        int yaricap;
        double alan, cevre;
        double pi = 3.14;

        //Kullanıcı veri girişi için Scanner sınıfı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarıçapı al
        System.out.print("Dairenin yarıçapını (cm cinsinden) giriniz: ");
        yaricap = input.nextInt();

        // Dairenin alanını hesapla
        alan = Math.PI * yaricap * yaricap;

        // Dairenin çevresini hesapla
        cevre = 2.0 * pi * yaricap;

        // Sonuçları ekrana yazdır
        System.out.println("Dairenin Alanı: " + alan + " cm²");
        System.out.println("Dairenin Çevresi: " + cevre + " cm");
    }
}
