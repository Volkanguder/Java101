package Donguler.Odevler._01_MinMaxDegerBul;

import java.util.Scanner;

public class MinMaxDegerBul {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int min = 0;  // En küçük sayıyı saklamak için değişken
        int max = 0;  // En büyük sayıyı saklamak için değişken

        for (int i = 1; i <= n; i++) { // Bu döngü parçasında, i değişkeni 1'den başlayarak n sayısına kadar (dahil) arttırılır. Toplamda n tane sayı alınması için döner.
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = input.nextInt();

            if (i == 1) {
                // İlk girdiğimiz sayıyı hem en küçük hem de en büyük olarak kabul ediyoruz
                min = num;
                max = num;
            } else {
                // Diğer sayıları kontrol ederek en küçüğü ve en büyüğü güncelliyoruz
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        input.close();
    }
}
