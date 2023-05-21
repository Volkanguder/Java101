package Donguler.Pratikler._09_AtmProjesi;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);
        String userName, pass;
        int attempts = 3;
        int balance = 1500;
        int choice;

        while (attempts > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            pass = input.nextLine();

            if (userName.equals("patika") && pass.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1- Para Yatırma
                            2- Para Çekme
                            3- Bakiye Sorgulama
                            4- Çıkış
                            """);
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int amount = input.nextInt();
                            balance += amount;
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz miktar: ");
                            int amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("Yetersiz bakiye!!!");
                            } else {
                                balance -= amount;
                            }
                        }
                        case 3 -> {
                            System.out.println("*************************");
                            System.out.println("Bakiyeniz: " + balance +" TL");
                            System.out.println("*************************");
                        }
                        case 4 -> System.out.println("Tekrar Görüşmek Üzere.");
                        default -> System.out.println("Geçersiz bir seçim yaptınız.");
                    }
                } while (choice != 4);
                break;
            } else {
                attempts--;
                System.out.println("Geçersiz Kullanıcı Adı ve Şifre. Lütfen tekrar deneyin.");
                if (attempts == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankayla iletişime geçin.");
                } else {
                    System.out.println("Kalan Hak: " + attempts);
                }
            }
        }
    }
}
