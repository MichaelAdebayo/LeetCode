class Solution14 {
/**
 * Counts the number of students who couldn't get their preferred sandwich.
 *
 * @param students    an array of integers representing the preferences of the students
 * @param sandwiches  an array of integers representing the available sandwiches
 * @return            the number of students who couldn't get their preferred sandwich
 */
public int countStudents(int[] students, int[] sandwiches) {
    // Create an array to store the count of each student's preference
    int[] count = new int[2];

    // Iterate through the students array
    for (int i = 0; i < students.length; i++) {
        // Increment the count of the student's preference
        count[students[i]]++;
    }

    // Initialize a variable to keep track of the number of students who couldn't get their preferred sandwich
    int studentsWithoutPreference = 0;

    // Iterate through the sandwiches array
    for (int i = 0; i < sandwiches.length; i++) {
        // Check if the current sandwich preference is available
        if (count[sandwiches[i]] > 0) {
            // Decrement the count of the sandwich preference
            count[sandwiches[i]]--;
        } else {
            // If the sandwich preference is not available, increment the studentsWithoutPreference count
            studentsWithoutPreference++;
        }
    }

    // Return the number of students who couldn't get their preferred sandwich
    return studentsWithoutPreference;
}
}