package TemelKavramlar.Pratikler._01_NotOrtalama;

import java.util.Scanner;

public class NotOrtalamaProgrami {
    public static void main(String[] args) {
        //Kullanıcıdan istenilecek değerlerin tanımlasının yapıldığı alan
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner kütüphanesinin tanımlaması ve import edildiği alan
        Scanner imp = new Scanner(System.in);

        //Kullanıcıdan derslerin değerlerini isteyeceğimiz alanlar
        System.out.print("Matematik Not Ortalamasını Girin : ");
        matematik = imp.nextInt();
        System.out.print("Fizik Not Ortalamasını Girin     : ");
        fizik = imp.nextInt();
        System.out.print("Kimya Not Ortalamasını Girin     : ");
        kimya = imp.nextInt();
        System.out.print("Türkçe Not Ortalamasını Girin    : ");
        turkce = imp.nextInt();
        System.out.print("Tarih Not Ortalamasını Girin     : ");
        tarih = imp.nextInt();
        System.out.print("Müzik Not Ortalamasını Girin     : ");
        muzik = imp.nextInt();

        //Kullanıcıdan alınan değerlerin önce toplamını sonrada ortalamasını yapacağımız alan
        int notToplam = (matematik + fizik + kimya + turkce + tarih + muzik);

        /* int tam sayı değişkeni içerisinde oluşturduğumuz "notToplam" ı şimdi ortalamasını alacağız fakat burada
        double değişkeni olarak atamalıyız çünkü ortalama ondalıklı olarak çıkabilir */
        double notOrtalama = notToplam / 6.0;

        //Ortalamasını çıkardığımız değeri kullanıcıya bildirdiğimiz alan
        System.out.println("Not ortalamanız : " + notOrtalama);

        //Not ortalamasına göre 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazdıracağımız alan
        System.out.println(notOrtalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}

