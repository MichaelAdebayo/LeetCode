
public class Solution5 {
public boolean uniqueOccurrences(int[] arr) {
    int[] count = new int[2001]; // Assuming the range of values is from -1000 to 1000
    for (int num : arr) {
        count[num + 1000]++;
    }

    boolean[] unique = new boolean[arr.length + 1];
    for (int c : count) {
        if (c != 0) {
            if (unique[c]) {
                return false;
            }
            unique[c] = true;
        }
    }

    return true;
}
}
        
    

            