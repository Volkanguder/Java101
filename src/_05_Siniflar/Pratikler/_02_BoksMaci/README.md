# Patika Java101

------------
## Boks Maçı
Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

### Ödev
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.

------------
## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri
1. Program, boks maçlarını simüle etmek için bir dizi sınıf kullanır.
2. "Fighter" sınıfı, bir dövüşçünün özelliklerini (adı, hasarı, sağlığı, ağırlığı, kaçma şansı) ve dövüşle ilgili işlevleri içerir.
> - "hit" metodu, dövüşçünün rakibine saldırmasını sağlar. Saldırı sonucunda hasar verilir ve rakibin sağlık puanı güncellenir.
> - "dodge" metodu, dövüşçünün kaçma yeteneğini simüle eder. Rastgele bir değer oluşturarak kaçma şansını hesaplar.
3. "Ring" sınıfı, iki dövüşçü arasında bir maçı yönetir. İki dövüşçü ve maçın minimum/maximum ağırlık sınırlarıyla başlatılır.
> - "run" metodu, maçın gerçekleştirilmesi için döngüyü içerir. Dövüşçülerin sağlık puanları sıfır olana kadar döngü devam eder.
> - "checkWeight" metodu, dövüşçülerin ağırlık sınırlarını kontrol eder ve maçın uygun şekilde gerçekleştirilip gerçekleştirilemeyeceğini belirler.
> - "isWin" metodu, maçın sonucunu kontrol eder. Bir dövüşçünün sağlık puanı sıfır olursa maç sonlanır ve kazanan dövüşçü belirlenir.
> - "printScore" metodu, her turun sonunda dövüşçülerin kalan sağlık puanlarını ekrana yazdırır.
4. Program, ilk kimin dövüşe başlayacağını %50 olasılıkla belirler. Bu işlem "Ring" sınıfının "run" metodunda gerçekleştirilir.
5. Her turda dövüşçüler sırayla saldırır. Saldırı sonucunda hasar verilir ve rakibin sağlık puanı güncellenir. Eğer saldırıyı rakip dövüşçü savurursa "dodge" metodu çalışır ve saldırı engellenir.
6. Her tur sonunda dövüşçülerin kalan sağlık puanları ekrana yazdırılır.
7. Maçın sonucu, bir dövüşçünün sağlık puanının sıfır olup olmadığına bağlı olarak belirlenir. Maçı kazanan dövüşçünün adı ekrana yazdırılır.
8. Programın ana sınıfı "Main"dir. Burada iki dövüşçü oluşturulur ve bir "Ring" nesnesi oluşturularak maç başlatılır.

> Bu yapılar arasındaki ilişkiler, "Ring" sınıfının "Fighter" sınıfını kullanarak dövüşçülerin saldırı ve sağlık puanı güncelleme işlemlerini gerçekleştirmesi şeklindedir. "Ring" sınıfı, dövüşçülerin özelliklerini ve maçın ağırlık sınırlarını kullanarak maçın gerçekleştirilmesini sağlar. İlk kimin dövüşe başlayacağı %50 olasılıkla belirlenir ve "dodge" metodu ile dövüşçülerin kaçma yetenekleri simüle edilir.

### Programın çıktısı:

```
Müsabakaya Alex başlıyor!
======== 1. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu. DODGE!
------------
Marc Kalan Can: 90
Alex Kalan Can: 95
======== 2. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu.
------------
Marc Kalan Can: 80
Alex Kalan Can: 95
======== 3. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can: 70
Alex Kalan Can: 80
======== 4. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu. DODGE!
------------
Marc Kalan Can: 60
Alex Kalan Can: 80
======== 5. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu. DODGE!
------------
Marc Kalan Can: 50
Alex Kalan Can: 80
======== 6. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu. DODGE!
------------
Marc Kalan Can: 40
Alex Kalan Can: 80
======== 7. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can: 30
Alex Kalan Can: 65
======== 8. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can: 20
Alex Kalan Can: 50
======== 9. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can: 10
Alex Kalan Can: 35
======== 10. ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
Maçı Kazanan: Alex
```

------------

------------

## Program's General Workflow and Relationships between Structures

1. The program uses a set of classes to simulate boxing matches.
2. The "Fighter" class represents a fighter and includes their attributes (name, damage, health, weight, dodge chance) and functions related to the fight.
> - The "hit" method allows the fighter to attack their opponent. It inflicts damage and updates the opponent's health.
> - The "dodge" method simulates the fighter's dodging ability. It calculates the dodge chance by generating a random value.
3. The "Ring" class manages a match between two fighters. It is initialized with two fighters and the minimum/maximum weight limits for the match.
> - The "run" method contains the loop for conducting the match. The loop continues until both fighters' health reaches zero.
> - The "checkWeight" method verifies the weight limits of the fighters and determines if the match can proceed appropriately.
> - The "isWin" method checks the match's outcome. If a fighter's health reaches zero, the match ends, and the winning fighter is determined.
> - The "printScore" method displays the remaining health points of the fighters after each round.
4. The program determines which fighter starts the match with a 50% probability. This process is performed within the "run" method of the "Ring" class.
5. In each round, the fighters take turns attacking. Damage is inflicted, and the opponent's health is updated. If the opponent successfully dodges the attack, the "dodge" method is triggered, and the attack is blocked.
6. After each round, the remaining health points of the fighters are displayed.
7. The match's outcome is determined based on whether a fighter's health reaches zero. The name of the winning fighter is displayed.
8. The main class of the program is "Main." It creates two fighters and initializes a "Ring" object to start the match.

> The relationships between these structures involve the "Ring" class utilizing the "Fighter" class to perform attack and health point update operations for the fighters. The "Ring" class handles the fighters' attributes and match's weight limits to conduct the match. The starting fighter is determined with a 50% probability, and the "dodge" method is used to simulate the fighters' dodging abilities.

------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)