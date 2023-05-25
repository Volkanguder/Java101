package _07_DigerKonular.Pratikler._01_SayiTahminEtmeOyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminEt {
    public static void main(String[] args) {
        //Rastgele bir hedef sayı 0 ile 100 arasında oluşturulur
        Random random = new Random();
        int targetNumber = random.nextInt(101);

        //Değişkenlerin başlangıç değerleri atanır
        int guess;
        int attemptCount = 0;
        int remainingAttempts = 5;
        boolean found = false;

        //Kullanıcı girişi için Scanner sınıfından bir nesne oluşturulur
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");
        System.out.println("0 ile 100 arasında bir sayı seçildi. Bul bulabilirsen!");

        //Oyun döngüsü başlatılır
        while (!found && remainingAttempts > 0) {
            System.out.println("Kalan hakkınız: " + remainingAttempts);
            System.out.print("Tahmininizi girin: ");
            guess = scanner.nextInt();
            attemptCount++;

            //Kullanıcının tahmini hedef sayıyla karşılaştırılır
            if (guess == targetNumber) {
                found = true;
            } else if (guess < targetNumber) {
                System.out.println("Daha büyük bir sayı girin! Tekrar deneyin.");
            } else {
                System.out.println("Daha düşük bir sayı girin! Tekrar deneyin.");
            }
            //Doğru tahmin yapılmadığı durumda kalan hakkı azalt
            if (!found) {
                remainingAttempts--;
            }
        }

        //Sonuçlar ekrana yazdırılır
        if (found) {
            System.out.println("Tebrikler! Hedef sayıyı " + attemptCount + ". denemede buldunuz.");
        } else {
            System.out.println("Üzgünüm hakkınız bitti. Hedef sayı "+targetNumber+" idi.");
        }
    }
}
