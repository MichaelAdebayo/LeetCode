import java.lang.annotation.Target;

public class Solution20 {
/**
 * Finds two elements in the given array that sum up to the target value.
 *
 * @param  nums    the array of integers to search
 * @param  target  the target value to find the sum of
 * @return         an array containing the indices of the found elements
 */
public int[] twoSum(int[] nums, int target) {
    int[] found = new int[2]; // Create an array to store the indices of the found elements
    
    // Iterate through each element in the array, excluding the last element
    for (int i = 0; i < nums.length - 1; i++) {
        // Iterate through each element after the current element
        for (int j = i + 1; j < nums.length; j++) {
            // Check if the sum of the current element and the next element equals the target
            if (nums[i] + nums[j] == target) {
                // Store the indices of the found elements in the 'found' array
                found[0] = i;
                found[1] = j;
                break; // Exit the loop since we have found the desired elements
            }
        }
    }

    return found; // Return the array with the indices of the found elements
}
        
    }
    
