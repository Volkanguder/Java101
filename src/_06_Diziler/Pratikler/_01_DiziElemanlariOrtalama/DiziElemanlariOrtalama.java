package _06_Diziler.Pratikler._01_DiziElemanlariOrtalama;

import java.util.Scanner;

public class DiziElemanlariOrtalama {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int n = input.nextInt(); // Kullanıcıdan dizinin uzunluğunu al

        double[] dizi = new double[n]; // n elemanlı bir double dizisi oluştur

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            dizi[i] = input.nextDouble(); // Kullanıcıdan dizinin elemanlarını al
        }

        double harmonikToplam = 0;

        // Dizideki elemanların harmonik toplamını hesapla
        for (int i = 0; i < n; i++) {
            harmonikToplam += 1 / dizi[i];
        }

        double harmonikOrtalama = n / harmonikToplam; // Harmonik ortalamayı hesapla

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}
