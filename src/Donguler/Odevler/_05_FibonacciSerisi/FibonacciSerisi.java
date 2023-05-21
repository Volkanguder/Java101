package Donguler.Odevler._05_FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int numElements = input.nextInt();

        System.out.println(numElements + " Elemanlı Fibonacci Serisi:");

        int fib1 = 0; // İlk Fibonacci sayısı
        int fib2 = 1; // İkinci Fibonacci sayısı

        // İlk iki sayıyı ekrana yazdır
        System.out.print(fib1 + " " + fib2 + " ");

        for (int i = 3; i <= numElements; i++) {
            int fib3 = fib1 + fib2; // Yeni Fibonacci sayısı, önceki iki sayının toplamı

            System.out.print(fib3 + " ");

            fib1 = fib2; // İkinci Fibonacci sayısını bir önceki sayıya atama
            fib2 = fib3; // Yeni Fibonacci sayısını ikinci sayıya atama
        }
    }
}
