# Patika Java101

------------
## Dizideki Elemanların Max ve Min Değerlerini Bulan Program.
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program


------------
## Programın genel çalışma mantığını ve yapılar arasındaki ilişkileri
1. `array` adında bir dizi ve `enteredNumber` adında bir değişken oluşturulur ve girilen sayıyı saklamak için kullanılır.
2. `closestSmaller` adında, girilen sayıya en yakın daha küçük sayıyı tutacak bir değişken tanımlanır ve başlangıç değeri null olarak ayarlanır.
3. `closestLarger` adında, girilen sayıya en yakın daha büyük sayıyı tutacak bir değişken tanımlanır ve başlangıç değeri null olarak ayarlanır.
4. `array` dizisi ve girilen sayı ekrana yazdırılır.
5. Dizi elemanları üzerinde döngü oluşturulur.
6. Her bir eleman için aşağıdaki kontroller yapılır:
    - Eğer eleman girilen sayıdan daha küçükse:
        - `closestSmaller` null ise veya eleman mevcut en yakın daha küçük sayıdan büyükse:
            - `closestSmaller` değeri elemanın değeri ile güncellenir.
    - Eğer eleman girilen sayıdan daha büyükse:
        - `closestLarger` null ise veya eleman mevcut en yakın daha büyük sayıdan küçükse:
            - `closestLarger` değeri elemanın değeri ile güncellenir.
7. `closestSmaller` değişkeni kontrol edilir ve girilen sayıya en yakın daha küçük sayı ekrana yazdırılır.
8. `closestLarger` değişkeni kontrol edilir ve girilen sayıya en yakın daha büyük sayı ekrana yazdırılır.

### Programın çıktısı:

```
Dizi: [15, 12, 788, 1, -1, -778, 2, 0]
Girilen Sayı: 5
Girilen sayıdan küçük en yakın sayı: 2
Girilen sayıdan büyük en yakın sayı: 12
```

------------

------------

## Program to Find the Maximum and Minimum Values of Elements in an Array.
Program to find the closest number smaller than the entered number and the closest number larger than the entered number among the elements in the array.

------------
## Overall Logic of the Program and Relationships Between Structures
1. Create an array called `array` and a variable called `enteredNumber` to store the entered number.
2. Initialize a variable called `closestSmaller` to hold the closest smaller number to the entered number, and set its initial value to null.
3. Initialize a variable called `closestLarger` to hold the closest larger number to the entered number, and set its initial value to null.
4. Print the array `array` and the entered number.
5. Iterate through the elements of the array.
6. For each element, perform the following checks:
    - If the element is smaller than the entered number:
        - If `closestSmaller` is null or the element is greater than the current closest smaller number:
            - Update `closestSmaller` with the value of the element.
    - If the element is larger than the entered number:
        - If `closestLarger` is null or the element is smaller than the current closest larger number:
            - Update `closestLarger` with the value of the element.
7. Check the `closestSmaller` variable and print the closest smaller number to the entered number.
8. Check the `closestLarger` variable and print the closest larger number to the entered number.


------------
### [Patika](https://academy.patika.dev/courses/java101)

### **Follow Me:**  [Linkedin](https://www.linkedin.com/in/volkanguder/) - [Github](https://github.com/Volkanguder) - [HackerRank](https://www.hackerrank.com/volkanguder?hr_r=1)