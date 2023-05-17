package KosulluIfadelerVeKodBloklari.Odevler._02_CinZodyagiHesaplama;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int birthYear = input.nextInt();

        // Çin Zodyağı burçlarını içeren bir dizi oluşturulur
        String[] chineseZodiac = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        // Doğum yılına göre Çin Zodyağı burcunun indeksi hesaplanır
        int zodiacIndex = birthYear % 12;

        // Çin Zodyağı burcunun adı alınır
        String zodiacSign = chineseZodiac[zodiacIndex];

        System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
    }
}
