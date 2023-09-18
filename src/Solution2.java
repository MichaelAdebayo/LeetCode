public class Solution2 {
// Reverses the vowels in a given string
public String reverseVowels(String s) {
    // Create a StringBuilder object with the given string
    StringBuilder stringBuilder = new StringBuilder(s);
    
    // Initialize two pointers, left and right, to track the vowels from the start and end of the string
    int left = 0;
    int right = stringBuilder.length() - 1;

    // Iterate until the left and right pointers meet
    while (left < right) {
        // Check if both characters at the left and right pointers are vowels
        if (isVowel(stringBuilder.charAt(left)) && isVowel(stringBuilder.charAt(right))) {
            // Swap the vowels
            char temp = stringBuilder.charAt(left);
            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right, temp);
            left++;
            right--;
        } 
        // If the character at the left pointer is a vowel and the character at the right pointer is not a vowel
        else if (isVowel(stringBuilder.charAt(left))) {
            // Move the right pointer to the left
            right--;
        } 
        // If the character at the right pointer is a vowel and the character at the left pointer is not a vowel
        else {
            // Move the left pointer to the right
            left++;
        }
    }

    // Return the modified string with reversed vowels
    return stringBuilder.toString();
}

/**
 * Checks if a character is a vowel.
 *
 * @param c the character to check
 * @return true if the character is a vowel, false otherwise
 */
private boolean isVowel(char c) {
    c = Character.toLowerCase(c); // Convert the character to lowercase
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; // Check if the character is equal to any of the vowels
}
}
