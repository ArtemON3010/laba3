package Task4;

public class Runnable1 implements Runnable{
    @Override
    public void run() {
        final Calculator calculator = new Calculator();
        System.out.println("Result from Runnable1(+): " + calculator.calculate(25,13, '+'));
    }
}
