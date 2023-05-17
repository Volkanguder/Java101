package KosulluIfadelerVeKodBloklari.Pratikler._06_BurcBulanProgram;

import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        //Kullanıcıya doğum ayını girmesi istenir ve girilen değer ay değişkenine atanır.
        System.out.print("Doğum gününüzün ayını girin (1-12 arasında) : ");
        int month = input.nextInt();

        //Kullanıcıya doğum gününü girmesi istenir ve girilen değer gun değişkenine atanır.
        System.out.print("Doğum gününüzün gününü girin (1-31 arasında): ");
        int day = input.nextInt();

        //"zodiac" adlı bir boş dize (string) oluşturulur. Bu değişken, sonradan kullanıcıya atanacak burç değerini temsil eder.
        String zodiac = "";

        //Burç Hesaplama işlemleri
        if ((month == 1 && day >= 22) || (month == 2 && day <= 18)) {
            // 22 Ocak - 18 Şubat arası Kova burcudur
            zodiac = "Kova";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            // 19 Şubat - 20 Mart arası Balık burcudur
            zodiac = "Balık";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            // 21 Mart - 20 Nisan arası Koç burcudur
            zodiac = "Koç";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 20)) {
            // 21 Nisan - 20 Mayıs arası Boğa burcudur
            zodiac = "Boğa";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            // 21 Mayıs - 21 Haziran arası İkizler burcudur
            zodiac = "İkizler";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            // 22 Haziran - 22 Temmuz arası Yengeç burcudur
            zodiac = "Yengeç";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            // 23 Temmuz - 22 Ağustos arası Aslan burcudur
            zodiac = "Aslan";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            // 23 Ağustos - 22 Eylül arası Başak burcudur
            zodiac = "Başak";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            // 23 Eylül - 22 Ekim arası Terazi burcudur
            zodiac = "Terazi";
        } else if ((month == 10 && day >= 23) || month == 11 && day <= 21) {
            // 23 Ekim - 21 Kasım arası Akrep burcudur
            zodiac = "Akrep";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            // 22 Kasım - 21 Aralık arası Yay burcudur
            zodiac = "Yay";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            // 22 Aralık - 21 Ocak arası Oğlak burcudur
            zodiac = "Oğlak";
        } else {
            //Yanlış bilgiler girilirse eğer kullanıcı bilgilendirilerek programı sonlandıracak kodumuz
            System.out.println("Geçersiz Tarih girdiniz!");
            System.exit(0);
        }
        //Girilen bilgiler doğruysa ekrana yazdıracağımız satır
        System.out.println("Burcunuz : " + zodiac);
    }
}
