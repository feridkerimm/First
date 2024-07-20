package Mentor.StringCompression;

import java.util.Scanner;

public class StringComp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string; ");

        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int counter = 1;
        String compressed = "";

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                counter++;
            } else {
                compressed += chars[i] + String.valueOf(counter);
                counter = 1;

            }
        }
        compressed += chars[chars.length - 1] + String.valueOf(counter);

        System.out.println(compressed.length() < string.length() ? compressed : string);
    }
}
