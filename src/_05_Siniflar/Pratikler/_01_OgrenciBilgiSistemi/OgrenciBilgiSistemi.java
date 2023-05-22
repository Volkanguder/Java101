package _05_Siniflar.Pratikler._01_OgrenciBilgiSistemi;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        // Derslerin oluşturulması
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        // Öğretmenlerin oluşturulması
        Teacher t1 = new Teacher("Elon MUSK", "90550000000", "MAT");
        Teacher t2 = new Teacher("Bill GATES", "90550000001", "FZK");
        Teacher t3 = new Teacher("Steve JOBS", "90550000002", "KMY");

        // Derslere öğretmenlerin atanması
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        // Öğrencilerin oluşturulması
        Student s1 = new Student("Volkan GÜDER", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();

        Student s2 = new Student("Zafer BİÇER", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();

        Student s3 = new Student("Caner ZENGİN", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
    }
}


