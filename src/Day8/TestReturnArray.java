package Day8;

public class TestReturnArray {

    static int[] get(){
        return new int[]{10,30,50,90,60};
    }


    public static void main(String[] args) {

        int arr[] = get();
        for(int val: arr ){
            System.out.println(val);
        }

    }
}
