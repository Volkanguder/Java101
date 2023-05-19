package Donguler.Pratikler._02_CiftVeDortunKatlari;

import java.util.Scanner;

public class CiftVeDortunKatlari {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        int sumCiftVeDortunKatlari = 0; // Çift ve 4'ün katı olan sayıların toplamını tutan değişken
        int number;

        do {
            //Döngünün en başında girilen sayının tek olup olmadığını kontrol eder. Eğer sayı tek ise döngü sona erer.
            System.out.print("Bir sayı girin (Tek bir sayı girerek çıkabilirsiniz): ");
            number = input.nextInt();

            if (number % 4 == 0) { //Girilen sayının 4'ün katı olup olmadığını kontrol eder
                sumCiftVeDortunKatlari += number; // Girilen sayı 4'ün katı ise toplama eklenir
            }
        } while (number % 2 != 1); // Girilen sayı tek olana kadar döngü devam eder

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sumCiftVeDortunKatlari);
    }
}
