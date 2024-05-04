package Day7.statickeyword;

public class CounterExample {

    static int count = 0;

    CounterExample(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterExample c1 = new CounterExample();
        CounterExample c2 = new CounterExample();
        CounterExample c3 = new CounterExample();

    }
}
