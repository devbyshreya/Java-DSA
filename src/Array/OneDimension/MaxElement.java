package Array.OneDimension;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,-5,21,15};
        int n = arr.length;
        int max = arr[0];

        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
