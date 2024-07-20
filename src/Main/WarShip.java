package Main;

import java.util.Random;
import java.util.Scanner;

public class WarShip {
    public static void main(String[] args) {
        char[][] ships = new char[3][4];
        char[][] map = {{'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'}};
        randomShips(ships);
        showMap(map);
        hitShip(map, ships);
        showRandom(ships);

    }

    public static void showMap(char[][] map) {
        for (char[] empty : map) {
            for (char n : empty) {
                System.out.print("|");
                System.out.print(n);
                System.out.print("| ");
            }
            System.out.println();
        }


    }

    public static void hitShip(char[][] map, char[][] ships) {
        for (int times = 0; times < 3; times++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which row do you want to fire? ");
            int row = scanner.nextInt();
            System.out.println("Which column do you want to fire? ");
            int column = scanner.nextInt();


            if (row >= 0 && row < ships.length && column >= 0 && column < ships[row].length) {
                if (ships[row][column] == 'x') {
                    System.out.println("You hit a ship!");
                    map[row][column] = 'x';
                } else {
                    System.out.println("Missed.");
                    map[row][column] = '-';
                }
            } else {
                System.out.println("Invalid coordinates.");
            }
            showMap(map);

        }


    }

    public static void randomShips(char[][] ships) {

        for (int i = 0; i < ships.length; i++) {
            for (int k = 0; k < ships[i].length; k++) {
                ships[i][k] = new Random().nextBoolean() ? '-' : 'x';
            }
        }
    }

    public static void showRandom(char[][] ships) {
        System.out.println("Ship position: ");
        for (char[] sh : ships) {
            for (char ran : sh) {
                System.out.print("|");
                System.out.print(ran);
                System.out.print("| ");
            }
            System.out.println();
        }

    }
}




