package Main.Lesson16;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(19021999,"Farid Karimov",25000);
        BankAccount account2 = new BankAccount(11081988,"Rahman Karimov",50000);

        account1.deposit(0);
        account2.deposit(2000);
        account1.withdraw(100);
        account2.withdraw(200);

        account2.transfer(300,account1);

        System.out.println(account1);
        System.out.println();
        System.out.println(account2);


    }
}
