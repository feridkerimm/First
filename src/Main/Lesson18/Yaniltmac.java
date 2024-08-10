package Main.Lesson18;

public class Yaniltmac {
    private static final Object lock = new Object();
    private static final String[] strings1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
    private static final String[] strings2 = {"gördüm", "dərədə", "kar ", "kürkü", "kirpi"};
    private static boolean turn = true;


    public static void main(String[] args) {
        Thread t1 = new Thread(Yaniltmac::getFirst);
        Thread t2 = new Thread(Yaniltmac::getSecond);

        t1.start();
        t2.start();

    }

    public static void getFirst() {
        while (turn) {
            for (String s : strings1) {
                synchronized (lock) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": " + s);
                        turn = false;
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void getSecond() {
        while (turn) {
            for (String s : strings2) {
                synchronized (lock) {
                    try {

                        System.out.println(Thread.currentThread().getName() + ": " + s);
                        turn = false;

                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }


}