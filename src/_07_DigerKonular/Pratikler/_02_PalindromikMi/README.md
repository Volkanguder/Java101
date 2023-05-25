# Patika Java101
------------
##  Palindromik Kelimleri Bulan Program
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak

------------

## Programın Çalışma Mantığı

1. Kullanıcıdan bir kelime girmesi istenir.
2. Girilen kelimenin palindromik olup olmadığı kontrol edilir. Palindromik bir kelime, tersten okunduğunda da aynı olan bir kelimedir.
3. Kelimenin palindromik olup olmadığını belirlemek için aşağıdaki adımlar izlenir:

   - Başlangıç ve bitiş indeksleri oluşturulur. Başlangıç indeksi 0 olarak ayarlanırken, bitiş indeksi kelimenin son indeksi olarak belirlenir.
   - Başlangıç ve bitiş indeksleri arasındaki karakterler karşılaştırılır. Eğer farklı bir karakter bulunursa, kelime palindromik değildir ve program sonlanır.
   - Başlangıç indeksi bir sonraki karaktere, bitiş indeksi bir önceki karaktere kaydırılır ve adımlar tekrarlanır.
   - İşlem bitene kadar veya farklı bir karakter bulunana kadar adımlar devam eder.
   - Eğer tüm karakterler eşleşirse, kelime palindromik olarak kabul edilir.

4. Sonuçlar ekrana yazdırılır:

   - Eğer kelime palindromik ise, "**Girdiğiniz kelime palindromiktir.**" mesajı gösterilir.
   - Eğer kelime palindromik değilse, "**Girdiğiniz kelime palindromik değildir.**" mesajı gösterilir.


## Programın Kullanılan Yapıları

- `Scanner:` Kullanıcıdan girdi almak için Scanner sınıfı kullanılmıştır.
- `String:` Kullanıcının girdiği kelimeyi temsil etmek için String veri tipi kullanılmıştır.
- `int:` Döngülerde kullanılan değişkenlerin tutulması için int veri tipi kullanılmıştır.
-  `for` **döngüsü:** Kelimenin karakterlerini karşılaştırmak için for döngüsü kullanılmıştır.
- `if-else if-else` **yapısı:** Kelimenin palindromik olup olmadığını kontrol etmek için if-else if-else yapısı kullanılmıştır.
- `return` **ifadesi:** Fonksiyonun palindromik olup olmadığını belirleyen boolean değeri döndürmek için return ifadesi kullanılmıştır.


### Programın çıktısı:

```
Bir kelime girin: malumat
Girdiğiniz kelime palindromik değildir.
```
```
Bir kelime girin: kabak
Girdiğiniz kelime palindromiktir.
```

------------

------------

## Palindrome Word Finder Program
We are writing a program in Java that checks if the word entered by the user is "Palindrome".

If a word reads the same backwards as forwards, it is called a "Palindrome Word".

Example: madam, noon, mom, rotor, wow

------------
## Working Principle and Relationships between Structures

### Working Principle

1. The user is prompted to enter a word.
2. The program checks if the entered word is a palindrome. A palindrome is a word that reads the same backwards as forwards.
3. The following steps are followed to determine if the word is a palindrome:

   - Start and end indices are created. The start index is set to 0, and the end index is set to the last index of the word.
   - The characters between the start and end indices are compared. If a different character is found, the word is not a palindrome, and the program terminates.
   - The start index is incremented by one, and the end index is decremented by one, and the steps are repeated.
   - The steps continue until the process is completed or a different character is found.
   - If all characters match, the word is considered a palindrome.

4. The results are printed to the console:

   - If the word is a palindrome, the message "**Girdiğiniz kelime palindromiktir.**" is displayed.
   - If the word is not a palindrome, the message "**Girdiğiniz kelime palindromik değildir.**" is displayed.


### Structures Used in the Program (English)

- `Scanner:` Used to get input from the user.
- `String:` Used to represent the entered word.
- `int:` Used to store variables used in loops.
- `for` **loop:** Used to compare the characters of the word.
- `if-else if-else` **structure:** Used to check if the word is a palindrome.
- `return` **statement:** Used to return the boolean value that determines if the word is a palindrome.



------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)