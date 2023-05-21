package _04_Metotlar.Pratikler._02_GelismisHesapMakinesi;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        //Kullanıcıdan veri alabilmek için Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            displayMenu(); // Menüyü göster
            choice = input.nextInt(); // Kullanıcının seçimini al

            switch (choice) {
                case 1 -> addition(); // Toplama işlemi
                case 2 -> subtraction(); // Çıkarma işlemi
                case 3 -> multiplication(); // Çarpma işlemi
                case 4 -> division(); // Bölme işlemi
                case 5 -> exponentiation(); // Üslü sayı hesaplama
                case 6 -> factorial(); // Faktoriyel hesaplama
                case 7 -> modulus(); // Mod alma
                case 8 -> rectangleOperations(); // Dikdörtgen alan ve çevre hesabı
                case 0 -> System.out.println("Çıkış yapılıyor..."); // Programdan çıkış
                default -> System.out.println("Geçersiz seçim! Tekrar deneyin."); // Hatalı seçim durumu
            }
        } while (choice != 0);
        input.close();
    }

        //Menüyü ekrana yazdıran metot
        static void displayMenu () {
            System.out.println("----------- Hesap Makinesi -----------");
            System.out.println("1. Toplama İşlemi");
            System.out.println("2. Çıkarma İşlemi");
            System.out.println("3. Çarpma İşlemi");
            System.out.println("4. Bölme İşlemi");
            System.out.println("5. Üslü Sayı Hesaplama");
            System.out.println("6. Faktoriyel Hesaplama");
            System.out.println("7. Mod Alma");
            System.out.println("8. Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0. Çıkış");
            System.out.print("Bir seçenek girin: ");
        }

        //Toplama işlemini gerçekleştiren metot
        static void addition () {
            Scanner input = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            double num1 = input.nextDouble();
            System.out.print("İkinci sayıyı girin : ");
            double num2 = input.nextDouble();

            // Toplama işlemi gerçekleştirilir ve sonuç hesaplanır
            double result = num1 + num2;
            System.out.println("Sonuç: " + result);
        }

        //Çıkarma işlemini gerçekleştiren metot
        static void subtraction () {
            Scanner input = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            double num1 = input.nextDouble();
            System.out.print("İkinci sayıyı girin : ");
            double num2 = input.nextDouble();

            // Çıkarma işlemi gerçekleştirilir ve sonuç hesaplanır
            double result = num1 - num2;
            System.out.println("Sonuç: " + result);
        }

        //Çarpma işlemini gerçekleştiren metot
        static void multiplication () {
            Scanner input = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            double num1 = input.nextDouble();
            System.out.print("İkinci sayıyı girin : ");
            double num2 = input.nextDouble();

            // Çarpma işlemi gerçekleştirilir ve sonuç hesaplanır
            double result = num1 * num2;
            System.out.println("Sonuç: " + result);
        }

        //Bölme işlemini gerçekleştiren metot
        static void division () {
            Scanner input = new Scanner(System.in);

            System.out.print("Bölünen sayıyı girin: ");
            double divinded = input.nextDouble();
            System.out.print("Bölen sayıyı girin  :");
            double divisor = input.nextDouble();

            // Bölen sıfır olduğunda bölme işlemi tanımsızdır
            if (divisor == 0) {
                System.out.println("Hata! Bölen sıfır '0' olamaz!!!"); // Hata mesajı yazdırılır
                return; // Metottan çıkılır
            }
            // Bölme işlemi gerçekleştirilir ve sonuç hesaplanır
            double result = divinded / divisor;
            System.out.println("Sonuç: " + result);
        }

        //Üslü sayı hesaplama işlemini gerçekleştiren metot
        static void exponentiation () {
            Scanner input = new Scanner(System.in);

            System.out.print("Taban sayıyı girin: ");
            double base = input.nextDouble();
            System.out.print("Üs sayıyı girin   :");
            double exponent = input.nextDouble();

            // Math.pow() metodu kullanılarak tabanın üssü hesaplanır
            double result = Math.pow(base, exponent);
            System.out.println("Sonuç: " + result);
        }

        //Faktoriyel hesaplama işlemini gerçekleştiren metot
        static void factorial () {
            Scanner input = new Scanner(System.in);

            System.out.print("Sayıyı girin: ");
            int number = input.nextInt();

            //Girilen sayı negatif olduğunda metottan çıkılır
            if (number < 0) {
                System.out.println("Hata!!! Negatif sayının faktoriyeli hesaplanamaz");
                return;
            }
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            System.out.println("Sonuç: " + result);
        }

        // Mod alma işlemini gerçekleştiren metot
        static void modulus () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bölünen sayıyı girin: ");
            int dividend = scanner.nextInt();

            System.out.print("Bölen sayıyı girin: ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                System.out.println("Hata! Bölen sıfır olamaz.");
                return;
            }

            int result = dividend % divisor;
            System.out.println("Sonuç: " + result);
        }

        // Dikdörtgen alan ve çevre hesaplama işlemlerini gerçekleştiren metot
        static void rectangleOperations () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Dikdörtgenin uzun kenarını girin: ");
            double length = scanner.nextDouble();

            System.out.print("Dikdörtgenin kısa kenarını girin: ");
            double width = scanner.nextDouble();

            double area = length * width;
            double perimeter = 2 * (length + width);

            System.out.println("Alan: " + area);
            System.out.println("Çevre: " + perimeter);
        }
    }
