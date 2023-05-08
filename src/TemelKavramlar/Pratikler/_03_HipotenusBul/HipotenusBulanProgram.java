package TemelKavramlar.Pratikler._03_HipotenusBul;

import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz. Ondalıklı girişe karşı double olarak ayarladım
        double a, b, c;

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır ve alınan veriler değişkenlere atanır
        Scanner input = new Scanner(System.in);
        System.out.print("1. dik kenarın uzunluğunu giriniz :");
        a = input.nextDouble();
        System.out.print("2. dik kenarın uzunluğunu giriniz :");
        b = input.nextDouble();

        //Kullanıcıdan alınan verileri hesaplama(Math.sqrt karekök alan koddur)
        c = Math.sqrt((a * a) + (b * b));
        //Hipotenüs uzunluğunu ekrana yazdır
        System.out.println("Hipotenüs uzunluğu : " + c);
    }
}
