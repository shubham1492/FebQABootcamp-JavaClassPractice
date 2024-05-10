package Day10.string;

public class StringExample {

    public static void main(String[] args) {

        char ch[] = {'h','e','l','l','o'};
        String s1 = new String(ch);//2
        String s2 = new String ("Welcome");//2

        System.out.println(s1);
        System.out.println(s2);

        String s3= new String("welcome");//2
        String s4 = "Java";// 1
        String s5 = new String(s2); //1

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);


        System.out.println(s1.length());
        System.out.println(s1.charAt(1));

        char ch1[] = s1.toCharArray();
        for (char c: ch1){
            System.out.println(c);
        }

        System.out.println(s2.substring(3));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s5));//
        System.out.println(s4.toLowerCase());



    }
}
