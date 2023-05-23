package _06_Diziler.Pratikler._03_CokBoyutDizler;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        String[][] letter = {
                {"*", "*", "*", "*", " "},
                {"*", " ", " ", " ", "*"},
                {"*", " ", " ", " ", "*"},
                {"*", "*", "*", "*", " "},
                {"*", " ", " ", " ", "*"},
                {"*", " ", " ", " ", "*"},
                {"*", "*", "*", "*", " "}
        };

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (letter[i][j].equals("*")) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
