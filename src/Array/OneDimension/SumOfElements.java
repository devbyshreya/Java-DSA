package Array.OneDimension;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
