import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution9 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++){
            if(nums1[i] != nums2[i] ){
                    List<Integer> matchingList = new ArrayList<>();
                    matchingList.add(nums1[i]);
                    temp.add(matchingList);
                }
                
            }
            
        }
        
        return temp;
        
    }
    
}
