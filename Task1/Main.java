package Task1;

public class Main {
    public static void main(final String[] args) {
        final Address address = new Address("Одеса", "Одеська", "Франка",
                1,1);
        final User user = new User("Артем","Турко", "Андрійович",19,1,address );

        try {
            user.validate();
        } catch (final UncheckedException uncheckedException) {
            uncheckedException.printStackTrace();
            System.out.println(uncheckedException.getException().getCode() + " " + uncheckedException.getMessage());
        }
    }
}
