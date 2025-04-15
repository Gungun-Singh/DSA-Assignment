/*16. Find the majority element in an array that appears more than n/2 times. Write its 
 program. Find its time and space complexities. */



public class MajorityElementFinder {

    public static Integer findMajorityElement(int[] nums) {
        // Step 1: Find candidate
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return null; // No majority element
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        Integer result = findMajorityElement(arr);

        if (result != null) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}


//TC - O(n)
//SC - O(1)


