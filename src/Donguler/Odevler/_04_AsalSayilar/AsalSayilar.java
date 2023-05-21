package Donguler.Odevler._04_AsalSayilar;

public class AsalSayilar {
    public static void main(String[] args) {

        System.out.println("Asal Sayılar (1 - 100):");

        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            // Sayının asal olup olmadığını kontrol etmek için iç döngü
            for (int j = 2; j < i; j++) {
                // Eğer sayı j'ye tam bölünürse, asal değişkenini false yap ve iç döngüden çık
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            // asal değişkeni hala true ise, sayı asaldır ve ekrana yazdırılır
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
