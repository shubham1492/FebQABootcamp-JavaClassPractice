package Day11.StringCodingExample;

/**
 *  Write a java program to reverse the string
 *
 *  o/p : olleH
 */
public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";

        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse String: "+reverse);


    }
}
