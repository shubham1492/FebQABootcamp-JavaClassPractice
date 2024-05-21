package Day16.codingexcersize;

import java.util.LinkedHashSet;

/**
 *   Write a Java program to remove all duplicates from a given string?
 *
 *   input: "hello"
 *   o/p: "helo"
 *
 */
public class RemoveDuplicatesFromString {


    public static String removeDuplicates(String input){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        char [] ch = input.toCharArray();
        for(char c : ch){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "programing";

        String result =  removeDuplicates(str);

        System.out.println(result);

    }
}
