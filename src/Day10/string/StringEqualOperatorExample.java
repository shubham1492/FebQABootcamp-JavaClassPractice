package Day10.string;

public class StringEqualOperatorExample {
    public static void main(String[] args) {

        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("sachin");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }

}
