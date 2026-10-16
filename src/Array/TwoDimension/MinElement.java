package Array.TwoDimension;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,4},{8,-3,-6}};
        int min = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum element is "+min);
    }
}
