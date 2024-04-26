package Day4;

public class InfiniteDoWhileLoop {
    public static void main(String[] args) {

        int i =1;
        do{
            if(i==4)
            {
                break;
            }
            System.out.println("Infinite do while");
            i++;
        }while (i<=5);
    }
}
