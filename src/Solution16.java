public class Solution16 {
    public int alternateDigitSum(int n) {
        //base case
        if( n <= 1){
            return n;
        }
        return alternateDigitSum(n - 1) + n;

    }
    
}