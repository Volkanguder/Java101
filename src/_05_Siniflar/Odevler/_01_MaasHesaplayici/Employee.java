package _05_Siniflar.Odevler._01_MaasHesaplayici;

public class Employee {
    String name;        // Çalışanın adını temsil eden değişken
    double salary;      // Çalışanın maaşını temsil eden değişken
    int workHours;      // Çalışanın haftalık çalışma saatini temsil eden değişken
    int hireYear;       // Çalışanın işe başlama yılını temsil eden değişken

    // Employee sınıfının kurucusu
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplamak için tax() metodu
    public double tax() {
        double tax = 0;
        if (salary > 1000) {    // Eğer maaş 1000'den büyükse vergi uygulanır
            tax += (salary * 3) / 100;   // Maaşın %3'ü kadar bir vergi hesaplanır
        } else {
            tax = 0;    // Maaş 1000 veya daha az ise vergi yoktur
        }
        return tax;
    }

    // Bonus hesaplamak için bonus() metodu
    public double bonus() {
        double bonusFee;
        if (workHours > 40) {    // Eğer çalışma saatleri 40'tan fazlaysa bonus verilir
            bonusFee = (workHours - 40) * 30;   // Her fazla mesai saati için saat başına 30 birim bonus hesaplanır
        } else {
            bonusFee = 0;    // Çalışma saatleri 40 veya daha az ise bonus yoktur
        }
        return bonusFee;
    }

    // Maaş artışını hesaplamak için raiseSalary() metodu
    public double raiseSalary() {
        double increasedSalary = 0;
        int yearsWorked = 2023 - hireYear;   // Çalışma yılı hesaplanır (2023, örnek bir yıldır)

        if (yearsWorked < 10) {
            increasedSalary += (salary * 5) / 100;   // İşe başlama yılı 10 yıldan az ise maaşın %5'i kadar bir artış yapılır
        }
        if (yearsWorked >= 10 && yearsWorked < 20) {
            increasedSalary += (salary * 10) / 100;  // İşe başlama yılı 10 ile 20 yıl arasında ise maaşın %10'u kadar bir artış yapılır
        }
        if (yearsWorked >= 20) {
            increasedSalary += (salary * 15) / 100;  // İşe başlama yılı 20 yıldan fazlaysa maaşın %15'i kadar bir artış yapılır
        }
        return increasedSalary;
    }

    // Çalışan bilgilerini yazdırmak için printInfo() metodu
    public void printInfo() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary()));
    }
}
