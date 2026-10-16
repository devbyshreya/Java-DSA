package Loops;
import java.util.*;
public class SumOfNaturalNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.print("Sum is: " + sum);
    }
}
