package Main.Lesson19;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("text starts here. ");

        Thread thread1 = new Thread(() -> {
            synchronized (buffer) {
                buffer.append(" first thread, ");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (buffer) {
                buffer.append(" second thread, ");
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (buffer) {
                buffer.append(" third thread. ");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception: " +e.getMessage());
        }

        System.out.println(buffer.toString());
    }
}
