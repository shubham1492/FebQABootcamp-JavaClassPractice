package Day15;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFileExample {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("demo.txt");

            fileWriter.write("this is java class and learning file topic");

            fileWriter.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
