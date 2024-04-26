package Day4;

public class InfiniteWhileLoop {
    public static void main(String[] args) {

        int i =1;
        while(true){
            System.out.println("infinite while loop "+ i);
            if(i==50){
                break;
            }
            i++;
        }

    }
}
