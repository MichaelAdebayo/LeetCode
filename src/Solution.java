public class Solution {
    public String mergeAlternately(String word1, String word2) {

        String  mergedWords = word1 + word2;

        char [] test;

        for (int i = 0; i < mergedWords.length(); i ++){

            test = mergedWords.toCharArray();
            System.out.print(test[i]);
            System.out.println();
        }



        return mergedWords;
    }
}
