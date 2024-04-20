package Day2;

public class ArithmeticOperatorExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 50;

        System.out.println(a+b); // 30
        System.out.println(a-b); // -10
        System.out.println(a*b); // 200
        System.out.println(a/b); // 0
        System.out.println(a%b); // 10

        a++;
        System.out.println(a);
        System.out.println(a++); // 10
        System.out.println(a); // 12
        System.out.println(b--);//20
        System.out.println(++a);//13
        System.out.println(--b);// 18

        System.out.println(++a + b++ + --a + b--);// 64
        System.out.println(--a + a++ + b-- + ++a + ++b); //
        System.out.println(a); // 14
        System.out.println(b); // 18 , c = 50
        System.out.println(--c + c++ + --a + --a + --b + b++ + ++c); // 208





    }

}
