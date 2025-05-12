/* 34. Solve the problem of finding the subarray sum equal to K using hashing. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example.  */

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}

//TC - O(N)
//SC - O(N)
