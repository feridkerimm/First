package Mentor;

import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        balance += sc.nextDouble();
        System.out.println("Deposit successful...");
    }

    public void cashDraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to cash draw: ");
        double amount = sc.nextDouble();
        System.out.println("Cash draw successful...");
        if (amount > balance) {
            System.out.println("There is no enough balance: ");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Your Balance: " + balance);
    }

    public static void main(String[] args) {
        int attempt = 0;
        while (attempt < 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account number: ");
            String acNum = sc.nextLine();
            BankAccount bankAccount = new BankAccount("12345", 500);
            if (acNum.equals("12345")) {
                boolean cont = true;
                while (cont) {
                    System.out.println("What operation would you like to do?");
                    System.out.println("1.Your balance:");
                    System.out.println("2.Cash draw:");
                    System.out.println("3.Deposit:");
                    System.out.println("4.Exit");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            bankAccount.display();
                            break;
                        case 2:
                            bankAccount.cashDraw();
                            break;
                        case 3:
                            bankAccount.deposit();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Invalid option");
                    }
                    System.out.println("do you want to continue? (Y/N)");
                    char choice1 = sc.next().toLowerCase().charAt(0);
                    if (choice1 == 'n') {
                        cont = false;
                    }
                }
                System.exit(0);
            } else {
                attempt = attempt + 1;
                System.out.println("Wrong account number: ");
                System.out.println("Your attempt left: " + (3 - attempt));
                if (attempt == 3) {
                    System.out.println("3 times you enter wrong account number: ");
                }
            }
        }
    }
}