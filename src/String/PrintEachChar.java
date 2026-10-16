package String;

public class PrintEachChar {
    public static void printEachChar(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            System.out.println(str.charAt(i));
        }
    }
    static void main(String[] args){
        String str = "SHREYA";
        printEachChar(str);
    }
}
