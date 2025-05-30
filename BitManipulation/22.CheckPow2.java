/* 22. How to check if a number is a power of two using bit manipulation. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example.  */


class Solution {
    public boolean isPowerOfTwo(int n) {
     return n>0 &&(n & (n- 1)) == 0;
    }
}


//TC - O(1)
//SC - O(1)
