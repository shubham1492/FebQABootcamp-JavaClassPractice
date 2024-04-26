package Day4;

import java.util.Scanner;

public class DownwardTrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();

        for(int i = row-1 ; i>=0 ; i--){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
