package Main.Lesson19;
public class StringOperations {
    public static void main(String[] args) {

        String part1 = "Hello, my name is ";
        String part2 = "Farid";
        String sentence = part1 + part2;

        String substring = sentence.substring(7, 14);
        int length = sentence.length();


        System.out.println("Full sentence: " + sentence);
        System.out.println("Extracted substring: " + substring);
        System.out.println("Length of the sentence: " + length);
    }
}
