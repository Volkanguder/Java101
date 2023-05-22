package _04_Metotlar.Odevler._03_DeseneGoreMetot;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını girin: ");
        int n = input.nextInt();
        recursiveNumber(n);
    }

    //Recursive Metot
    static void recursiveNumber(int n) {
        System.out.print(n + " "); // Sayıyı ekrana yazdır

        // Eğer sayı 0 veya daha küçükse, negatif sayıyı ekrana yazdır ve işlemi sonlandır
        if (n <= 0) {
            System.out.print("");
            return;
        }
        //5 rakamını çıkararak metodu özyineli olarak çağır
        recursiveNumber(n - 5);
        System.out.print(n + " "); // Sayıyı ekrana yazdır
    }
}
