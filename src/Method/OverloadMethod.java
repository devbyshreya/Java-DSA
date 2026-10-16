package Method;

public class OverloadMethod {
    static void display(int n){
        System.out.println(n);
    }
    static void display(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        display(20);
        display("Shreya");
    }
}
