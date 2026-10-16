package Loops;
import java.util.Scanner;
public class ArmstrongNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n = n/10;
        }
        if(sum == original){
            System.out.println("The number is a Armstrong number.");
        } else {
            System.out.println("The number is not a Armstrong number.");
        }
    }
}
