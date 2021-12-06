package Task4;

public class Runnable2 implements Runnable{
    @Override
    public void run() {
        final Calculator calculator = new Calculator();
        System.out.println("Result from Runnable2(-): " + calculator.calculate(25,13, '-'));
    }
}
