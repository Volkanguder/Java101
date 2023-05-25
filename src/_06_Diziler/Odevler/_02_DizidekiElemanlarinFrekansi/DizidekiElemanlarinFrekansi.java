package _06_Diziler.Odevler._02_DizidekiElemanlarinFrekansi;

import java.util.HashMap;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        //Bir Hasmap kullanarak elemanların frekansını tutacağız
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        //Dizi üzerinde dolaşarak elemanların frekansını hesaplayacağız
        for (int num : array) {
            //HashMap'te eleman var mı diye kontrol ediyoruz
            //Eğer yoksa 0 değeriyle ekliyoruz, varsa frekansı ile artırıyoruz
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        //Frekansları ekrana yazdırıyoruz
        for (int num : frequencyMap.keySet()) {
            System.out.println(num+" sayısı "+frequencyMap.get(num)+" kere tekrar edildi.");
        }
    }
}
