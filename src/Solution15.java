import java.lang.reflect.Array;
import java.util.Arrays;
public class Solution15 {
    public int findMaxK(int[] nums) {
        int maxNum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == Math.abs(nums[i])){
                System.out.println(nums[i]);

            }
        }


/*
for(int i = 0; i < nums.length ; i++){
    nums[i] = Math.abs(nums[i]);
    maxNum = nums[0];
}
Arrays.sort(nums);

for(int x : nums){
    if(x > maxNum){
        maxNum = x;
    }
    if(maxNum == x){
    }
    else{
        return -1;
    }

}
for (int j = 0 ; j < nums.length; j++) {
    if(nums[j] == maxNum){
        System.out.println(nums[j]);
    }

}
*/
        return maxNum;
        
    }
    
}
