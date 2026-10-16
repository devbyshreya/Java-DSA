package Loops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        int digit = 0;

        while(n>0){
            digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        System.out.println("The sum is "+sum);
    }
}
