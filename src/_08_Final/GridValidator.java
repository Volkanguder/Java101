package _08_Final;

public class GridValidator {
    public static boolean isValidPoint(int row, int column, int rowCount, int columnCount) {
        // Verilen satır ve sütun indislerinin geçerli bir noktayı temsil edip etmediğini kontrol et
        return row >= 0 && row < rowCount && column >= 0 && column < columnCount;
    }

    public static boolean isGameWon(char[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;

        // Matrisin her bir elemanı üzerinde döngüye girer
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                // Geçerli elemanın boş bir karaktere (seçilmemiş nokta) eşit olup olmadığını kontrol eder
                if (grid[i][j] == '\u0000') {
                    // Eğer boş bir karakter bulunursa, oyun henüz kazanılmamış demektir ve false döner
                    return false;
                }
            }
        }

        // Tüm noktalar seçildiyse oyun kazanılmış demektir ve true döner
        return true;
    }
}
