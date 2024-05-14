package Day12;

public class NestedTryBlockExample {
    public static void main(String[] args) {

        //outer try
        try{

            try {
                int data = 50 / 0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Rest of the code");


    }
}
