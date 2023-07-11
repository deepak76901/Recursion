import java.util.*;

public class fibonacci {

    public static int fibonacci_series(int n){
        
        if(n<=1){
            return n;
        }
        else{
            int flag = fibonacci_series(n-1) + fibonacci_series(n-2);
            return flag;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Fibonacci Series ...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int result = fibonacci_series(n);
        System.out.println("Rsult of series is : " + result);
    }
}
