package Day12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowWithCheckedException {

    public static void fileReading() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");

        BufferedReader bufferedReader = new BufferedReader(file);

        throw new FileNotFoundException();
    }


    public static void main(String[] args) {

        try {
            fileReading();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }

        System.out.println("Rest of the code");

    }
}
