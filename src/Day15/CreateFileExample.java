package Day15;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {

        try {
            File f1 = new File("demo.txt");

            if (f1.createNewFile()) {
                System.out.println("File "+f1.getName()+" is created successfully");
            }else{
                System.out.println("File is already existf in the directory");
            }
        }catch(IOException e){
            System.out.println(e);
        }


    }
}
