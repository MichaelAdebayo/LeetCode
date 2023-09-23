import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion {
/**
 * Filters the given array by keeping only the elements that are greater than their neighboring elements.
 *
 * @param  arr  the input array to be filtered
 * @return      the new array containing the filtered elements
 */
public int[] filterArray(int[] arr) {
    List<Integer> filteredList = new ArrayList<>(); // Create a new ArrayList to store the filtered elements

    if (arr.length > 0) { // Check if the input array is not empty
        filteredList.add(arr[0]); // Always keep the first element

        // Iterate over the elements of the input array, skipping the first and last elements
        for (int i = 1; i < arr.length - 1; i++) {
            // Check if the current element is greater than the previous and next elements
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                filteredList.add(arr[i]); // Add the current element to the filtered list
            }
        }

        filteredList.add(arr[arr.length - 1]); // Always keep the last element
    }

    int[] newArray = new int[filteredList.size()]; // Create a new array with the size of the filtered list

    // Iterate over the elements of the filtered list and copy them to the new array
    for (int i = 0; i < filteredList.size(); i++) {
        newArray[i] = filteredList.get(i);
    }

    return newArray; // Return the new array containing the filtered elements
}
}
