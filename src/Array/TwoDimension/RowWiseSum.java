package Array.TwoDimension;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{2,4,1},{7,3,5}};

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row: " + i + " Sum = " + sum);
        }
    }
}
