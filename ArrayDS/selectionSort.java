// Java program for implementation of Selection Sort
import java.util.*;

class selectionSort{

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }
            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;           
        }
    }
    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("Enter the elements into the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}