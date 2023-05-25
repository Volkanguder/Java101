# Patika Java101
------------
## Matris Transpozunu Bulma
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

------------
## Programın Çalışma Mantığı ve Yapılar Arasındaki İlişkiler:
1. İki boyutlu bir dizi olan "matrix" adında bir matris oluşturulur.

   - Matris: İki boyutlu bir dizi kullanılarak oluşturulan bir veri yapısıdır. Satır ve sütunlardan oluşur.
2. Kullanıcıdan matrisin boyutlarını alınır.

   - Boyutlar: Kullanıcı, matrisin kaç satır ve sütundan oluştuğunu belirlemek için giriş yapar. Bu değerler matrisin boyutunu tanımlar.

3. Kullanıcıdan matrisin elemanlarını alınır.

   - Kullanıcı Girişi: Kullanıcı, matrisin elemanlarını girerek matrisin hücrelerini doldurur.

4. Matrisin transpozunu bulunur.
   -  Transpoz Hesaplama: Matrisin satır ve sütunlarını yer değiştirerek transpoz matrisi oluşturulur. Her matris elemanı transpozda aynı satırda yer alır.

5. Transpoz matrisi ekrana yazdırılır.
   - Yazdırma: Transpoz matrisi ve elemanları ekrana yazdırılır. Sonuç olarak, matrisin satırları sütunlar haline gelir ve sütunlar satırlar haline gelir.

> Bu şekilde program, kullanıcıdan alınan matrisin boyutları ve elemanları kullanarak matrisin transpozunu hesaplar ve ekrana yazdırır.


### Programın çıktısı:

```
Matris: 
2 3 4 
5 6 7 
Transpoze: 
2 5 
3 6 
4 7 
```

------------

------------

## Find Matrix Transpose
Write a program in Java to find the transpose of a matrix created with multi-dimensional arrays.

Taking the transpose of a matrix means swapping the rows and columns with the same indices. The resulting matrix obtained from this operation is the transpose of the original matrix. At this stage, the transpose of an kxn matrix becomes an nxk matrix. Let's consider a matrix A. The transpose of matrix A is denoted as A^T.

------------
## Program Logic and Relationships between Structures:
1. Create a two-dimensional array called matrix.
   - Matrix: It is a data structure created using a two-dimensional array. It consists of rows and columns.

2. Obtain the dimensions of the matrix from the user.
   - Dimensions: The user provides input to determine the number of rows and columns of the matrix. These values define the size of the matrix.

3. Get the elements of the matrix from the user.
   - User Input: The user enters the elements of the matrix, filling in the cells of the matrix.

4. Find the transpose of the matrix.
   - Transpose Calculation: By interchanging the rows and columns of the matrix, the transpose matrix is created. Each element of the matrix occupies the same row in the transpose.

5. Print the transpose matrix.
   - Printing: The transpose matrix, along with its elements, is printed to the screen. As a result, the rows of the matrix become columns, and the columns become rows.

> In this way, the program calculates the transpose of the matrix based on the dimensions and elements provided by the user and prints it to the screen.



------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)