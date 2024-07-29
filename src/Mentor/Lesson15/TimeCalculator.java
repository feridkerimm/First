package Mentor.Lesson15;

public class TimeCalculator {
    public static void main(String[] args) {

        TimeCalculator calculator = new TimeCalculator();
        calculator.calculateDifference(16, 40, 14, 40);

    }

    public void calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        int hourDiff;
        int minuteDiff;
        if (hour1 <= 24 && hour2 <= 24 && minute1 <= 60 && minute2 <= 60) {
            if (hour1 > hour2 || hour1 == hour2 && minute1 > minute2) {
                hour2 += 24;
            }

            if (minute2 < minute1) {
                hour2 = hour2 - 1;
                hourDiff = hour2 - hour1;
                minuteDiff = 60 - (minute1 - minute2);
            } else {
                minuteDiff = minute2 - minute1;
                hourDiff = hour2 - hour1;
            }
            System.out.println("There is " + hourDiff + " hour " + minuteDiff + " minutes difference.");

        } else {
            System.out.println("Invalid time.");
        }
    }
}