package Day16.codingexcersize;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *  Write a java program to find first non-repeating character.
 *
 *  input: "Java"
 *  o/p: "J"
 */
public class FindFirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String input){
        LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<>();

        char ch [] = input.toCharArray();

        for(char c: ch){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        System.out.println("Map: "+ charCountMap);

        for (char c : ch){
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        String str = "programingprog";
        char result = findFirstNonRepeatingCharacter(str);

        if(result!=0){
            System.out.println("The first non-repeating character is :"+result);
        }else{
            System.out.println("There are no non-repeting character");
        }


    }
}
