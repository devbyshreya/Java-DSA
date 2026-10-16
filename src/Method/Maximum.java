package Method;

public class Maximum {
    static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    static void main(){
        int largest = maximum(76,69);
        System.out.println(largest);
    }
}
