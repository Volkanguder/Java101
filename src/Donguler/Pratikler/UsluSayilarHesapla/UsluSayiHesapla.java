package Donguler.Pratikler.UsluSayilarHesapla;

import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı (tabanı) Giriniz: ");
        int base = input.nextInt();

        System.out.print("Üssü Giriniz: ");
        int exponent = input.nextInt();

        // Result değişkeni başlangıçta 1 olarak tanımlanır
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            // Result değişkeni taban ile çarpılarak güncellenir
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
