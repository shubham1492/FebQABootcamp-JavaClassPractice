package Day11.StringCodingExample;

import java.util.Scanner;

/**
 *  Write a Java program to check palindrom
 */
public class CheckPalindrom {

    public static boolean checkPalinDrom(String str){

        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
           return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(checkPalinDrom(str)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not palindrom");
        }
    }
}
