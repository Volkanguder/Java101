# Patika Java101

------------
## Maaş Hesaplayıcı
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

**Sınıfın Nitelikleri**
- **name** : Çalışanın adı ve soyadı
- **salary** : Çalışanın maaşı
- **workHours** : Haftalık çalışma saati
- **hireYear** : İşe başlangıç yılı
  **Sınıfın Metotları**
- **Employee(name,salary,workHours,hireYear) **: Kurucu metot olup 4 parametre alacaktır.
- **tax()** : Maaşa uygulanan vergiyi hesaplayacaktır.
- Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
- **bonus()** : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
- **raiseSalary() **: Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- **toString() **: Çalışana ait bilgileri ekrana bastıracaktır.

------------
## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri
1. **Employee** sınıfı, çalışanların adını (**name**), maaşını (**salary**), çalışma saatlerini (**workHours**) ve işe başlama yılını (**hireYear**) temsil eden değişkenleri içerir.
2. Sınıfın kurucusu, **Employee** nesnesi oluşturulurken çalışanın bilgilerini alır ve ilgili değişkenlere atar.
3. **tax()** metodu, çalışanın maaşına bağlı olarak vergi miktarını hesaplar. Eğer maaş 1000'den büyükse, maaşın %3'ü kadar bir vergi uygulanır. Aksi takdirde vergi miktarı 0'dır.
4. **bonus()** metodu, çalışanın fazla mesai saatlerine bağlı olarak bonus miktarını hesaplar. Eğer çalışma saatleri 40'tan fazlaysa, her fazla mesai saati için saat başına 30 birim bonus verilir. Aksi takdirde bonus miktarı 0'dır.
5. **raiseSalary()** metodu, çalışanın işe başlama yılını baz alarak maaş artışını hesaplar. İşe başlama yılına bağlı olarak farklı oranlarda artışlar uygulanır. İşe başlama yılı 10 yıldan az ise maaşın %5'i kadar bir artış yapılır. İşe başlama yılı 10 ile 20 yıl arasındaysa maaşın %10'u kadar bir artış yapılır. İşe başlama yılı 20 yıldan fazlaysa maaşın %15'i kadar bir artış yapılır.
6. **printInfo()** metodu, çalışanın bilgilerini ve hesaplanan maaş detaylarını ekrana yazdırır. Çalışanın adı, maaşı, çalışma saatleri, işe başlama yılı, vergi miktarı, bonus miktarı, maaş artışı, vergi ve bonuslar düşüldükten sonra hesaplanan toplam maaş gibi bilgileri içerir.
7. **Factory** sınıfı, **main()** metodu içermektedir. Bu sınıf, **Employee** sınıfını kullanarak bir çalışan nesnesi oluşturur ve çalışanın bilgilerini ekrana yazdırır.
8. **main()** metodu, programın giriş noktasını temsil eder. Bu metot otomatik olarak çalıştırılır.
9. **Employee e1 = new Employee("Volkan", 2000, 45, 1985);** satırında **Employee** sınıfından e1 adında bir çalışan nesnesi oluşturulur. Oluşturulan nesne için çalışanın adı "Volkan" olarak belirlenir, maaşı 2000, haftalık çalışma saati 45 ve işe başlama yılı 1985 olarak atanır.
10. **e1.printInfo()**; satırıyla oluşturulan çalışan nesnesinin **printInfo()** metoduna erişilir ve çalışanın bilgileri ekrana yazdırılır. Bu metodun içinde, çalışanın adı, maaşı, çalışma saatleri, işe başlama yılı, vergi miktarı, bonus miktarı, maaş artışı, vergi ve bonuslar düşüldükten sonra hesaplanan toplam maaş gibi bilgiler yazdırılır.


### Programın çıktısı:

```
Adı: Volkan
Maaşı: 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0
```

------------

------------

## Salary Calculator
You should write a class in Java named "Employee" that represents factory employees and calculates their salaries using methods. This class will have 4 attributes and 5 methods.

**Attributes of the Class**
- **name**: The employee's name and surname.
- **salary**: The employee's salary.
- **workHours**: The weekly working hours.
- **hireYear**: The year of starting employment.

**Methods of the Class**
- **Employee(name, salary, workHours, hireYear)**: It is a constructor method that takes 4 parameters.
- **tax()**: Calculates the tax applied to the salary.
- If the salary is less than 1000 TL, no tax is applied.
- If the salary is greater than 1000 TL, a tax equal to 3% of the salary is applied.
- **bonus()**: Calculates the bonus amount based on the extra working hours.
- If the employee has worked more than 40 hours, a bonus fee of 30 TL is calculated for each additional hour.
- If the employee has worked 40 hours or less, no bonus is applied.
- **raiseSalary()**: Calculates the salary increase based on the year of starting employment. Consider the current year as 2021.
- If the employee has worked for less than 10 years, a 5% raise is applied to the salary.
- If the employee has worked for more than 9 years and less than 20 years, a 10% raise is applied to the salary.
- If the employee has worked for 19 years or more, a 15% raise is applied to the salary.
- **toString()**: Prints the information of the employee.

------------
## Overall Logic of the Program and Relationships Between Structures
1. The **Employee** class includes variables that represent the employee's name (**name**), salary (**salary**), work hours (**workHours**), and year of starting employment (**hireYear**).
2. The constructor of the class receives the employee's information when creating an **Employee** object and assigns it to the corresponding variables.
3. The **tax()** method calculates the tax amount based on the employee's salary. If the salary is greater than 1000, a tax equal to 3% of the salary is applied. Otherwise, the tax amount is 0.
4. The **bonus()** method calculates the bonus amount based on the employee's extra working hours. If the work hours are more than 40, a bonus of 30 TL is calculated for each additional hour. Otherwise, no bonus is applied.
5. The **raiseSalary()** method calculates the salary increase based on the year of starting employment. Different raise percentages are applied depending on the starting year. If the starting year is less than 10 years ago, a 5% raise is applied. If the starting year is more than 9 years and less than 20 years ago, a 10% raise is applied. If the starting year is 19 years ago or more, a 15% raise is applied.
6. The **printInfo()** method prints the employee's information and the calculated salary details. It includes the employee's name, salary, work hours, year of starting employment, tax amount, bonus amount, salary increase, and the total salary after deducting taxes and bonuses.
7. The **Factory** class includes the **main()** method. This class creates an employee object using the **Employee** class and prints the employee's information.
8. The **main()** method represents the entry point of the program. This method is automatically executed.
9. The line **Employee e1 = new Employee("Volkan", 2000, 45, 1985);** creates an employee object named **e1**. The employee's name is set as "Volkan", the salary is set as 2000, the weekly work hours are set as 45, and the starting year of employment is set as 1985.
10. The line **e1.printInfo();** accesses the **printInfo()** method of the created employee object and prints the employee's information, including the name, salary, work hours, starting year, tax amount, bonus amount, salary increase, and the total salary.


------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)