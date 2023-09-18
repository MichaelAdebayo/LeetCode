import java.util.Arrays;

public class Solution11 {
public int heightChecker(int[] heights) {
    // Initialize a variable to keep count of the number of students
    // whose heights are not in the correct order
    int count = 0;

    // Create a copy of the original heights array
    int[] originalHeights = Arrays.copyOf(heights, heights.length);

    // Sort the original heights array in ascending order
    Arrays.sort(originalHeights);

    // Iterate through each element in the heights array
    for (int i = 0; i < heights.length; i++) {
        // Compare the current height with the corresponding height
        // in the sorted original heights array
        if (heights[i] != originalHeights[i]) {
            // If the heights are not equal, increment the count
            count++;
        }
    }

    // Return the final count of students with heights not in order
    return count;
}
    
}
