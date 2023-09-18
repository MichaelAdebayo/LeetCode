public class SO {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergeds = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            mergeds.append(word1.charAt(i++)).append(word2.charAt(j++));
        }

        // Append any remaining letters from word1
        while (i < word1.length()) {
            mergeds.append(word1.charAt(i++));
        }

        // Append any remaining letters from word2
        while (j < word2.length()) {
            mergeds.append(word2.charAt(j++));
        }

        return mergeds.toString();
    }
}
