package Mentor.StringCompression;

import java.util.HashMap;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        HashMap <Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for ( char c : chars ) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            System.out.print(c + "" + map.get(c));
        }

    }
}