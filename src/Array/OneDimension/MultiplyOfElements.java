package Array.OneDimension;
import java.util.Scanner;

public class MultiplyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,10,20};
        int n = arr.length;
        int mul = 1;

        for(int i = 0; i<n; i++){
            mul = mul*arr[i];
        }
        System.out.println(mul);
    }
}
