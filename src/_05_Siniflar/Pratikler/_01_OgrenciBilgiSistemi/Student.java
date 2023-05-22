package _05_Siniflar.Pratikler._01_OgrenciBilgiSistemi;

public class Student {
    String name; // Öğrencinin adı
    String stuNo; // Öğrenci numarası
    int classes; // Sınıfı
    Course mat; // Matematik dersini temsil eden Course nesnesi
    Course fizik; // Fizik dersini temsil eden Course nesnesi
    Course kimya; // Kimya dersini temsil eden Course nesnesi
    double average; // Genel ortalama
    boolean isPass; // Geçme durumu

    // Öğrencinin adı, sınıfı, öğrenci numarası ve aldığı dersler ile birlikte Student nesnesi oluşturan constructor
    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage(); // Ortalamayı hesapla
        this.isPass = false; // Başlangıçta geçme durumu false olarak ayarlanır
    }

    // Matematik, fizik ve kimya derslerine toplu olarak not ekleyen metot
    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    // Öğrencinin geçme durumunu kontrol eden ve notları ekrana yazdıran metot
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote(); // Notları ekrana yazdır
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    // Genel ortalama hesaplama metodu
    public void calcAverage() {
        double oralExamWeight = 0.20; // Sözlü notun etki yüzdesi
        double examWeight = 0.80; // Sınav notunun etki yüzdesi

        // Her dersin sınav notunu ve sözlü notunu ortalama hesaplamaya dahil eder
        double matAverage = (this.mat.note * oralExamWeight) + (this.mat.note * examWeight);
        double fizikAverage = (this.fizik.note * oralExamWeight) + (this.fizik.note * examWeight);
        double kimyaAverage = (this.kimya.note * oralExamWeight) + (this.kimya.note * examWeight);

        // Genel ortalama hesaplaması
        this.average = (matAverage + fizikAverage + kimyaAverage) / 3;
    }

    // Geçme durumunu kontrol eden metot
    public boolean isCheckPass() {
        calcAverage(); // Ortalamayı hesapla
        return this.average > 55; // Ortalama 55'ten büyükse geçme durumu true döner
    }

    // Öğrencinin notlarını ekrana yazdıran metot
    public void printNote() {
        System.out.println("===========================================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note + " (Öğretmen: " + this.mat.courseTeacher.name + ")");
        System.out.println("Fizik Notu: " + this.fizik.note + " (Öğretmen: " + this.fizik.courseTeacher.name + ")");
        System.out.println("Kimya Notu: " + this.kimya.note + " (Öğretmen: " + this.kimya.courseTeacher.name + ")");
    }
}
