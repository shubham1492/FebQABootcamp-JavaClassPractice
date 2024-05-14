package Day12;

public class TestCustomException {

    public static void validate(int age)  {
        if(age<18){
            throw new InvalidAgeException("age is not valid to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(12);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
