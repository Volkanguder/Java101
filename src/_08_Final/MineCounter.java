package _08_Final;

public class MineCounter {
     // Belirtilen koordinatlardaki mayını kontrol eder.
     // mines  Mayınların bulunduğu matris
     // row    Satır indeksi
     // column Sütun indeksi
     // return Belirtilen koordinatta mayın varsa true, yoksa false döner
    public static boolean hasMine(boolean[][] mines, int row, int column) {
        return mines[row][column];
    }

    // Belirtilen koordinatın etrafındaki mayın sayısını hesaplar.
    // mines  Mayınların bulunduğu matris
    // row    Satır indeksi
    // column Sütun indeksi
    // return Belirtilen koordinatın etrafındaki mayın sayısı
    public static int countMinesAround(boolean[][] mines, int row, int column) {
        int count = 0;
        int rowCount = mines.length;
        int columnCount = mines[0].length;

        // Belirtilen koordinatın etrafında dolaşarak mayınları sayma işlemi
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (GridValidator.isValidPoint(i, j, rowCount, columnCount) && mines[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

