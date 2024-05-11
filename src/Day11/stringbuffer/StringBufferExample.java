package Day11.stringbuffer;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" World");

        System.out.println(sb);

        sb.insert(1,"hello");

        System.out.println(sb);

        sb.replace(0,4,"Hello");

        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
