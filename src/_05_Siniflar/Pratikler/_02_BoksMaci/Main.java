package _05_Siniflar.Pratikler._02_BoksMaci;

public class Main {
    public static void main(String[] args) {
        // İki dövüşçü nesnesi oluşturulur
        Fighter marc = new Fighter("Marc", 15, 100, 90, 5);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 10);

        // Ring nesnesinin oluşturulur ve dövüşçüler eklenir
        Ring r = new Ring(marc, alex, 90, 100);

        //Müsabaka başlatılır
        r.run();
    }
}
