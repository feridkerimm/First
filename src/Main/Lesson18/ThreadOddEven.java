package Main.Lesson18;

public class ThreadOddEven {
    static final Object lock = new Object();


    public static void main(String[] args) {
        Thread oddThread = new Thread(ThreadOddEven::printOdd);
        Thread evenThread = new Thread(ThreadOddEven::printEven);

        oddThread.start();

        evenThread.start();

    }

    public static void printOdd() {

        synchronized (lock) {
            try {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " -> " + i);

                    }
                    lock.notify();
                }

                lock.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }

    public static void printEven() {

        synchronized (lock) {
            try {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " -> " + i);
                    }
                    lock.notify();
                }

                lock.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
//
//public class ThreadOddEven {
//    private static final Object lock = new Object();
//    private static int currentNumber = 1;
//    private static final int maxNumber = 1000;
//    private static boolean oddTurn = true;
//
//    public static void main(String[] args) {
//        Thread oddThread = new Thread(ThreadOddEven::printOdd);
//        Thread evenThread = new Thread(ThreadOddEven::printEven);
//
//        oddThread.start();
//        evenThread.start();
//    }

//    public static void printOdd() {
//        while (true) {
//            synchronized (lock) {
//                try {
//                    if (currentNumber > maxNumber) {
//                        lock.notifyAll();
//                        return;
//                    }
//                    if (oddTurn && currentNumber % 2 != 0) {
//                        System.out.println(Thread.currentThread().getName() + " " + currentNumber);
//                        currentNumber++;
//                        oddTurn = false;
//                    }
//                    lock.notify();
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }
//    }

//    public static void printEven() {
//        while (true) {
//            synchronized (lock) {
//                try {
//                    if (currentNumber > maxNumber) {
//                        lock.notifyAll();
//                        return;
//                    }
//                    if (!oddTurn && currentNumber % 2 == 0) {
//                        System.out.println(Thread.currentThread().getName() + " " + currentNumber);
//                        currentNumber++;
//                        oddTurn = true;
//                    }
//                    lock.notify();
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }
//    }
//}