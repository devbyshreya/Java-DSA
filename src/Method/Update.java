package Method;

public class Update {
    static void updateValue(int x){
        x = 5;
        System.out.println("Inside UpdateValue: "+x);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Before method call: "+n);
        updateValue(n);
        System.out.println("After method call: "+n);
    }
}
