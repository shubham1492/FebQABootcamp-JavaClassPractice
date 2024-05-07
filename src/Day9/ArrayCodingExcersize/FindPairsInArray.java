package Day9.ArrayCodingExcersize;

public class FindPairsInArray {

    public static void findPairs(int [] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pair found: [" + arr[i] + ", "+ arr[j]+"]");
                }
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = {2,7,5,3};
        int target = 8;
        findPairs(arr,target);

    }
}
