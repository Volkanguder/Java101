package Donguler.Pratikler._09_AtmProjesi;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int hak = 3;
        int bakiye = 1500;
        int secim;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parolanız: ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1- Para Yatırma
                            2- Para Çekme
                            3- Bakiye Sorgulama
                            4- Çıkış
                            """);
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int miktar = input.nextInt();
                            bakiye += miktar;
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz miktar: ");
                            int miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Yetersiz bakiye!!!");
                            } else {
                                bakiye -= miktar;
                            }
                        }
                        case 3 -> {
                            System.out.println("*************************");
                            System.out.println("Bakiyeniz: " + bakiye +" TL");
                            System.out.println("*************************");
                        }
                        case 4 -> System.out.println("Tekrar Görüşmek Üzere.");
                        default -> System.out.println("Geçersiz bir seçim yaptınız.");
                    }
                } while (secim != 4);
                break;
            } else {
                hak--;
                System.out.println("Geçersiz Kullanıcı Adı ve Şifre. Lütfen tekrar deneyin.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankayla iletişime geçin.");
                } else {
                    System.out.println("Kalan Hak: " + hak);
                }
            }
        }
    }
}
