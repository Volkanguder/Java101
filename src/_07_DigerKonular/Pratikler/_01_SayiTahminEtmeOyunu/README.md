# Patika Java101
------------
## Sayı Tahmin Oyunu
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

------------
## Programın Çalışma Mantığı ve Yapılar Arasındaki İlişkiler:
1. Program başladığında, `Random` sınıfı kullanılarak 0 ile 100 arasında bir sayı üretilir ve `targetNumber` değişkenine atanır. Bu, hedef sayıyı belirlemek için yapısal bir ilişki sağlar.

2. Kullanıcıya, "**0 ile 100 arasında bir sayı tahmin edin**" şeklinde bir mesaj gösterilir. Kullanıcının tahminini almak için `Scanner` sınıfı kullanılır. Bu, kullanıcının programla etkileşime geçmesini sağlar.

3. Kullanıcının tahminini almak için bir döngü başlatılır. Her döngü adımında kullanıcının tahmini alınır ve `targetNumber` ile karşılaştırılır. Bu, döngü ve karar yapılarının bir ilişkisini oluşturur.

4. Eğer kullanıcının tahmini `targetNumber` ile eşleşirse, "**Tebrikler, doğru tahmin ettiniz!**" şeklinde bir mesaj gösterilir ve döngü sonlanır. Bu, doğru tahmin durumunda bir kontrol yapısını temsil eder.

5. Eğer kullanıcının tahmini `targetNumber`'dan küçük ise, "**Daha yüksek bir sayı tahmin edin**" şeklinde bir mesaj gösterilir ve kullanıcının kalan hakkı bir azaltılır. Bu, yanlış tahmin durumunda bir kontrol yapısını ve kullanıcının hakkının azaltılmasını temsil eder.

6. Eğer kullanıcının tahmini `targetNumber`'dan büyük ise, "Daha düşük bir sayı tahmin edin" şeklinde bir mesaj gösterilir ve kullanıcının kalan hakkı bir azaltılır. Bu, yanlış tahmin durumunda bir kontrol yapısını ve kullanıcının hakkının azaltılmasını temsil eder.

7. Kullanıcının toplam 5 hakkı vardır. Eğer kullanıcının hakkı biterse ve doğru tahmin yapamazsa, "**Hakkınız bitti. Doğru sayı** `[targetNumber]`** idi**." şeklinde bir mesaj gösterilir. Bu, kullanıcının hakkının kontrol edilmesini ve doğru tahmin yapamaması durumunda bir çıktı oluşturulmasını temsil eder.

8. Program, kullanıcının doğru tahmin ettiği haklardan düşmez, yalnızca yanlış tahminler için kalan hakkı azaltır. Bu, kullanıcının tahminlerinin kontrol edilmesini ve hakların yönetilmesini temsil eder.

9. Programın sonunda, kullanıcıya oyunun sonlandığı ve çıkmak isteyip istemediği sorulur. Bu, programın sonlandırılması veya tekrar oynanması seçeneklerini sunar.


### Programın çıktısı:

```
Sayı Tahmin Oyununa Hoş Geldiniz!
0 ile 100 arasında bir sayı seçildi. Bul bulabilirsen!
Kalan hakkınız: 5
Tahmininizi girin: 50
Daha büyük bir sayı girin! Tekrar deneyin.
Kalan hakkınız: 4
Tahmininizi girin: 90
Daha büyük bir sayı girin! Tekrar deneyin.
Kalan hakkınız: 3
Tahmininizi girin: 99
Daha düşük bir sayı girin! Tekrar deneyin.
Kalan hakkınız: 2
Tahmininizi girin: 95
Daha büyük bir sayı girin! Tekrar deneyin.
Kalan hakkınız: 1
Tahmininizi girin: 97
Tebrikler! Hedef sayıyı 5. denemede buldunuz.
```

------------

------------

## Number Guessing Game
We are creating a "Number Guessing Game" program in Java where the program randomly selects a number between 0 and 100 and asks the user to guess it.

------------
## Program Logic and Relationships between Structures:
1. When the program starts, a random number between 0 and 100 is generated using the `Random` class and assigned to the `targetNumber` variable. This establishes the relationship to determine the target number.

2. The user is prompted with a message "**0 ile 100 arasında bir sayı tahmin edin**". The `Scanner` class is used to get the user's guess. This allows interaction between the user and the program.

3. A loop is initiated to take the user's guess. At each iteration, the user's guess is taken and compared with the `targetNumber`. This creates a relationship between loop and conditional structures.

4. If the user's guess matches the `targetNumber`, a message "**Tebrikler, doğru tahmin ettiniz!**" is displayed, and the loop is terminated. This represents a conditional structure for correct guess.

5. If the user's guess is less than the `targetNumber`, a message "**Daha yüksek bir sayı tahmin edin**" is displayed, and the user's remaining attempts are reduced by one. This represents a conditional structure for incorrect guess and decreasing the user's attempts.

6. If the user's guess is greater than the `targetNumber`, a message "Guess a lower number" is displayed, and the user's remaining attempts are reduced by one. This represents a conditional structure for incorrect guess and decreasing the user's attempts.

7. The user has a total of 5 attempts. If the user exhausts all the attempts without guessing the correct number, a message "**You're out of attempts. The correct number was**` [targetNumber].`" is displayed. This represents checking the user's attempts and generating an output when they fail to guess the correct number.

8. The program does not deduct correct guesses from the user's attempts, only reduces the remaining attempts for incorrect guesses. This represents the management of user's guesses and attempts.

9. At the end of the program, the user is asked if they want to quit or play again. This provides the option to terminate the program or play again.



------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)