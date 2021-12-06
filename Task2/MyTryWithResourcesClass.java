package Task2;

import java.io.IOException;

public class MyTryWithResourcesClass implements AutoCloseable{

    @Override
    public void close(){
        System.out.println("This is close() method");
    }
}
