package Donguler.Odevler._03_TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            // Boşlukları basamak sayısına bağlı olarak azaltan iç döngü
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları basamak sayısına bağlı olarak çizen iç döngü
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Her satırın sonunda bir satır atlama
        }
    }
}
