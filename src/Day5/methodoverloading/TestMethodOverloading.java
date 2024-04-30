package Day5.methodoverloading;

public class TestMethodOverloading {

    public static void main(String[] args) {

        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();

        int result = methodOverloadingExample.add(5,4);
        System.out.println(result);

        result  = methodOverloadingExample.add(5,4,9);
        System.out.println(result);

    }
}
