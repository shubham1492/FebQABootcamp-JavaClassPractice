package Day3;

public class IfElseExample {
    public static void main(String[] args) {

        int num = 13;

        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }

       String result =  (num%2==0)? "Even Number":"Odd number";
        System.out.println(result);
    }
}
