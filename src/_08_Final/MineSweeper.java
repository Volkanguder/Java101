package _08_Final;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        //Kullanıcı girişi için Scanner sınıfından bir nesne oluşturulur
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun sayılarını alır
        System.out.print("Satır Sayısını Girin: ");
        int rowCount = scanner.nextInt();
        System.out.print("Sütun Sayısını Girin: ");
        int columnCount = scanner.nextInt();

        // Matris boyutunu belirler
        char[][] grid = new char[rowCount][columnCount];

        // Mayın sayısını hesaplar
        int mineCount = rowCount * columnCount / 4;

        // Mayınların konumunu tutacak ikinci bir matris oluşturur
        boolean[][] mines = new boolean[rowCount][columnCount];

        // Mayınları rastgele konumlandırır
        MinePlacement.placeMines(mines, mineCount);

        // Oyunu başlatır
        boolean gameOver = false;
        boolean gameWon = false;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        // Oyun döngüsü
        while (!gameOver) {
            GridPrinter.printGrid(grid);

            // Kullanıcıdan nokta seçimini alır
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int column = scanner.nextInt();

            // Seçilen noktanın geçerli bir nokta olduğunu kontrol eder
            if (GridValidator.isValidPoint(row, column, rowCount, columnCount)) {
                // Noktada mayın varsa oyunu kaybeder
                if (MineCounter.hasMine(mines, row, column)) {
                    gameOver = true;
                    revealMines(mines); // Mayınları gösteren metodun çağrılması
                } else {
                    // Noktada mayın yoksa etkileşimli alanı kontrol eder
                    int mineCountAround = MineCounter.countMinesAround(mines, row, column);
                    grid[row][column] = (char) (mineCountAround + '0');

                    // Tüm noktaları seçtiyse oyunu kazanır
                    if (GridValidator.isGameWon(grid)) {
                        gameWon = true;
                        gameOver = true;
                    }
                }
            } else {
                System.out.println("Geçersiz nokta! Lütfen tekrar girin.");
            }
        }

        // Oyun sonucunu yazdırır
        GridPrinter.printGrid(grid);
        if (gameWon) {
            System.out.println("Oyunu Kazandınız!");
        } else {
            System.out.println("Game Over!!");
        }

        scanner.close();
    }

    //Mayınların yerini gösteren metot
    public static void revealMines(boolean[][] mines) {
        int rowCount = mines.length;
        int columnCount = mines[0].length;

        System.out.println("Mayınların Konumu:");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (mines[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("___________________________");
    }
}
