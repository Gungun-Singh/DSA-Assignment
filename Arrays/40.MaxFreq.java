/* 40. Solve the problem of finding the element with maximum frequency in an array. Write 
its algorithm, program. Find its time and space complexities.  */


import java.util.*;

public class MaxFrequencyElement {

    // Function to find the element with maximum frequency
    public static int findMaxFrequencyElement(int[] arr) {
        // HashMap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        
           int n= arr.length;
        
        for(int num :arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxfreq =0;
        int mostFreqElem = -1; 
        
            for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > maxfreq) {
                maxfreq = freq;
                mostFreqElem = key;
            }
        }
        
        return mostFreqElem; 
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5};
        System.out.println("Element with maximum frequency: " + findMaxFrequencyElement(arr));
    }
}


//TC - O(N)
//SC - O(N)
