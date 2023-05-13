package KosulluIfadelerVeKodBloklari.Pratikler._05_SayilariKucuktenBuyugeSiralama;

import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan veri alınır.
        Scanner input = new Scanner(System.in);

        // kullanıcıdan üç sayı girişi alınır
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int num2 = input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        int num3 = input.nextInt();

        int smallest = num1;
        int middle = num2;
        int largest = num3;

        // sıralama işlemi için üç sayı arasında karşılaştırma yapılır
        if (num1 < num2 && num1 < num3) { // num1 en küçük sayı ise
            smallest = num1;
            if (num2 < num3) { // num2 ortanca, num3 en büyük sayı ise
                middle = num2;
                largest = num3;
            } else { // num3 ortanca, num2 en büyük sayı ise
                middle = num3;
                largest = num2;
            }
        } else if (num2 < num1 && num2 < num3) { // num2 en küçük sayı ise
            smallest = num2;
            if (num1 < num3) { // num1 ortanca, num3 en büyük sayı ise
                middle = num1;
                largest = num3;
            } else { // num3 ortanca, num1 en büyük sayı ise
                middle = num3;
                largest = num1;
            }
        } else { // num3 en küçük sayı ise
            smallest = num3;
            if (num1 < num2) { // num1 ortanca, num2 en büyük sayı ise
                middle = num1;
                largest = num2;
            } else { // num2 ortanca, num1 en büyük sayı ise
                middle = num2;
                largest = num1;
            }
        }

        // sıralanmış üç sayı yazdırılır
        System.out.println("Girilen sayıların küçükten büyüğe sıralanması: " + smallest + " " + middle + " " + largest);
    }
}
