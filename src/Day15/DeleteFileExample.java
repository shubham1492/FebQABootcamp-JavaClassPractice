package Day15;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {

        File f1 = new File("demo.txt");

        if(f1.delete()){
            System.out.println(f1.getName()+ " file is deleted successfully");
        }else{
            System.out.println("file not found to delete");
        }

    }
}
