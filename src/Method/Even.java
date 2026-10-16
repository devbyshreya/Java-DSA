package Method;
public class Even {
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result = isEven(44);
        System.out.print("Result: "+result);
        }
    }
