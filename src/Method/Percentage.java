package Method;

public class Percentage {
    static double calculatePercentage(int obtained, int total) {
        return ((double)obtained/total)*100;
    }

    public static void main(String[] args){
       double percentage = calculatePercentage(369, 500);
       System.out.println(percentage);
    }
}

