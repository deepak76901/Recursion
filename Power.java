import java.util.*;
import java.io.*;

public class Power {

    public static int findpower(int a, int b) {
        int temp = 0;
        if (b == 0)
            return 1;
        temp = a * findpower(a, b - 1);
        return temp;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value : ");
        int a = sc.nextInt();
        System.out.println("Enter the powered Value : ");
        int b = sc.nextInt();

        int result = findpower(a, b);
        System.out.println("Result of entered value : " + result);
    }
}
