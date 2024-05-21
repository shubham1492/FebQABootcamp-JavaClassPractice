package Day16.codingexcersize;

import java.beans.PropertyEditorSupport;

/**
 *  Write a Java program to reverse the words in given stentances
 *
 *    String str = "This is my india";
 *
 *     o/p : "india my is this";
 */
public class ReverseWordsInString {

    public static String reverse(String input){

        String reverse  = "";

        for(int i = input.length()-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }


    public static void main(String[] args) {

        String str = "This is my india";

        String words[] = str.split(" ");

        String reverse = "";

        for(int i= words.length -1 ; i>=0 ;i--){
            String reverseString = reverse(words[i]);
            reverse = reverse + reverseString + " ";
        }

        System.out.println(reverse);


    }
}
