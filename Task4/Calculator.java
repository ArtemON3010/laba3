package Task4;

public class Calculator {

    public Calculator() {
    }


    public double calculate(final int a, final int b, final char operator) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '/' -> {
                if (b == 0) {
                    System.out.println("Dividing by 0!");
                    return 0;
                }
                return  a / b;
            }
            case '*' -> {
                return a * b;
            }
            default -> {
                throw new UnsupportedOperationException("Error: wrong symbol!");
            }
        }
    }
}
