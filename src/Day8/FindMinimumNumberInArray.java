package Day8;

/**
 *  Write a java program to find minimum number in array
 */
public class FindMinimumNumberInArray {

    static void findMinimum(int arr[]){

        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min  = arr[i];
            }
        }
        System.out.println("Minimum Value is: "+min);
    }

    static void findMaxium(int arr[]){

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value is: "+max);
    }

    public static void main(String[] args) {

        int arr[] = {33,3,4,5,9,1};

        findMinimum(arr);
        findMaxium(arr);
    }
}
