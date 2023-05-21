package _04_Metotlar.Odevler._01_UsHesabiYap;

import java.util.Scanner;

public class UsHesabi {

    // Recursive metot kullanarak üs alma işlemini gerçekleştiren fonksiyon
    static int power(int base, int exponent) {
        // Üs değeri 0 ise tabanın üssü 0'ın her zaman 1 olduğunu döndürür.
        if (exponent == 0) {
            return 1;
        } else {
            // Üs değeri sıfırdan farklı ise, tabanı kendisiyle bir kez daha çarparak üssü bir azaltır.
            // Bu işlem, recursive olarak devam eder ve sonuç bulunana kadar tekrarlanır.
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz :");
        int exponent = input.nextInt();

        //power metodu çağırılarak üs alma işlemi gerçekleştirilir.
        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
