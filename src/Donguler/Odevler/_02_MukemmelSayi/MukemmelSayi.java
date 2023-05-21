package Donguler.Odevler._02_MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int sum = 0; // Toplamı tutmak için sum değişkeni oluşturulur

        for (int i = 1; i < number; i++) { // 1'den başlayarak number-1'e kadar olan değerler için döngü oluşturulur
            if (number % i == 0) { // Eğer number i'ye tam bölünüyorsa
                sum += i; // i sayısı sum değişkenine eklenir
            }
        }

        if (sum == number) { // Eğer toplam number'a eşitse
            System.out.println(number + " Mükemmel sayıdır."); // Mükemmel sayıdır mesajı yazdırılır
        } else {
            System.out.println(number + " Mükemmel sayı değildir."); // Mükemmel sayı değildir mesajı yazdırılır
        }
    }
}
