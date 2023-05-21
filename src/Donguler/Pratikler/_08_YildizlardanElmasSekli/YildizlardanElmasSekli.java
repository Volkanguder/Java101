package Donguler.Pratikler._08_YildizlardanElmasSekli;

import java.util.Scanner;

public class YildizlardanElmasSekli {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin : ");
        int height = input.nextInt();

        //Üst yarı kısmı oluşturma
        for (int i = 1; i <= height; i++) {
            //Boşlukları yazırmak için
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            //Yıldızları yazdırmak için
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Alt yarı kısmı oluşturma
        for (int i = height - 1; i >= 1; i--) {
            //Boşlukları yazdırmak için
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            //Yıldızları yazdırmak için
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
