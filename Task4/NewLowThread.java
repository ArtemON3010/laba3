package Task4;

public class NewLowThread {
    public static void main(final String[] args) {

        final Thread thread1 = new Thread(new Runnable1());
        final Thread thread2 = new Thread(new Runnable2());

        thread1.start();
        thread2.start();

        thread1.interrupt();
        thread2.interrupt();
    }
}
