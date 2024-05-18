package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFileExample {
    public static void main(String[] args) {

        File f1 = new File("demo.txt");
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
