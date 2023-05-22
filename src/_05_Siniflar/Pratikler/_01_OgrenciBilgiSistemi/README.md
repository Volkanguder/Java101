# Patika Java101

------------
## Öğrenci Not Sistemi
**Course Sınıfı Özellikleri :**

**Nitelikler :** name,code,prefix,note,Teacher

**Metotlar :** Course() , addTeacher() , printTeacher()

------------
**Teacher Sınıfı Özellikleri :**

**Nitelikler :** name,mpno,branch

**Metotlar :** Teacher()

------------
**Student Sınıfı Özellikleri :**

**Nitelikler :** name,stuNo,classes,course1,course2,course3,avarage,isPass

**Metotlar :** Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

------------
> ##### Ödev

- > Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
- > Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
- > Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
- > Fizik Ortalaması : (90 * 0.20) + (60* 0.80);


## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri

1. Programda dört sınıf bulunmaktadır: "**Student**" (Öğrenci), "**Course**" (Ders), "**Teacher**" (Öğretmen) ve "**OgrenciBilgiSistemi**" (Ana) sınıfı.
2. "**Course**" sınıfı, bir dersin özelliklerini ve dersin öğretmenini temsil eder. Dersin adı, kodu, ön eki ve bir öğretmeni vardır.
3. "**Teacher**" sınıfı, bir öğretmenin adını, telefon numarasını ve branşını temsil eder.
4. "**Student**" sınıfı, bir öğrencinin adını, sınıfını, öğrenci numarasını ve aldığı dersleri temsil eder. Ayrıca öğrencinin aldığı dersler için sınav notlarını ve ortalama notunu hesaplar.
5. "**OgrenciBilgiSistemi**" sınıfı, programın başlangıç noktasını temsil eder. Burada örnek öğrenciler, dersler ve 
   öğretmenler oluşturulur.
6. Öğrencilerin notları, sınav notları olarak ve sözlü notları olarak kaydedilir. Sınav notları, "**addBulkExamNote**" metodu kullanılarak eklenir.
7. Her öğrenci için geçme durumu kontrol edilir. Öğrencinin aldığı derslerin tamamı için notlar girildiyse, ortalama hesaplanır ve geçme durumu belirlenir.
8. Geçme durumu ve notlar ekrana yazdırılır. Öğrencinin aldığı derslerin notları ve öğretmenleri görüntülenir.
9. Programın çalışması sonucunda çıktılar elde edilir ve ekrana yazdırılır.

### Programın çıktısı:


    ****************************
    Ders Adı: Matematik
    Ders Kodu: MAT101
    Ders Öğretmeni: Elon MUSK
    ****************************
    Ders Adı: Fizik
    Ders Kodu: FZK101
    Ders Öğretmeni: Bill GATES
    ****************************
    Ders Adı: Kimya
    Ders Kodu: KMY101
    Ders Öğretmeni: Steve JOBS
    ===========================================
    Öğrenci: Volkan GÜDER
    Matematik Notu: 50 (Öğretmen: Elon MUSK)
    Fizik Notu: 20 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 36.666666666666664
    Sınıfta Kaldı.
    ===========================================
    Öğrenci: Zafer BİÇER
    Matematik Notu: 100 (Öğretmen: Elon MUSK)
    Fizik Notu: 50 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 63.333333333333336
    Sınıfı Geçti.
    ===========================================
    Öğrenci: Caner ZENGİN
    Matematik Notu: 50 (Öğretmen: Elon MUSK)
    Fizik Notu: 20 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 36.666666666666664
    Sınıfta Kaldı.

------------

------------

## Student Grade System
**Course Class Properties:**

**Attributes:** name, code, prefix, note, teacher

**Methods:** Course(), addTeacher(), printTeacher()

------------
**Teacher Class Properties:**

**Attributes:** name, mpno, branch

**Methods:** Teacher()

------------
**Student Class Properties:**

**Attributes:** name, stuNo, classes, course1, course2, course3, average, isPass

**Methods:** Student(), addBulkExamNote(), isPass(), calcAverage(), printNote()

------------
> ##### Homework

- > Add the verbal exam grade section to the Course class and specify its effect on the overall grade for each course separately. Include the verbal grades in the average calculation based on the percentage of impact.

- > Example: If the verbal grade's impact on the Physics course is 20%, then the exam grade's impact is 80%.

- > If the student gets 90 from the verbal exam and 60 from the written exam for a course, the effect of that course on the overall average is calculated as follows:

- > Physics Average: (90 * 0.20) + (60 * 0.80);

------------
## General working logic of the program and relationships between the structures
1. The program consists of four classes: "**Student**", "**Course**", "**Teacher**", and "**OgrenciBilgiSistemi**".
2. The "**Course**" class represents the properties of a course and its teacher. It has attributes such as name, code, prefix, and a teacher.
3. The "**Teacher**" class represents the properties of a teacher, including their name, phone number, and branch.
4. The "**Student**" class represents the properties of a student, including their name, class, student number, and the courses they take. It also calculates the exam grades and average grades for the student.
5. The "**OgrenciBilgiSistemi**" class represents the starting point of the program. Here, sample students, courses, and teachers are created.
6. The students' grades are recorded as exam grades and verbal grades. Exam grades are added using the "**addBulkExamNote**" method.
7. The program checks the passing status for each student. If grades are entered for all the courses the student takes, the average is calculated, and the passing status is determined.
8. The passing status and grades are printed to the screen. The grades for the student's courses and their teachers are displayed.
9. The program produces the desired output and prints it to the screen.
### Program Output:

    ****************************
    Ders Adı: Matematik
    Ders Kodu: MAT101
    Ders Öğretmeni: Elon MUSK
    ****************************
    Ders Adı: Fizik
    Ders Kodu: FZK101
    Ders Öğretmeni: Bill GATES
    ****************************
    Ders Adı: Kimya
    Ders Kodu: KMY101
    Ders Öğretmeni: Steve JOBS
    ===========================================
    Öğrenci: Volkan GÜDER
    Matematik Notu: 50 (Öğretmen: Elon MUSK)
    Fizik Notu: 20 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 36.666666666666664
    Sınıfta Kaldı.
    ===========================================
    Öğrenci: Zafer BİÇER
    Matematik Notu: 100 (Öğretmen: Elon MUSK)
    Fizik Notu: 50 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 63.333333333333336
    Sınıfı Geçti.
    ===========================================
    Öğrenci: Caner ZENGİN
    Matematik Notu: 50 (Öğretmen: Elon MUSK)
    Fizik Notu: 20 (Öğretmen: Bill GATES)
    Kimya Notu: 40 (Öğretmen: Steve JOBS)
    Ortalama: 36.666666666666664
    Sınıfta Kaldı.

### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)