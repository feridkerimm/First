package Mentor.Casino;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    private static final String[] SYMBOLS = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};


    public static void pullEver() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to Slot Machine:  ");
        System.out.println("Kindly remainder 1 game for 10 Azn. ");
        System.out.println("If you win, you will earn 10x : ");

        System.out.print("Are you older than 18?  (Y/N) : ");
        String answer = sc.nextLine().toUpperCase();

        if (!answer.equals("Y")) {
            System.exit(0);
        }

        System.out.println("Enter the amount you want to play.(10azn),(20azn),(50azn)");
        int amount = sc.nextInt();

        if (amount != 10 && amount != 20 && amount != 50) {
            System.out.println("Enter the valid amount: ");
            sc.nextLine();
            pullEver();
        } else {
            sc.nextLine();

            while (playAgain && amount >= 10) {


                String symbol1 = SYMBOLS[rand.nextInt(SYMBOLS.length)];
                String symbol2 = SYMBOLS[rand.nextInt(SYMBOLS.length)];
                String symbol3 = SYMBOLS[rand.nextInt(SYMBOLS.length)];

                System.out.println("Slot machine results:  |" + symbol1 + " | " + symbol2 + " | " + symbol3 + " |");
                if (symbol1.equals(symbol2) && symbol2.equals(symbol3)) {
                    amount = 100;
                    System.out.println("Congratulations you win! " + amount + " azn");
                } else {
                    System.out.println("You lose! ");
                    amount -= 10;
                }
                if (amount >= 10) {
                    System.out.println("Do you want to play again?  (Y/N) : ");
                    String answer2 = sc.nextLine().toUpperCase();
                    if (!answer2.equals("Y")) {
                        playAgain = false;
                        System.out.println("Your balance " + amount + " azn");
                    }
                } else {
                    System.out.println("Your balance is empty: " + amount + " azn");
                    playAgain = false;
                }
            }
        }
    }
}