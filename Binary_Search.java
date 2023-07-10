import java.util.*;

public class Binary_Search {

    public static int Search(int[] arr, int target, int low, int high) {
        int temp = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return Search(arr, target, mid + 1, high);
            } else {
                return Search(arr, target, low, mid - 1);
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };

        int target = 22;

        int result = Search(arr, target, 0, arr.length - 1);
        if(result == -1){
            System.out.println("Target element not present");
        }else{

            System.out.println("The number present at index : " + result);
        }
    }
}
