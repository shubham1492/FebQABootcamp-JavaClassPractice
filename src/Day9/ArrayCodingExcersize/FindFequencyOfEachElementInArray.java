package Day9.ArrayCodingExcersize;

/**
 *  Write a java program to find frequency of each element in given array
 */
public class FindFequencyOfEachElementInArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,3,1,4,5,5,5,6,7,8,9,9,8};

        int [] frequency = new int[arr.length];
        int visited = -1;
        for(int i=0;i<arr.length;i++){
            int count =1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j] = visited;
                }
            }
            if(frequency[i]!=visited){
                frequency[i] = count;
            }
        }

        System.out.println("Element | Frequency");
        for(int i=0 ;i<frequency.length;i++){
            if(frequency[i]!=visited){
                System.out.println(arr[i]+" | "+ frequency[i]);
            }
        }


    }
}
