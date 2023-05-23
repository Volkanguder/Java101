package _06_Diziler.Pratikler._02_MaxMinDegerBul;

import java.util.Arrays;

public class MaxMinDegerBul {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int enteredNumber = 5;
        Integer closestSmaller = null; // Girilen sayıdan küçük en yakın sayıyı tutacak değişken
        Integer closestLarger = null; // Girilen sayıdan büyük en yakın sayıyı tutacak değişken

        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Girilen Sayı: " + enteredNumber);

        for (int element : array) { // Dizi elemanları üzerinde tek tek döner
            if (element < enteredNumber) { // Eleman, girilen sayıdan küçükse
                if (closestSmaller == null || element > closestSmaller) { // enYakinKucuk değişkeni boşsa veya eleman mevcut en küçük sayıdan büyükse
                    closestSmaller = element; // enYakinKucuk değişkeni güncellenir
                }
            }
            if (element > enteredNumber) { // Eleman, girilen sayıdan büyükse
                if (closestLarger == null || element < closestLarger) {  // enYakinBuyuk değişkeni boşsa veya eleman mevcut en büyük sayıdan küçükse
                    closestLarger = element; // enYakinBuyuk değişkeni güncellenir
                }
            }
        }
        // Girilen sayıdan küçük en yakın sayının kontrolü ve çıktının yazdırılması
        if (closestSmaller == null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        }
        // Girilen sayıdan büyük en yakın sayının kontrolü ve çıktının yazdırılması
        if (closestLarger == null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        }
    }
}
