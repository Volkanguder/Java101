package Donguler.Pratikler._10_EbokEkokBul;

import java.util.Scanner;

public class EbokEkokBul {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Girin : ");
        int num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin : ");
        int num2 = input.nextInt();

        int gcd = 1; // İki sayının En Büyük Ortak Bölgen (EBOB) değeri
        int lcm = 1; // İki sayının En Küçük Ortak Katı (EKOK) değeri
        int i = 1; // Döngüde kullanılacak sayaç değeri

        while (i <= num1 && i <= num2) {
            // Her adımda, i değeri 1 artırılır ve num1 ve num2'den küçük veya eşit olduğu sürece döngü çalışır
            if (num1 % i == 0 && num2 % i == 0) {
                // Eğer num1 ve num2, i'ye tam bölünüyorsa, i değeri ebob olarak güncellenir
                gcd = i;
            }
            i++;
        }
        lcm = (num1 * num2) / gcd; // EKOK değeri hesaplanır

        System.out.println("EBOB: " + gcd);
        System.out.println("EKOK: " + lcm);
    }
}
