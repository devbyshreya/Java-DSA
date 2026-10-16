import java.util.Scanner;
public class Patterns {
    static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();    //row
    System.out.print("Enter the number of columns: ");
    int m = sc.nextInt();     //column

    //square pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*  ");
      }
      System.out.println();
    }
    // Solid rectangle
    for(int i=1; i<=n; i++){
      for(int j=1; j<=m; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    //Hollow Rectangle
    for(int i=1; i<=n; i++){
      for(int j=1; j<=m; j++){
        if(i==1||i==n||j==1||j==m){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
  }

    //Solid Right angle triangle
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    //Hollow Right angle triangle
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == n || j == 1 || j == i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //Inverted right angle triangle
    for(int i=n; i>=1; i--){
      for(int j=i; j>=1; j--){
        System.out.print("* ");
      }
      System.out.println();
    }

    //Hollow inverted RAT
    for(int i=n; i>=1; i--){
      for(int j=i; j>=1; j--){
        if(i==n||j==1||j==i){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //Solid rhombus
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      for(int j=1; j<=n; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    //hollow rhombus
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      for(int j=1; j<=n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*  ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }

    //solid triangle
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    //another method for triangle
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print(" *");
      }
      System.out.println();
    }

    //Inverted Triangle
    for(int i=n; i>=1; i--){
      for(int j=n-i; j>=1; j--){
        System.out.print(" ");
      }
      for(int j=i; j>=1; j--){
        System.out.print("* ");
      }
      System.out.println();
    }

    //hollow triangle
    for(int i=1; i<=n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        if(j==1||j==i||i==n){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //inverted hollow traingle
    for(int i=n;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        if(j==1||j==i||i==n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //solid left angle traingle
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(" *");
      }
      System.out.println();
    }

    //inverted Left angle triangle
    for(int i=n;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(" *");
      }
      System.out.println();
    }

    //hollow LAT
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        if(j==1||j==i||i==n){
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //hollow inverted LAT
    for(int i=n;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--){
        if(i==n||j==1||j==i){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //Solid Diamond
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=2*i-1;j>=1;j--){
        System.out.print(" *");
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print("  ");
      }
      for(int j=2*i-1;j>=1;j--){
        System.out.print(" *");
      }
      System.out.println();
    }

    //Hollow Diamond
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        if(j==1||j==2*i-1){
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        if(j==1||j==2*i-1){
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //Butterfly
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      int space = 2*(n-i);           //space
      for(int j=1;j<=space;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(" *");
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      int space = 2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(" *");
      }
      System.out.println();
    }

    //Hollow Butterfly
      //upper half
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        if(j==1||j==i){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
        int space = 2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        if(j==1||j==i){
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
      //lower half
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=i;j++){
        if(j==1||j==i){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
        //spaces
      int space = 2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        if(j==1||j==i){
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    //HourGlass
    for (int i=n; i>=1; i--) {
      for (int j = 1; j <=n-i; j++) {
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=2; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    //1
    //1 2
    //1 2 3   pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    // 1
    // 2 2
    // 3 3 3   pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }

    // 3 2 1
    // 2 1
    // 1           pattern
    for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    // 3 3 3
    // 2 2
    // 1          pattern
    for(int i=n;i>=1;i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    // 1
    // 2 3
    // 4 5 6    pattern
    int num = 1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(num+" ");
        num++;
      }
      System.out.println();
    }

   //      1
   //    1 2 1
   //  1 2 3 2 1        pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
      }
      for(int j=i-1;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    //     1
    //   2 2 2
    // 3 3 3 3 3      pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }

    //     1
    //   1 2
    // 1 2 3          Pattern
    for(int i=1;i<=n;i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }

    //      1
    //    1   2
    //  1   2   3       pattern
    for(int i=1;i<=n;i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j+"   ");
      }
      System.out.println();
    }

    //     1
    //   2   2
    // 3   3   3         Pattern
    for(int i=1;i<=n;i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i+"   ");
      }
      System.out.println();
    }

    // 3 2 1
    // 2 1
    // 1     Patten
    for(int i=n; i>=1; i--){
      for(int j=i; j>=1; j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    //     1
    //   2 1 2
    // 3 2 1 2 3       Pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      for(int j=2;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    // 1
    // 0 1
    // 1 0 1       Pattern
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        int sum = i+j;
        if(sum%2==0){
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }

    // 1 0 1
    // 1 0
    // 1              Pattern
    for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(" 1");
        } else {
          System.out.print(" 0");
        }
      }
      System.out.println();
    }

    // 1
    // 2 4
    // 3 6 9
    // 4 8 12 16        Pattern
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(i*j+" ");
      }
      System.out.println();
    }

    // A
    // A B
    // A B C        Pattern
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j)+" ");
      }
      System.out.println();
    }

    // C B A
    // B A
    // A            Pattern
    for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--){
        System.out.print((char)(64+j)+" ");
      }
      System.out.println();
    }

    // A
    // B A
    // C B A       Pattern
    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.print((char)(64+j)+" ");
      }
      System.out.println();
    }

    // a
    // a b
    // a b c
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print((char)(j+96)+" ");
      }
      System.out.println();
    }

    // c b a
    // b a
    // a
        for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--){
        System.out.print((char)(j+96)+" ");
      }
      System.out.println();
    }

    // a
    // b a
    // c b a              Pattern
        for(int i=1; i<=n; i++){
          for(int j=i; j>=1; j--){
            System.out.print((char)(96+j)+" ");
          }
          System.out.println();
        }

    // C
    // C B
    // C B A       Pattern
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print((char)('C'-j+1)+" ");
      }
      System.out.println();
    }

    //     A
    //   A B A
    // A B C B A         Pattern
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= n-i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j)+" ");
      }
      for(int j = i-1; j >= 1 ; j--) {
        System.out.print((char)(64+j)+" ");
      }
      System.out.println();
    }
  }
}



