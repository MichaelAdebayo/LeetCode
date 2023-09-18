public class Solution6 {
     public int singleNumber(int[] nums) {
        int uniqueNumber = 0; 
     for (int num : nums) {
            uniqueNumber ^= num; // XOR operation
        }
        
        return uniqueNumber;
    }

   
    
}
