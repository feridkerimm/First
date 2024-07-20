package Main.Lesson11;
public class BankAccount {
    public static int counter = 0;
    String accountName;


    public BankAccount(String accountName) {
        this.accountName=accountName;
        counter++;
    }

    @Override
    public String toString() {
        return accountName;
    }

    public static int totalAccount() {
        return counter;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ferid");
        BankAccount account1 = new BankAccount("Karimov");


        System.out.println("Total bank account: " + BankAccount.totalAccount());
        System.out.println("Account's name : " +account+ " and " +account1);
    }
}
