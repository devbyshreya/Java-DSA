package String;

public class Reverse {
    static void reverse(String str) {
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse: "+rev);
    }
    static void main(String[] args) {
        String str = "ARMAAN";
        reverse(str);
    }
}
