package Array.TwoDimension;

import java.util.Scanner;

public class example {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];

        //input
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print("Provide value for row="+i+" and column="+j+": ");
                arr[i][j] = sc.nextInt();
            }
        }
        //print
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

          //declaration
//        int arr[][];
          //allocation
//        arr = new int[3][4];
          //initialization
//        int brr[][] = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
//        int row = brr.length;
//        int column = brr[0].length;
//
//        for(int i=0;i<brr.length;i++){
//            for(int j=0;j<brr[i].length;j++){
//                System.out.print(brr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
          //jagged array
//        int crr[][] = {{1,2},{2,3,4,5},{3,4,4,5,6,7},{8}};
//        int row2 = crr.length;
//        int column2 = crr[0].length;
//
//        for(int i=0;i<crr.length;i++){
//            for(int j=0;j<crr[i].length;j++){
//                System.out.print(crr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
