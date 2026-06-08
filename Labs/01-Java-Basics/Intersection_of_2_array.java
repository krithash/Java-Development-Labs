package Array;
import java.util.Scanner;

public class Intersection_of_2_array {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        
        // Input for array 1
        System.out.println("Enter number of elements for array 1:");
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements for array 1:");
        for(int i = 0; i < n; i++) {
            arr1[i] = obj.nextInt();
        }
        
        // Input for array 2
        System.out.println("Enter number of elements for array 2:");
        int m = obj.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements for array 2:");
        for(int i = 0; i < m; i++) {
            arr2[i] = obj.nextInt();
        }

        // Store intersection elements
        int[] intersection = new int[Math.min(n, m)];
        int k = 0;

        // Check for common elements and avoid duplicates in intersection
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if already added to intersection[]
                    boolean alreadyExists = false;
                    for (int l = 0; l < k; l++) {
                        if (intersection[l] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }

                    // If not already in intersection, add it
                    if (!alreadyExists) {
                        intersection[k++] = arr1[i];
                    }
                    break; // move to next arr1[i]
                }
            }
        }

        // Print intersection array
        System.out.println("Intersection of the arrays:");
        if (k == 0) {
            System.out.println("No common elements.");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Element " + i + " is " + intersection[i]);
            }
        }

        obj.close();
    }
}
