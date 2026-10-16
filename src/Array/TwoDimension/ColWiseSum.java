package Array.TwoDimension;
import java.util.Scanner;

public class ColWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{2,4,1},{7,3,5}};

        for(int j=0; j<arr[0].length; j++){

            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i][j];
            }
            System.out.println("Column: "+j+" Sum: "+sum);
        }
    }
}
