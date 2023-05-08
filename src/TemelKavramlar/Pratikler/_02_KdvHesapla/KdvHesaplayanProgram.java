package TemelKavramlar.Pratikler._02_KdvHesapla;

import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        //Önce kullanıcıdan alınan para değerinin tanımlaması yapılır, para birimlerinde Double olması daha iyi olacaktır
        double para;

        //Scanner kütüphanesinin tanımlaması ve import edilir
        Scanner imp = new Scanner(System.in);

        //Şimdi kullanıcıya geri bildirimi için gerekli kodlama yapılır
        System.out.print("Ödenecek para değerini giriniz : ");
        para = imp.nextDouble();

        /*
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
        olarak KDV tutarı hesaplanır
        */
        if (para <= 1000) {
            System.out.println("KDV'siz Fiyat = " + para + " TL");
            System.out.println("KDV'li Fiyat  = " + ((para * 0.18) + para) + " TL");
            System.out.println("KDV tutarı    = " + para * 0.18 + " TL");
        } else {
            System.out.println("KDV'siz Fiyat = " + para + " TL");
            System.out.println("KDV'li Fiyat  = " + ((para * 0.08) + para) + " TL");
            System.out.println("KDV tutarı    = " + para * 0.08 + " TL");
        }

        //KDV hesaplamayı if-else kullanmadan yapmak istersek;

        /*

        double kdvOrani = para > 1000 ? 0.08 : 0.18;
        double kdvTutari = para * kdvOrani;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz fiyat: " + para + " TL");
        System.out.println("KDV oranı: %" + (kdvOrani * 100));
        System.out.println("KDV tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li fiyat: " + kdvliFiyat + " TL");

         */
    }
}
