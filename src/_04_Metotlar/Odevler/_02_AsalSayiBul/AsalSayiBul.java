package _04_Metotlar.Odevler._02_AsalSayiBul;

import java.util.Scanner;

public class AsalSayiBul {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }
    // Sayının asal olup olmadığını kontrol eden özyineli (recursive) metot
    static boolean isPrime(int number) {
        // Temel durumlar
        if (number <= 1) {
            // Sayı 1'den küçük veya eşitse asal değildir
            return false;
        } else if (number == 2) {
            // Sayı 2 ise asaldır
            return true;
        } else if (number % 2 == 0) {
            // Sayı çift ise (2'ye tam bölünebiliyorsa) asal değildir
            return false;
        } else {
            // Yardımcı özyineli metodu başlangıç bölen değeriyle çağır
            return isPrime(number, 3);
        }
    }
    // Yardımcı özyineli (recursive) metot, sayının asal olup olmadığını kontrol eder
    static boolean isPrime(int number, int divisor) {
        // Temel durumlar
        if (divisor * divisor > number) {
            // Bölgenin karesi, sayıdan büyükse sayı asaldır
            return true;
        } else if (number % divisor == 0) {
            // Sayı, bölene tam bölünebiliyorsa asal değildir
            return false;
        } else {
            // Bölgenin değerini 2 artır ve yardımcı metodu özyineli olarak çağır
            return isPrime(number, divisor + 2);
        }
    }
}
