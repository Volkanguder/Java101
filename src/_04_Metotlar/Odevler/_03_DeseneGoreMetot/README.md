# Patika Java101
```
***Assignment Topic and Rule***
    Write a "Recursive" method in Java that follows the following rule according to the value of n obtained from the user, without using a loop.

Rule: Subtract the digit 5 from the entered number until the number becomes 0 or negative. Print the final value on the screen at each subtraction operation. After the number becomes negative or 0, add 5 again. Also, print the final value on the screen at each addition operation.

Scenarios
Value of N: 16
Output: 16 11 6 1 -4 1 6 11 16

Value of N: 10
Output: 10 5 0 5 10

Value of N: 25
Output: 25 20 15 10 5 0 5 10 15 20 25

Value of N: 5
Output: 5 0 5

***Program Structure***

    * The 'main' method represents the starting point of the program. The user is prompted to enter an integer (n), which is then assigned to the variable n.
    * A method named 'recursiveNumber' is defined. This method is recursively called based on a certain pattern, starting from a given number, and it prints the numbers on the screen.
    * In the 'recursiveNumber' method, the given number (n) is first printed on the screen.
    * Then, it is checked whether n is 0 or negative. If n is less than or equal to 0, which means it is negative or 0, the method is terminated using the 'return' statement.
    * If n is positive, the 'recursiveNumber' method calls itself with n subtracted by 5. This process continues until the n value becomes 0 or negative.
    * After the recursive call, if n is not zero, it is printed on the screen again.
    * The program runs in the 'main' method by using the 'recursiveNumber' method with the value of n, producing the desired output.
    * This program operates on the input value of n provided by the user, following a specific pattern to produce the results. The numbers decrease and then increase at each step, with the digit 5 being added or subtracted accordingly.
```

```
***Ödev Konusu ve Kural***
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü 
kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını 
çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 
0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini 
ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 

N Sayısı : 10
Çıktısı : 10 5 0 5 10 

N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 

N Sayısı : 5
Çıktısı : 5 0 5 

***Program Çalışma Yapısı***

    *'main' metodu programın başlangıç noktasını temsil eder. Kullanıcıdan bir 
tamsayı (n) girmesi istenir ve bu değer n değişkenine atanır.
    *'recursiveNumber' adında bir metot tanımlanmıştır. Bu metot, verilen bir sayıdan
başlayarak belirli bir desene göre özyineli (recursive) olarak çağrılır ve sayıları 
ekrana yazdırır.
    *'recursiveNumber' metodu içinde öncelikle verilen sayı (n) ekrana yazdırılır.
    *Ardından, kontrol edilir: Eğer n 0 veya daha küçükse, yani negatif veya sıfırsa, 
metot sonlandırılır (return kullanılarak).
    *Eğer n pozitif ise, recursiveNumber metodu kendisini n sayısından 5 çıkarılmış şekilde özyineli olarak çağırır. 
Bu işlem, n sayısı 0 veya negatif olana kadar devam eder.
    *Özyineli çağrı sonrasında, n değeri sıfır olmadığı durumda tekrar ekrana yazdırılır.
    *Program, 'main' metodu içinde recursiveNumber metoduyla n sayısını kullanarak çalışır ve istenen çıktıyı üretir.
    *Bu program, kullanıcının girdiği n sayısı üzerinde belirli bir desene göre işlem yaparak sonuçları ekrana basar.
Her adımda sayılar azalırken ve sonra artarken, 5 rakamının eklenip çıkarılması gerçekleştirilir.
```
[Patika](https://academy.patika.dev/courses/java101)
