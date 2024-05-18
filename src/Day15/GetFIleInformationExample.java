package Day15;

import java.io.File;

public class GetFIleInformationExample {
    public static void main(String[] args) {

        File f1 = new File("demo.txt");

        if(f1.exists()){
            System.out.println("The name of the file is:"+ f1.getName());

            System.out.println("The absolute path of the file: "+f1.getAbsolutePath());

            System.out.println("is file readable? :"+ f1.canRead());

            System.out.println("is file writable? :"+f1.canWrite());

            System.out.println("The size of the file :"+f1.length());
        }else{
            System.out.println("file does not exist");
        }
    }
}
