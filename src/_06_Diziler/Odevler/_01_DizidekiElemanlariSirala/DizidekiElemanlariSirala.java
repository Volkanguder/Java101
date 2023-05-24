package _06_Diziler.Odevler._01_DizidekiElemanlariSirala;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSirala {
    public static void main(String[] args) {
        // Kullanıcıdan dizinin boyutunu almak için Scanner sınıfını kullanıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan alıyoruz.
        System.out.print("Dizinin boyutu n: ");
        int size = scanner.nextInt();

        // Kullanıcının girdiği boyuta uygun bir dizi oluşturuyoruz.
        int[] array = new int[size];

        // Kullanıcıdan dizinin elemanlarını alıyoruz.
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralamak için Arrays sınıfının sort() metodunu kullanıyoruz.
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdırıyoruz.
        System.out.print("Sıralama: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
