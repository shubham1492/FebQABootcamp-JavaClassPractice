package Day12;

public class ThrowExample {

    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("person is eligible to vote");
        }
    }


    public static void main(String[] args) {

        try{
            validate(13);
        }catch(ArithmeticException e){
            System.out.println(e);
        }


        System.out.println("rest of the code");

    }
}
