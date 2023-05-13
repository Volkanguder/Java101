package KosulluIfadelerVeKodBloklari.Pratikler._04_SicakligaGoreEtkinlik;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan veri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int heat = input.nextInt();
        // Girilen sıcaklık değerine göre koşul yapısı oluşturulur ve uygun etkinlik önerisi yazdırılır.
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinema keyfi yapabilirsiniz.");
        } else if (heat <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzme yapabilirsiniz.");
        }
    }
}