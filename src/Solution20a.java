public class Solution20a {
    public int[] twoSum(int[] nums, int target) {
        int total = 0;
        int n1 = 0;
        int n2 = 0;
        int [] found = new int[2];


        for(int i = 0; i < nums.length - 1 ; i++){
            n1 = nums[i];
            n2 = nums[i+1];
            total = n1 + n2;

            if(total == target){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                found[0] = n1;
                found[1] = n2;
            }
        }
        return found; 
    }
    
}
