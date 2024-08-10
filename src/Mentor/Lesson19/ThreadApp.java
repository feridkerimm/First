package Mentor.Lesson19;

public class ThreadApp {
    static final Object lock = new Object();
    private static boolean turn = true;
    private static int number = 0;
    private static final char[] chars = {'A', 'B', 'C', 'D', 'E'};

    public static void main(String[] args) {
        Thread numbers = new Thread(ThreadApp::printNumber);
        Thread letters = new Thread(ThreadApp::printLetter);

        numbers.start();
        letters.start();


    }

    public static void printNumber() {
        while (true) {
            synchronized (lock) {

                try {
                    while (number <= 5) {
                        System.out.println("---" + number);
                        turn = false;
                        number++;
                    }
                    lock.notify();
                    lock.wait();
                } catch (Exception e) {
                    System.out.println("It can not be bigger than 5. " + e.getMessage());
                }
            }

        }
    }

    public static void printLetter() {
        while (turn) {
            synchronized (lock) {

                try {
                    for (char aChar : chars) {
                        System.out.println(aChar);
                        turn = true;
                    }
                    lock.notify();
                    lock.wait();
                } catch (Exception e) {
                    System.out.println("Exception found: " + e.getMessage());
                }
            }
        }
    }
}