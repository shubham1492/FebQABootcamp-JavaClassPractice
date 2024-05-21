package Day16.codingexcersize;

import java.util.HashMap;
import java.util.Map;

/**
 *  Write a Java program to find duplicate characters in a given String and print it.
 */
public class FindDuplicateCharacters {

    public static void printDuplicateCharacters(String input){

        HashMap<Character,Integer> charCountMap = new HashMap<>();

        char ch [] = input.toCharArray();

        for(char c: ch){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        System.out.println(charCountMap);

        for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicate character : "+ entry.getKey());
            }
        }

    }



    public static void main(String[] args) {
        String input  = "programming";
        printDuplicateCharacters(input);

    }
}
