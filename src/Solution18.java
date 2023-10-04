public class Solution18 {
    public boolean halvesAreAlike(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int countVowels = 0;

        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);

        for (int i = 0; i < vowels.length; i++) {
            if (firstHalf.contains(String.valueOf(vowels[i]))) {
                countVowels++;
            }
            if (secondHalf.contains(String.valueOf(vowels[i]))) {
                countVowels--;
            }
        }

        return countVowels == 0;
    }
}



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
