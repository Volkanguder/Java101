package TemelKavramlar.Odevler._01_VucutKitleIndeksHesap;

import java.util.Scanner;

public class VKIHesaplayanProgram {
    public static void main(String[] args) {
        //Değişkenlerimiz tanımlanır
        double boy, kilo, vki;

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan boy uzunluğunu (metre cinsinden) al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        // Kullanıcıdan kilo değerini al
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        // Vücut Kitle İndeks değerini hesapla
        vki = kilo / (boy * boy);

        // Sonucu ekrana yazdır
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
