package Task2;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) {
        try( final MyTryWithResourcesClass myTryWithResourcesClass = new MyTryWithResourcesClass()) {
    } catch ( final Exception e) {
        e.printStackTrace();
    }

}
}
