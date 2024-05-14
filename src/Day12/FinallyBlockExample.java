package Day12;

public class FinallyBlockExample {
    public static void main(String[] args) {

        try{
            int data = 50/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
