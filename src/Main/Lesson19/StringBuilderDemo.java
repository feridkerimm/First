package Main.Lesson19;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder quote = new StringBuilder("The only limit to our realization of tomorrow is our doubts of today.");

        quote.append(" - Franklin D. Roosevelt");

        quote.insert(0, "2024: ");

        System.out.println(quote.toString());
    }
}
