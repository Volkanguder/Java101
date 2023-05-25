package _06_Diziler.Odevler._03_MatrisTranspozunuBulma;

public class MatrisTraspozunuBulma {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 7}
        };

        //Matrisin boyutlarını alıyoruz
        int rows = matrix.length;
        int columns = matrix[0].length;

        //Transpoze matrisini oluşturuyoruz
        int[][] transpose = new int[columns][rows];

        //Matrisin transpozunu hesaplıyoruz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        //Matrisi ekrana yazdırıyoruz
        System.out.println("Matris: ");
        printMatrix(matrix);

        //Transpoze matrisini ekrana yazdırıyoruz
        System.out.println("Transpoze: ");
        printMatrix(transpose);
    }

    //Matrisi ekrana yazdıran yardımcı metot
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
