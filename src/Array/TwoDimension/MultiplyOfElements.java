package Array.TwoDimension;
import java.util.Scanner;
public class MultiplyOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{2,5,3},{7,3,5 }};
        int mul = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                mul = mul*arr[i][j];
            }
        }
        System.out.println(mul);
    }
}
