# Patika Java101
------------
##  Mayın Tarlası
> Java dilinde Mayın Tarlası oyunu yapıyoruz.

**Oyun Kuralları :**
- Oyun metin tabanlıdır.
- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
- Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
------------

## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri

1. Kullanıcıdan satır ve sütun sayıları alınır.
2. `grid` adında bir 2D `char` matris oluşturulur. Bu matris, mayın tarlasının görünen durumunu temsil eder.
3. Mayın sayısı hesaplanır: `mineCount = rowCount * columnCount / 4`.
4. `mines` adında bir 2D `boolean` matris oluşturulur. Bu matris, mayınların konumunu tutar.
5. `placeMines` fonksiyonu kullanılarak mayınlar rastgele konumlandırılır.
6. Oyun başlatılır ve `gameOver` ve `gameWon` değişkenleri false olarak ayarlanır.
7. Kullanıcıya "Mayın Tarlası Oyuna Hoşgeldiniz!" mesajı gösterilir.
8. Oyun döngüsü başlar ve döngü, `gameOver` true olana kadar devam eder.
9. Her adımda, `printGrid` fonksiyonu kullanılarak görüntülenen oyun alanı ekrana yazdırılır.
10. Kullanıcıdan satır ve sütun bilgileri alınır.
11. Girilen noktanın geçerli bir nokta olup olmadığı kontrol edilir.
12. Girilen noktada mayın varsa oyun kaybedilir.
13. Girilen noktada mayın yoksa, etkileşimli alan kontrol edilir.
14. Hesaplanan mayın sayısı, `grid` matrisine yazılır.
15. Tüm noktalar seçilmişse oyun kazanılır.
16. Oyun döngüsü adım 8'e geri döner.
17. Oyun sonucu ekrana yazdırılır.
18. `Scanner` kapatılır ve program sonlanır.

Yapılar arasındaki ilişkiler şu şekildedir:

- `grid` matrisi, oyun alanının görünen durumunu temsil eder.
- `mines` matrisi, mayınların konumunu tutar.
- `placeMines` fonksiyonu, mayınları rastgele konumlandırır.
- `isValidPoint` fonksiyonu, geçerli bir nokta olup olmadığını kontrol eder.
- `countMinesAround` fonksiyonu, bir noktanın etrafındaki mayın sayısını hesaplar.
- `isGameWon` fonksiyonu, oyunun kazanılıp kazanılmadığını kontrol eder.
- `printGrid` fonksiyonu, `grid` matrisini ekrana yazdırır.

------------

# Sınıfların Açıklamaları
## MineSweeper

- Ana sınıf olarak Mayın Tarlası oyununu temsil eder.
- Kullanıcıdan girişleri alır, oyun döngüsünü yönetir ve sonucu yazdırır.
- Diğer yardımcı sınıfları kullanarak oyunun genel işleyişini kontrol eder.

## GridPrinter

- Matrisi ekrana yazdırmak için kullanılır.
- `printGrid` metodu, verilen karakter matrisini satır ve sütun şeklinde ekrana yazdırır.

## MinePlacer

- Mayınların rastgele konumlandırılmasıyla ilgili işlemleri gerçekleştirir.
- `placeMines` metodu, verilen boolean matrisinde belirli sayıda rastgele mayını konumlandırır.

## PointValidator

- Noktanın geçerli olup olmadığını kontrol etmek için kullanılır.
- `isValidPoint` metodu, verilen noktanın belirli bir matrisin içinde bulunup bulunmadığını kontrol eder.

## MineCounter

- Bir noktanın etrafındaki mayınların sayısını hesaplar.
- `countMinesAround` metodu, verilen boolean matrisinde belirli bir noktanın etrafındaki mayın sayısını bulur.

## GameEvaluator

- Oyunun kazanılıp kazanılmadığını kontrol eder.
- `isGameWon` metodu, verilen karakter matrisinde tüm noktaların seçilip seçilmediğini kontrol eder.

------------
### Programın çıktısı:

```
Satır Sayısını Girin: 3
Sütun Sayısını Girin: 3
Mayın Tarlası Oyuna Hoşgeldiniz!
      
      
      
===========================
Satır Giriniz: 0
Sütun Giriniz: 0
1     
      
      
===========================
Satır Giriniz: 0
Sütun Giriniz: 1
Mayınların Konumu:
. * . 
. . * 
. . . 
___________________________
1     
      
      
===========================
Game Over!!
```
------------

------------

## Minefield
> We are creating a Minesweeper game in the Java programming language.

**Game Rules:**
- The game is text-based.
- It should be played on a two-dimensional array and designed within the Minesweeper class.
- The user should determine the size of the matrix, i.e., the number of rows and columns.
- Mines should be randomly placed in the array, with a quantity equal to one-fourth of the total number of elements (elementCount / 4). For example, if the array is of size 4x3, the number of elements should be calculated using the formula (rowCount * columnCount), resulting in a size of 12. In this case, there should be 3 mines (12 / 4 = 3). (Hint: You can create a second array to store the positions of the mines.)
- The user should select a point on the matrix. They should input the row and column values for the point.
- Check if the selected point is within the boundaries of the array. If not, prompt for another point.
- If the selected point contains a mine, the game should be lost.
- If there is no mine, examine all adjacent positions to the selected point (right, left, above, below, top-left diagonal, top-right diagonal, bottom-right diagonal, bottom-left diagonal) and write the sum of the surrounding mines to the selected point. If there are no adjacent mines, assign the value "0" to the point.
- If the user successfully selects all points without hitting a mine, they should win the game.

------------
## Overall Logic of the Program and Relationships Between Structures


1. Prompt the user to enter the number of rows and columns.
2. Create a 2D `char` array named `grid`, which represents the visible state of the minefield.
3. Calculate the number of mines: `mineCount = rowCount * columnCount / 4`.
4. Create a 2D `boolean` array named `mines` to store the positions of the mines.
5. Randomly place the mines using the `placeMines` function.
6. Start the game and initialize the `gameOver` and `gameWon` variables as false.
7. Display the message "Welcome to the Minesweeper Game!" to the user.
8. Begin the game loop, which continues until `gameOver` becomes true.
9. At each iteration, use the `printGrid` function to display the current state of the game grid.
10. Prompt the user to enter the row and column numbers.
11. Check if the entered point is a valid point.
12. If a mine is present at the selected point, end the game (game over).
13. If no mine is present at the selected point, check the surrounding area.
14. Calculate the number of mines around the selected point and write it to the `grid` array.
15. If all points are selected, the game is won.
16. Go back to step 8 in the game loop.
17. Print the game result.
18. Close the `Scanner` and end the program.

The relationships between structures are as follows:

- The `grid` array represents the visible state of the game grid.
- The `mines` array stores the positions of the mines.
- The `placeMines` function randomly places the mines.
- The `isValidPoint` function checks if a point is valid.
- The `countMinesAround` function calculates the number of mines around a given point.
- The `isGameWon` function checks if the game is won.
- The `printGrid` function prints the `grid` array to the console.

# Class Descriptions
## MineSweeper

- Represents the main class for the Minesweeper game.
- It interacts with the user, manages the game loop, and prints the result.
- Controls the overall flow of the game using other helper classes.

## GridPrinter

- Used for printing the grid to the console.
- The `printGrid` method prints the given character grid in a row and column format.

## MinePlacer

- Performs operations related to randomly placing mines.
- The `placeMines` method randomly places a specific number of mines in the given boolean matrix.

## PointValidator

- Used to validate whether a point is valid or not.
- The `isValidPoint` method checks if a given point is within the bounds of a specific matrix.

## MineCounter

- Calculates the number of mines around a given point.
- The `countMinesAround` method counts the number of mines around a specific point in the given boolean matrix.

## GameEvaluator

- Checks if the game is won or not.
- The `isGameWon` method checks if all points in the given character grid have been selected.


------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)