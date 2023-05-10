package KosulluIfadelerVeKodBloklari.Pratikler._02_KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        //Kullanici girişi için gerekli sınıf tanımlanır
        Scanner scanner = new Scanner(System.in);

        //Değişkenler tanımlanır
        String inputPass, inputId, resetAnswer, newPass;

        // Örnek bir kullanıcı adı ve şifre
        String username = "user123";
        String password = "pass123";

        // Kullanıcıdan Id,şifre isteme
        System.out.print("Kullanıcı Adını Giriniz: ");
        inputId = scanner.nextLine();
        System.out.print("Kullanıcı Şifre Giriniz: ");
        inputPass = scanner.nextLine();

        // Şifrenin doğruluğunu kontrol etme
        if (inputPass.equals(password)) {
            System.out.println("Giriş Başarılı! "+inputId);
        } else {
            // Şifre yanlışsa kullanıcıya şifresini sıfırlamak isteyip istemediğini sorma
            System.out.print("Yanlış şifre! şifrenizi sıfırlamak istiyor musunuz? (Y/N): ");
            resetAnswer = scanner.nextLine();

            if (resetAnswer.equalsIgnoreCase("Y")) {
                // Yeni şifreyi isteme
                System.out.print("Lütfen yeni şifrenizi girin: ");
                newPass = scanner.nextLine();

                // Şifrelerin aynı olmadığını kontrol etme
                if (!newPass.equals(password)) {
                    System.out.println("Şifre güncellendi!");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre girin.");
                }
            } else {
                System.out.println("Parola sıfırlama iptal edildi!");
            }
        }
        scanner.close();
    }
}
