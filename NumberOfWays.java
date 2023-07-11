import java.util.*;
import java.io.*;

public class NumberOfWays {
    public static int num_of_ways(int n){
            if(n<= 3){
                return n;
            }
            else{
                int temp;
                temp = num_of_ways(n-1) + num_of_ways(n-2);
                return temp;
            }
        }

    public static void main(String[] args) {

        
        
        System.out.println("Enter the Number of Stairs to find the ways : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = num_of_ways(n);
        System.out.println("Number of Ways to cover the stairs : " + res);
        sc.close();
    }
}
