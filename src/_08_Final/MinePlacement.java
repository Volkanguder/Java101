package _08_Final;

public class MinePlacement {
    public static void placeMines(boolean[][] mines, int mineCount) {
        // Matrisin satır ve sütun sayılarını al
        int rowCount = mines.length;
        int columnCount = mines[0].length;

        // İstenen mayın sayısına ulaşılıncaya kadar döngüyü tekrarla
        while (mineCount > 0) {
            // Rastgele bir satır ve sütun indisleri oluştur
            int row = (int) (Math.random() * rowCount);
            int column = (int) (Math.random() * columnCount);

            // Mevcut hücrede daha önceden mayın yoksa
            if (!mines[row][column]) {
                // Mevcut hücreye bir mayın yerleştir
                mines[row][column] = true;
                // Mayın sayısını bir azalt
                mineCount--;
            }
        }
    }
}

