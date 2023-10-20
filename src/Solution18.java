public class Solution18 {
 
    public boolean halvesAreAlike(String s) {
        // Convert the string to lowercase to handle uppercase and lowercase vowels
        s = s.toLowerCase();
        int len = s.length();
        int count = 0;

        for (int i = 0; i < len / 2; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        for (int i = len / 2; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count--;
            }
        }

        return count == 0;
    }
}
