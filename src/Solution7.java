public class Solution7 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if (words[i].contains(allowed)){
                count++;            }

        }

        return count;
        
    }
    
}
