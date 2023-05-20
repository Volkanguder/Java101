package Donguler.Pratikler._03_GirilenSayininKuvvetiniBul;

import java.util.Scanner;

public class SayininKuvvetiniBul {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int n = input.nextInt();

        int i = 1;
        //i değeri n sayısına eşit veya ondan büyük olduğunda sonlanacak döngü hazırlanır
        while (i <= n) {
            //4'ün kuvveti hesaplanıp ekrana yazıdırılır
            int pow4 = (int) Math.pow(4, i);
            System.out.println("4^" + i + " = " + pow4);

            //5'in kuvveti hesaplanıp ekrana yazdırılır
            int pow5 = (int) Math.pow(5, i);
            System.out.println("5^" + i + " = " + pow5);

            i++;
        }
    }
}
