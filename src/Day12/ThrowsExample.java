package Day12;

import java.io.IOException;

public class ThrowsExample {

    static void method() throws IOException {
        throw new IOException("device Error");
    }
    public static void main(String[] args) {
        try{
            method();
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println("Rest of the code");
    }
}
