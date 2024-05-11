package Day11.StringCodingExample;

/**
 *  Write a program to swap to two string without using third variable.
 */
public class SwapTwoStringExample {
    public static void main(String[] args) {

        String str = "Hello";
        String str1 = "World";

        str = str + str1; //HelloWorld

        System.out.println(str);

        str1 = str.substring(0,str.length()-str1.length()); // Hello

        str = str.substring(str1.length()); // world

        System.out.println(str+" "+ str1);

    }
}
