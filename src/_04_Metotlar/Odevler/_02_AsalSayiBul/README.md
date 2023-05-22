# Patika Java101
```
Prime Number Checker using "Recursive" Method in Java

Scenario
Enter a Number: 22
22 is NOT a prime number!

Enter a Number: 2
2 is a prime number!

Enter a Number: 39
39 is NOT a prime number!

Enter a Number: 17
17 is a prime number!

***Program Structure***

    In this program, the isPrime method is a recursive function that checks if 
a given number is prime or not. Here's a breakdown of the program's structure:

    *The program starts by prompting the user to enter a number, which is 
stored in the number variable.
    *The isPrime method is responsible for checking if the number is prime.
    *Inside the isPrime method, there are several base cases and recursive steps.
    *If the number is less than or equal to 1, it is not prime, so the method 
returns false.
    *If the number is 2, it is the only even prime number, so the method returns 
true.
    *If the number is even (divisible by 2), it is not prime, so the method 
returns false.
    *If none of the above conditions are met, the method calls the recursive 
helper function isPrime(number, 3) with an initial divisor value of 3.
    *The recursive helper function checks if the divisor squared is greater than 
the number. If it is, the number is prime, and the method returns true.
    *If the number is divisible by the divisor, it is not prime, and the method 
returns false.
    *If none of the above conditions are met, the helper function increments the 
divisor by 2 and calls itself recursively with the updated divisor.
    *This process continues until one of the base cases is met.
    *Finally, based on the result returned by the isPrime method, the program 
displays a message indicating whether the number is prime or not.
```

```
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" 
sayı olup olmadığını bulan programı.

Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !

Sayı Giriniz : 39
39 sayısı ASAL değildir !

Sayı Giriniz : 17
17 sayısı ASALDIR !

***Programın Çalışma Yapısı***

    Bu programda, isPrime adlı metot, verilen numbernın asal olup olmadığını kontrol 
eder. İşte programın yapısının ayrıntıları:

    *Program, kullanıcıdan bir sayı girmesini isteyerek başlar ve bu sayı 
number değişkeninde saklanır.
    *isPrime metodu, numbernın asal olup olmadığını kontrol etmekten sorumludur.
    *isPrime metodu içinde birkaç temel durum ve özyineli adımlar bulunur.
    *Eğer number 1'e küçük veya eşitse, asal değildir ve metot false değerini 
döner.
    *Eğer number 2 ise, 2 tek çift asal numberdır ve metot true değerini döner.
    *Eğer number çift ise (2'ye tam bölünebiliyorsa), asal değildir ve metot 
false değerini döner.
    *Yukarıdaki koşulların hiçbiri karşılanmazsa, metot başlangıç bölen değeri 
olarak 3 ile yardımcı özyineli metodu isPrime(number, 3) çağırır.
    *Yardımcı özyineli metot, bölgenin karesinin numberdan büyük olup olmadığını 
kontrol eder. Eğer öyleyse, number asaldır ve metot true değerini döner.
    *Eğer sayı, bölene tam bölünebiliyorsa, asal değildir ve metot false 
değerini döner.
    *Yukarıdaki koşulların hiçbiri karşılanmazsa, bölgenin değerini 2 artırır ve 
yardımcı metodu özyineli olarak çağırır.
    *Bu işlem, temel durumlar karşılanana kadar devam eder.
    *Son olarak, isPrime metodu tarafından döndürülen sonuca bağlı olarak 
program, numbernın asal olup olmadığını belirten bir mesajı ekrana yazdırır.
```
[Patika](https://academy.patika.dev/courses/java101)
