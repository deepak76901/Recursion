import java.util.*;
import java.io.*;

public class TableForming {

    public static void multiplier(int n, int k) {

        if (k == 1) {
            System.out.println(n);
            return ;
        }else{

            multiplier(n, k - 1);
            System.out.println(n * k);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. : ");
        int n = sc.nextInt();
        System.out.println("How much times You want the multiple of N : ");
        int k = sc.nextInt();
        sc.close();
        System.out.println("Given Code Output is : ");

        multiplier(n, k);

    }
}
