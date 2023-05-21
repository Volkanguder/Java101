# Patika Java101
```
Recursive Power Calculation
A program in Java that performs exponentiation using user-provided base and exponent values using a recursive method.

Scenario:

Enter the base value: 2
Enter the exponent value: 0
Result: 1

Enter the base value: 2
Enter the exponent value: 3
Result: 8

Enter the base value: 5
Enter the exponent value: 3
Result: 125

***Program Structure***

    *The program is defined within a class named RecursivePower.
    *It includes a static method named power, which is used to perform the 
exponentiation operation.
    *The parameters base and exponent represent the base and exponent values to 
be obtained from the user.
    *When the power method is called, it first checks if the exponent value is 
0. If it is, it returns 1 since any base raised to the power of 0 is always 1.
    *If the exponent value is not zero, the method recursively calls itself 
with the base decreased by 1 and multiplies the base by itself in each 
recursion. The exponent value is also decremented by 1.
    *This process continues until the exponent value reaches 0.
    *The power method is called with the base and exponent values obtained from 
the user, and the result is calculated.
    *The result is then displayed on the screen.
```

```
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini 
"Recursive" metot kullanarak yapan programı.

Senaryo

Taban değeri giriniz :2 Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125

***Program çalışma yapısı***

    *Program, RecursivePower adında bir sınıf içerisinde tanımlanmıştır.
power adında bir static metot, üs alma işlemini gerçekleştirmek için kullanılır.
base ve exponent parametreleri, kullanıcıdan alınacak olan taban ve üs 
değerlerini temsil eder.
    *İlk olarak power metodu çağrıldığında, kontrol edilir eğer üs değeri 0 ise 
tabanın üssü 0'ın her zaman 1 olduğu döndürülür.
    *Eğer üs değeri sıfırdan farklı ise, metot kendisini üssü bir azaltılmış 
tabanla tekrar çağırarak recursive (özyineli) bir şekilde çalışır. Her tekrarda 
taban, kendisiyle bir kez daha çarpılır ve üs değeri bir azaltılır.
    *Bu işlem, üs değeri 0'a ulaşıncaya kadar devam eder.
    *Kullanıcıdan alınan taban ve üs değerleri ile power metodu çağrılır ve 
sonuç elde edilir.
    *Sonuç ekrana yazdırılır.
```
[Patika](https://academy.patika.dev/courses/java101)
