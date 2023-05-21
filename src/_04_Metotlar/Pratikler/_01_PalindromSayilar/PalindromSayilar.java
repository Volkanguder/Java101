package _04_Metotlar.Pratikler._01_PalindromSayilar;


public class PalindromSayilar {
    public static void main(String[] args) {

        /* Eğer kullanıcıdan veri alınacaksa bu yorum satırını kaldırıp
        Scanner sınıfını import edin ve 9889 tanımlanmış satırı yorum satırı yapın
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin");
        int number = input.nextInt();
        */

        int number = 9889;

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindromik sayıdır.");
        } else {
            System.out.println(number + " bir palindromik sayı değildir");
        }
    }

    //Bir sayının palindromik olup olmadığını kontrol eden metot
    static boolean isPalindrome(int number) {
        int reverse = 0; //Sayının tersini tutacak değişken
        int originalNumber = number; //Orjinal sayıyı tutacak değişken

        //Sayının basamaklarını ters çevirerek reverse değişkenini atar
        while (number != 0) {
            int remainder = number % 10; //Sayının son basamağını alır
            reverse = reverse * 10 + remainder; //Son basamağı reverse'e ekler
            number /= 10; //Sayıyı bir basamak sağa kaydırır
        }
        // Orijinal sayıyla ters çevrilmiş sayıyı karşılaştırır
        // Eşitse palindromik, değilse palindromik değil
        return originalNumber == reverse;
    }
}
