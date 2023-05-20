package Donguler.Pratikler._07_HarmonikSayilariBul;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int n = input.nextInt();

        double sum = 0.0;
        int i = 1;
        while (i <= n) {
            sum += 1.0 / i; // Her bir terim için 1/i hesaplanarak toplama eklenir
            i++;
        }
        System.out.println("Girilen sayının harmonik serisi : " + sum);
    }
}
