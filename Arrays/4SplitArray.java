/* Check if an array can be split into two parts such that the sum of the prefix equals the 
sum of the suffix. Write its algorithm, program. Find its time and space complexities.
  */

package Strings;
import java.util.Scanner;
public class prefix {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (
                int i = 0;
                i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate total sum of the array
        int totalSum = 0;
        for (
                int i = 0;
                i < n; i++) {
            totalSum += arr[i];
        }

        // Initialize left sum
        int leftSum = 0;
        boolean found = false;

        // Traverse the array and check
        for (
                int i = 0;i<n;i++) {
            int rightSum = totalSum-leftSum-arr[i];
            if (leftSum == rightSum) {
                System.out.println("Array can be split at index " +i);
                found = true;
                break;
            }
            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("Array cannot be split.");
        }
    }
}


// TC - O(n)
// SC - O(n)

