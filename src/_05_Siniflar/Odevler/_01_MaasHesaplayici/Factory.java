package _05_Siniflar.Odevler._01_MaasHesaplayici;

public class Factory {
    public static void main(String[] args) {
        // "Volkan" isimli bir çalışan nesnesi oluşturulur ve bilgileri girilir
        Employee e1 = new Employee("Volkan",2000,45,1985);
        // Oluşturulan çalışan nesnesinin bilgileri ekrana yazdırılır
        e1.printInfo();
    }
}