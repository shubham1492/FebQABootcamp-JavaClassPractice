package Day9.ArrayCodingExcersize;

/**
 * Write a java program to find duplicate numbers in given array
 */

public class FindDuplicateNumberInArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,2,7,8,8,3};
        int count=0;
        System.out.println("Duplicate elements in given array :");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    count++;
                }
            }
        }
        System.out.println("total count is :"+count);
    }
}
