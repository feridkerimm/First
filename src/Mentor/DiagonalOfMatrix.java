package Mentor;

public class DiagonalOfMatrix {
    public static void main(String[] args) {
        String[][] array = {{"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}};
        System.out.print("First diagonal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Second diagonal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - 1 - i]);
            System.out.print(" ");
        }
    }
}