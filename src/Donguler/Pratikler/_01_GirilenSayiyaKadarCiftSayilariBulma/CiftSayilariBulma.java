package Donguler.Pratikler._01_GirilenSayiyaKadarCiftSayilariBulma;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int number = input.nextInt();

        int total = 0; // 3 ve 4'e tam bölünen çift sayıların toplamını tutmak için değişken
        int piece = 0; // 3 ve 4'e tam bölünen çift sayıların adedini tutmak için değişken

        System.out.println("Çift Sayılar: ");

        for (int i = 0; i <= number; i++) { // 0'dan kullanıcının girdiği sayıya kadar döngü
            if (i % 2 == 0) { //Çift sayı kontrolü
                System.out.print(i + " "); //Çift sayıları ekrana yazdırır

                if (i % 3 == 0 && i % 4 == 0) { // 3 ve 4'e tam bölünme kontrolü
                    total += i; // Sayıyı toplama ekleyerek toplamı güncelle
                    piece++; // Adeti bir artır
                }
            }
        }
        System.out.println("\n");

        // Eğer en az bir çift sayı 3 ve 4'e tam bölünüyorsa ortalamayı hesaplayıp yazdır değilse kullanıcıyı bilgilendir
        if (piece > 0) {
            double average = (double) total / piece;
            System.out.println("3 ve 4'e tam bölünen çift sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen çift sayı bulunamadı.");
        }
    }
}
