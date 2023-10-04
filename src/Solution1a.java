import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//This is the soulutions for the Leetcode Problems

public class Solution1a {
/**
 * Squares each element in the given array and returns a new array with the squared values sorted in ascending order.
 *
 * @param  nums  the array of integers to be squared and sorted
 * @return       the sorted array of squared values
 */
public int[] sortedSquares(int[] nums) {
    // Square each element in the array
    for(int i = 0; i < nums.length; i++){
        nums[i] *= nums[i];
    }
    
    // Sort the array in ascending order
    Arrays.sort(nums);

    // Return the sorted array
    return nums;
}


/**
 * Calculates the maximum average of a subarray of length k from an integer array.
 *
 * @param  nums  the input integer array
 * @param  k     the length of the subarray
 * @return       the maximum average of a subarray
 */
public double findMaxAverage(int[] nums, int k) {
    // Initialize the current sum to 0
    double curr = 0;
    
    // Calculate the sum of the first k elements and divide it by k
    for (int i = 0; i < k; i++) {
        curr += (double) nums[i] / k;
    }

    // Initialize the answer to the current sum
    double ans = curr;
    
    // Slide the subarray window by one position to the right and update the current sum
    for (int i = k; i < nums.length; i++) {
        curr += ((double) nums[i] - nums[i - k]) / k;
        ans = Math.max(ans, curr);
    }
    
    // Return the maximum average of a subarray
    return ans;
}

/**
 * Finds the length of the longest subarray with at most k zeros.
 *
 * @param  nums  an array of integers
 * @param  k     the maximum number of zeros allowed
 * @return       the length of the longest subarray
 */
public int longestOnes(int[] nums, int k) {
    // Initialize left pointer at the start of the array
    int left = 0;
    // Initialize current count of zeros
    int current = 0;
    // Initialize the answer to 0
    int ans = 0;

    // Iterate through the array using the right pointer
    for(int right = 0; right < nums.length; right++){
        // If the current element is 0, increment the count of zeros
        if(nums[right] == 0){
            current++;
        }
        // While the count of zeros exceeds the maximum allowed
        // number of zeros, move the left pointer and decrement
        // the count of zeros if the element at the left pointer
        // is 0
        while(current > k){
            if(nums[left] == 0){
                current--;
            }
            left++;
        }
        // Update the answer with the maximum length of subarray
        // found so far
        ans = Math.max(ans, right - left + 1);
    }

    // Return the answer
    return ans;
}

 public int[] runningSum(int[] nums) {
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i];
    }

    return prefixSum;
}

/**
 * Calculates the minimum start value for a given array of integers.
 *
 * @param  nums  the array of integers
 * @return       the minimum start value
 */
public int minStartValue(int[] nums) {
    // Initialize the start value to 1
    int startValue = 1;
    
    // Calculate the prefix sum array
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for(int i = 1; i < nums.length; i++){
        prefixSum[i] = prefixSum[i - 1] + nums[i]; 
    }

    // Find the minimum start value by checking each prefix sum
    for (int i = 0; i < nums.length; i++) {
        // If the prefix sum plus the start value is less than 1, update the start value
        if (prefixSum[i] + startValue < 1) {
            startValue = 1 - prefixSum[i];
        }
    }

    // Return the minimum start value
    return startValue;
}

    public int[] getAverages(int[] nums, int k) {

    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];

    for(int i = 1; i < nums.length; i++){
        prefixSum[i] = prefixSum[i - 1] + nums[i]; 

        } 
        /*
        for(){
        if (nums[i -1] < k){
            nums[i] = -1;
        }
    } */
        return nums;
        
    }

/**
 * Check if the given sentence is a pangram.
 *
 * @param  sentence  the sentence to be checked
 * @return           true if the sentence is a pangram, false otherwise
 */
public boolean checkIfPangram(String sentence) {
    // Create a set to store the unique characters seen in the sentence
    Set<Character> seen = new HashSet<>();

    // Iterate through each character in the sentence
    for (int i = 0; i < sentence.length(); i++) {
        // Add the current character to the set of seen characters
        seen.add(sentence.charAt(i));

        // If the set of seen characters has a size of 26 (the number of letters in the alphabet),
        // then all letters have been seen and the sentence is a pangram
        if (seen.size() == 26) {
            return true;
        }
    }

    // If the loop completes without returning true, the sentence is not a pangram
    return false;
}







    
}
