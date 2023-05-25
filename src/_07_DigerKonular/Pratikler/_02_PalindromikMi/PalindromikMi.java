package _07_DigerKonular.Pratikler._02_PalindromikMi;

import java.util.Scanner;

public class PalindromikMi {
    public static void main(String[] args) {
        //Kullanıcı girişi için Scanner sınıfından bir nesne oluşturulur
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan bir kelime girmesi istenir
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        //Girdiğiniz kelimenin palindromik olup olmadığını kontrol eder
        if (isPalindrome(word)) {
            System.out.println("Girdiğiniz kelime palindromiktir.");
        } else {
            System.out.println("Girdiğiniz kelime palindromik değildir.");
        }
    }

    //Metot bir kelimenin palindromik olup olmadığını kontrol eder
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            //Kelimenin başından ve sonundan ilerleyerek karakterleri karşılaştırır
            // Eğer herhangi bir eşleşmeme durumu olursa false döner
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
