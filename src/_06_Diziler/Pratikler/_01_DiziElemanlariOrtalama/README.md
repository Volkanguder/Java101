# Patika Java101

------------
## Dizideki Elemanların Ortalamasını Hesaplayan Program
Java'da Dizideki sayıların harmonik ortalamasını hesaplayan programı yazıyoruz.

**Harmonik Ortalama formülü : **n (eleman sayısı) / elemanların harmonik serisi


------------
## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri
1. Kullanıcıdan dizinin uzunluğu **(n)** alınır.
2. **n** uzunluğunda bir double dizisi oluşturulur.
3. Kullanıcıdan n adet sayı alınarak diziye atanır.
4. Harmonik toplamı hesaplamak için **harmonikToplam** adında bir değişken oluşturulur ve başlangıç değeri sıfır atanır.
5. Dizi elemanlarının harmonik toplamı hesaplanırken, her bir elemanın tersi alınarak **harmonikToplam** değişkenine eklenir.
6. Harmonik ortalamayı hesaplamak için **harmonikOrtalama** adında bir değişken oluşturulur ve **n** sayısına harmonikToplam'ın bölümü atanır.
7. Sonuç olarak, **harmonikOrtalama** değeri ekrana yazdırılır.
8. Program sona erer ve çalışmayı tamamlar.

> Bu programda **Scanner** sınıfı kullanılarak kullanıcıdan giriş alınır ve bu girişler diziye atanır. Ardından, döngüler kullanılarak dizinin elemanları üzerinde işlemler gerçekleştirilir. **double** türündeki değişkenler kullanılarak hesaplamalar yapılır ve sonuçlar ekrana basılır. Programın temel yapısı, kullanıcı girişi alma, dizi işleme ve matematiksel hesaplamaların yapıldığı adımlardan oluşur.


### Programın çıktısı:

```
Dizi uzunluğunu girin: 5
Dizi elemanlarını girin:
1
2
3
4
5
Dizinin harmonik ortalaması: 2.18978102189781
```

------------

------------

## Program to Calculate the Average of Array Elements.
We are writing a program in Java to calculate the harmonic mean of numbers in an array.

**Harmonic Mean formula: **n (number of elements) / harmonic series of the elements.

------------
## Overall Logic of the Program and Relationships Between Structures
1. The length of the array (n) is obtained from the user.
2. A double array of size n is created.
3. n numbers are obtained from the user and assigned to the array.
4. To calculate the harmonic sum, a variable named harmonicSum is created and initialized to zero.
5. While calculating the harmonic sum of the array elements, the reciprocal of each element is added to the harmonicSum variable.
6. To calculate the harmonic mean, a variable named harmonicMean is created and assigned the value of n divided by harmonicSum.
7. Finally, the value of harmonicMean is printed to the screen.
8. The program ends and execution is completed.

> In this program, the Scanner class is used to obtain user input, and these inputs are assigned to the array. Then, using loops, operations are performed on the array elements. Calculations are made using variables of type double, and the results are printed to the screen. The basic structure of the program consists of steps such as obtaining user input, processing the array, and performing mathematical calculations.


------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)