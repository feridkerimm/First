package Mentor;

public class CalculateMain {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println("Sum of 4 and 5: " + calculate.add(4, 5));
        System.out.println("Sum of 4.4 and 5.5: " + calculate.add(4.4, 5.5));
        System.out.println("Sum of 4, 5 and 6: " + calculate.add(4, 5, 6));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("4 power 2 =" + scientificCalculator.power(4, 2));


    }
}
