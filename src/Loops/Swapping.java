package Loops;
import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping:");
        int a = sc.nextInt();
        int b = sc.nextInt();

            int temp = a;
            a = b;
            b = temp;

        System.out.println("After Swapping:");
        System.out.println(a);
        System.out.println(b);
    }
}
