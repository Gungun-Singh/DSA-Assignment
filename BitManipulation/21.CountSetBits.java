/* How to count the number of 1s in the binary representation of numbers from 0 to n. 
Write its algorithm, program. Find its time and space complexities.  */


class Solution {
    public int hammingWeight(int n) {
       int count =0;
     while(n!=0){
         if((n & 1) == 1 ){
             count++;
         }
         n=n>>1;
     }
     return count;

    }
}


//TC - O(1)
//SC = O(1)
