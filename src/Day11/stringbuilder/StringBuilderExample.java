package Day11.stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append("Hello");

        System.out.println(sb);

        sb.insert(2,"world");

        System.out.println(sb);

    }
}
