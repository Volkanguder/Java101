package _06_Diziler.Pratikler._04_DizideTekrarEdenCiftSayilar;

import java.util.Arrays;

public class DizideTekrarEdenCiftSayilar {
    // Bu metot, verilen değerin bir dizide bulunup bulunmadığını kontrol eder.
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list1 = {9, 0, 2, 11, 6, 0, 21, 11, 2, 9, 4, 5, 3, 6, 4, 3, 12};
        Arrays.sort(list1); // Dizi sıralanır.

        int[] duplicate = new int[list1.length]; // Tekrar eden sayıları tutmak için bir dizi oluşturulur.
        int counter = 0; // Tekrar eden sayıların sayısını takip etmek için sayaç tanımlanır.

        // Döngülerle tekrar eden sayılar bulunur.
        for (int i = 0; i < list1.length; i++) {
            for (int k = 0; k < list1.length; k++) {
                if ((i != k) && (list1[i] == list1[k])) { // Farklı indekslerde eşit olan sayılar bulunur.
                    if (!isFind(duplicate, list1[i])) { // Sayı daha önce eklenmemişse,
                        duplicate[counter++] = list1[i]; // duplicate dizisine eklenir ve sayaç artırılır.
                        break;
                    }
                }
            }
        }

        // Çift sayılar ekrana yazdırılır.
        for (int value : duplicate) {
            if ((value != 0) && value % 2 == 0) { // Sıfırdan farklı ve çift sayılar kontrol edilir.
                System.out.println(value);
            }
        }
    }
}
