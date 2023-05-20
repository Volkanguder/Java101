package Donguler.Pratikler._04_FaktoriyelHesapla;

import java.util.Scanner;

public class FaktoriyelHesapla {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        //N faktörü için Kullanıcıdan değer alınır
        System.out.print("N Değerini Girin: ");
        int n = input.nextInt();
        //R faktörü için Kullanıcıdan değer alınır
        System.out.print("R Değerini Girin: ");
        int r = input.nextInt();

        //N faktörü hesaplama
        int nFactorial = 1;
        int i = 1;
        while (i <= n) {
            nFactorial *= i; // Her adımda i değerini nFactorial ile çarparak faktöriyel hesaplar
            i++;
        }
        //R faktöriyeli hesaplama
        int rFactorial = 1;
        int j = 1;
        while (j <= r) {
            rFactorial *= j; // Her adımda j değerini rFactorial ile çarparak faktöriyel hesaplar
            j++;
        }
        // (N - R) faktöriyelini hesapla
        int nMinusRFactroial = 1;
        int k = 1;
        while (k <= n - r) {
            nMinusRFactroial *= k; // Her adımda k değerini nMinusRFactorial ile çarparak faktöriyel hesaplar
            k++;
        }

        //Kombinasyonu hesaplayıp yazdırma
        int result = nFactorial / (rFactorial * nMinusRFactroial);

        System.out.println("C(" + n + "," + r + ") = " + result);
    }
}
