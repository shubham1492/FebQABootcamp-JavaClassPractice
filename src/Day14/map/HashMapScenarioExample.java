package Day14.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Write a program to find duplicate character with its count in a given string
 * String str = "shubhamshu"
 *
 * o/p - s ->2
 *       h ->3
 *       U ->2
 *
 */
public class HashMapScenarioExample {
    public static void main(String[] args) {

        String str = "shubhamshu";

        char ch[] = str.toCharArray();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c: ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }


    }
}
