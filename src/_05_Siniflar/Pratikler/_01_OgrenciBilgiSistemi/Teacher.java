package _05_Siniflar.Pratikler._01_OgrenciBilgiSistemi;

public class Teacher {
    String name; // Öğretmenin adı
    String mpno; // Öğretmenin telefon numarası
    String branch; // Öğretmenin branşı

    // Öğretmenin adı, telefon numarası ve branşı ile birlikte Teacher nesnesi oluşturan constructor
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

