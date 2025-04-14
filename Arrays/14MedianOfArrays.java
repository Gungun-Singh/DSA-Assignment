/* 14. Find the median of two sorted arrays using binary search. Write its algorithm, program. 
Find its time and space complexities. */

public class MedianTwoSorted {

    public static double findMedian(int[] a, int[] b) {
        if (a.length > b.length) return findMedian(b, a); // Make sure a is smaller

        int x = a.length;
        int y = b.length;
        int low = 0, high = x;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (x + y + 1) / 2 - i;

            int maxLeftA = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int minRightA = (i == x) ? Integer.MAX_VALUE : a[i];

            int maxLeftB = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int minRightB = (j == y) ? Integer.MAX_VALUE : b[j];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 8};
        int[] b = {7, 9, 10, 11};

        double median = findMedian(a, b);
        System.out.println("Median is: " + median);
    }
}



//TC - O(log(min(n, m)))
//SC - 	O(1)
