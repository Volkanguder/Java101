package _05_Siniflar.Pratikler._01_OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher; // Dersin öğretmenini temsil eden Teacher nesnesi
    String name; // Dersin adı
    String code; // Dersin kodu
    String prefix; // Dersin ön eki
    int note; // Ders notu

    // Dersin adı, kodu ve ön eki ile birlikte Course nesnesi oluşturan constructor
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    // Dersin öğretmenini atanmasını sağlayan metot
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            printCourseDetails();
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    // Dersin öğretmenini ekrana yazdıran metot
    public void printCourseDetails() {
        System.out.println("****************************");
        System.out.println("Ders Adı: " + this.name);
        System.out.println("Ders Kodu: " + this.code);
        System.out.println("Ders Öğretmeni: " + this.courseTeacher.name);
    }
}


