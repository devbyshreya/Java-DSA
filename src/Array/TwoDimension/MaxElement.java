package Array.TwoDimension;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{21,20,19}};
        int max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element is "+max);
    }
}
