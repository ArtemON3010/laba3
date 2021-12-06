package Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewHighThread {
    public static void main(final String[] args) {
    final Calculator calculator = new Calculator();


        final ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(() -> {
        System.out.println("Result(1): " + calculator.calculate(25,13,'+'));
    });

        executor.submit(() -> {
        System.out.println("Result(2): " + calculator.calculate(25,13,'-'));
    });


        try {
            final Future<Double> x = executor.submit(() -> calculator.calculate(25,13,'*'));
        System.out.println("Result(3): " + x.get());
    } catch (final Exception e){
        e.printStackTrace();
    }



        try{
        executor.shutdown();
    } catch (final Exception e){
        executor.shutdown();
    } finally {
        executor.shutdownNow();
    }
}
}
