package _05_Siniflar.Pratikler._02_BoksMaci;

public class Fighter {
    String name;    // Dövüşçünün adı
    int damage;     // Dövüşçünün verdiği hasar miktarı
    int health;     // Dövüşçünün sağlık puanı
    int weight;     // Dövüşçünün ağırlığı
    double dodge;   // Dövüşçünün kaçma şansı yüzdesi

    /**
     * Fighter sınıfı yapıcı metodu.
     *
     * @param name   Dövüşçünün adı
     * @param damage Dövüşçünün verdiği hasar miktarı
     * @param health Dövüşçünün sağlık puanı
     * @param weight Dövüşçünün ağırlığı
     * @param dodge  Dövüşçünün kaçma şansı yüzdesi
     */
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    /**
     * Dövüşçünün rakibe saldırmasını simüle eden metot.
     *
     * @param foe Rakip dövüşçü
     * @return Güncellenmiş rakip dövüşçünün sağlık puanı
     */
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            // Dövüşçü dodge yeteneğini kullandığında ekrana çıktı yazdırılır.
            System.out.println(foe.name + " gelen hasarı savurdu. DODGE!");
            // Dövüşçünün güncellenmiş sağlık değeri döndürülür.
            return foe.health;
        }

        // Rakip dövüşçünün kaçması durumunda hasar alınmaz
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        // Rakip dövüşçünün canı, saldıran dövüşçünün hasarına göre azaltılır
        return Math.max(foe.health - this.damage, 0);

    }

    /**
     * Dövüşçünün dodge (kaçma) yeteneğini değerlendiren metot.
     *
     * @return Dodge (kaçma) yeteneği sonucu true veya false döndürür
     */
    public boolean dodge() {
        double randomValue = Math.random() * 100;  // 0.0 ile 99.9 arasında rastgele bir değer oluşturulur
        return randomValue <= this.dodge;
    }
}
