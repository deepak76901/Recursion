import java.util.*;

class factorial{

    public static int find_factorial(int n){

        if(n<=1){
            return 1;
        }
        else{
            int temp = n * find_factorial(n-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial Program...");

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int result = find_factorial(n);
        System.out.println( "Factorial of entered number is : " +  result);
    }
}