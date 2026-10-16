package Loops;
import java.util.Scanner;
public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while(y!=0){
            int remainder = x%y;
            x=y;
            y=remainder;
        }
        int gcd = x;
        int lcm = (a*b)/gcd;

        System.out.println("The greatest common divisor is "+gcd);
        System.out.println("The largest common divisor is "+lcm);
    }
}
