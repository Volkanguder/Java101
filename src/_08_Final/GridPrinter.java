package _08_Final;

public class GridPrinter {

    //İki boyutlu bir karakter dizisini (grid) ekrana yazdırır.
    // grid Yazdırılacak karakter dizisi (grid)
    public static void printGrid(char[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}

