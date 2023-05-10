package KosulluIfadelerVeKodBloklari.Pratikler._01_HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        //Kullanıcıdan veri alınabilmesi için Scanner sınıfı tanımlanır ve değişkenler tanımlanır
        Scanner scanner = new Scanner(System.in);
        int input1, input2, result;
        char islem;

        System.out.println("Hesap Makinesine Hoşgeldiniz!");

        // İlk sayıyı kullanıcıdan alın
        System.out.print("İlk sayıyı girin: ");
        input1 = scanner.nextInt();

        // İkinci sayıyı kullanıcıdan alın
        System.out.print("İkinci sayıyı girin: ");
        input2 = scanner.nextInt();

        // Kullanıcıdan yapılacak işlemi alın
        System.out.print("Yapılacak işlemi seçin (+, -, *, /): ");
        islem = scanner.next().charAt(0);

        // switch-case yapısı ile işlem seçimleri yapılır
        switch (islem) {
            case '+':
                result = input1 + input2;
                System.out.println("Toplama işlemi sonucu: " + result);
                break;
            case '-':
                result = input1 - input2;
                System.out.println("Çıkarma işlemi sonucu: " + result);
                break;
            case '*':
                result = input1 * input2;
                System.out.println("Çarpma işlemi sonucu: " + result);
                break;
            case '/':
                result = input1 / input2;
                System.out.println("Bölme işlemi sonucu: " + result);
                break;
            default:
                System.out.println("Yanlış işlem seçimi!");
                break;
        }
    }
}
