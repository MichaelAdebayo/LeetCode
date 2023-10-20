import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//This is the soulutions for the Leetcode Problems

public class Solution1a {
/**
 * Squares each element in the given array and returns a new array with the squared values sorted in ascending order.
 *
 * @param  nums  the array of integers to be squared and sorted
 * @return       the sorted array of squared values
 */
public int[] sortedSquares(int[] nums) {
    // Square each element in the array
    for(int i = 0; i < nums.length; i++){
        nums[i] *= nums[i];
    }
    
    // Sort the array in ascending order
    Arrays.sort(nums);

    // Return the sorted array
    return nums;
}


/**
 * Calculates the maximum average of a subarray of length k from an integer array.
 *
 * @param  nums  the input integer array
 * @param  k     the length of the subarray
 * @return       the maximum average of a subarray
 */
public double findMaxAverage(int[] nums, int k) {
    // Initialize the current sum to 0
    double curr = 0;
    
    // Calculate the sum of the first k elements and divide it by k
    for (int i = 0; i < k; i++) {
        curr += (double) nums[i] / k;
    }

    // Initialize the answer to the current sum
    double ans = curr;
    
    // Slide the subarray window by one position to the right and update the current sum
    for (int i = k; i < nums.length; i++) {
        curr += ((double) nums[i] - nums[i - k]) / k;
        ans = Math.max(ans, curr);
    }
    
    // Return the maximum average of a subarray
    return ans;
}

/**
 * Finds the length of the longest subarray with at most k zeros.
 *
 * @param  nums  an array of integers
 * @param  k     the maximum number of zeros allowed
 * @return       the length of the longest subarray
 */
public int longestOnes(int[] nums, int k) {
    // Initialize left pointer at the start of the array
    int left = 0;
    // Initialize current count of zeros
    int current = 0;
    // Initialize the answer to 0
    int ans = 0;

    // Iterate through the array using the right pointer
    for(int right = 0; right < nums.length; right++){
        // If the current element is 0, increment the count of zeros
        if(nums[right] == 0){
            current++;
        }
        // While the count of zeros exceeds the maximum allowed
        // number of zeros, move the left pointer and decrement
        // the count of zeros if the element at the left pointer
        // is 0
        while(current > k){
            if(nums[left] == 0){
                current--;
            }
            left++;
        }
        // Update the answer with the maximum length of subarray
        // found so far
        ans = Math.max(ans, right - left + 1);
    }

    // Return the answer
    return ans;
}

 public int[] runningSum(int[] nums) {
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i];
    }

    return prefixSum;
}

/**
 * Calculates the minimum start value for a given array of integers.
 *
 * @param  nums  the array of integers
 * @return       the minimum start value
 */
public int minStartValue(int[] nums) {
    // Initialize the start value to 1
    int startValue = 1;
    
    // Calculate the prefix sum array
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for(int i = 1; i < nums.length; i++){
        prefixSum[i] = prefixSum[i - 1] + nums[i]; 
    }

    // Find the minimum start value by checking each prefix sum
    for (int i = 0; i < nums.length; i++) {
        // If the prefix sum plus the start value is less than 1, update the start value
        if (prefixSum[i] + startValue < 1) {
            startValue = 1 - prefixSum[i];
        }
    }

    // Return the minimum start value
    return startValue;
}

    public int[] getAverages(int[] nums, int k) {
    int [] ans = new int[nums.length ];
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];

    for(int i = 1; i < nums.length; i++){
        prefixSum[i] = prefixSum[i - 1] + nums[i];
    }

    for(int j = 0; j < nums.length; j++){
        if(nums[j]< nums[k]){
            System.out.println(nums[j]);

        }
    }

        return ans;
        
    }

/**
 * Check if the given sentence is a pangram.
 *
 * @param  sentence  the sentence to be checked
 * @return           true if the sentence is a pangram, false otherwise
 */
public boolean checkIfPangram(String sentence) {
    // Create a set to store the unique characters seen in the sentence
    Set<Character> seen = new HashSet<>();

    // Iterate through each character in the sentence
    for (int i = 0; i < sentence.length(); i++) {
        // Add the current character to the set of seen characters
        seen.add(sentence.charAt(i));

        // If the set of seen characters has a size of 26 (the number of letters in the alphabet),
        // then all letters have been seen and the sentence is a pangram
        if (seen.size() == 26) {
            return true;
        }
    }

    // If the loop completes without returning true, the sentence is not a pangram
    return false;
}

public int missingNumber(int[] nums) {
    int number = 0;
    int count = 0;
    Set<Integer> frequency = new HashSet<>();
    Arrays.sort (nums);

    return 0;
        
    }



    

public int countElements(int[] arr) {
    int count = 0; // Initialize count variable to 0
    Set<Integer> set = new HashSet<>(); // Create a new HashSet to store unique elements

    for (int x : arr) {
        set.add(x); // Add each element from arr to the set
    }

    for (int x : arr) {
        if (set.contains(x + 1)) { // Check if the set contains the next element
            count++; // Increment count if the next element exists in the set
        }
    }

    return count; // Return the count of elements
}


public List<List<Integer>> findWinners(int[][] matches) {
    Map <Integer, Integer> winners = new HashMap<>();
    //if element is in [0][0] then the player has not lost any matches, should be added to the winners map

    for(int [] arr: matches ){
        for(int x : arr){
            matches[0][0] = 3;
            winners.put(x, winners.getOrDefault(x, 0) + 1);
        }


        }


    return null;
        
    }

/**
 * Finds the largest unique number in an array.
 *
 * @param  nums  the array of integers
 * @return       the largest unique number, or -1 if there are no unique numbers
 */
public int largestUniqueNumber(int[] nums) {
    // Map to store the count of each number in the array
    Map<Integer, Integer> countMap = new HashMap<>();
    
    // Iterate through the array and update the count of each number in the map
    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }
    
    // Initialize the answer as -1
    int largestUniqueNum = -1;
    
    // Iterate through the map entries
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        // Check if the count of the number is 1 (unique)
        if (entry.getValue() == 1) {
            int uniqueNum = entry.getKey();
            largestUniqueNum = Math.max(largestUniqueNum, uniqueNum);
        }
    }
    
    // Return the largest unique number
    return largestUniqueNum;
}

/**
 * Returns the maximum number of times the word "balloon" can be formed from the given text.
 *
 * @param  text  the input text
 * @return       the maximum number of times the word "balloon" can be formed
 */
public int maxNumberOfBalloons(String text) {
    // Initialize times with a large value
    int times = Integer.MAX_VALUE;

    // Define the keyword to form
    String keyWord = "balloon";

    // Count the frequency of each character in the input text
    Map<Character, Integer> wordMap = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
    }

    // Count the frequency of each character in the keyword
    Map<Character, Integer> keyWordMap = new HashMap<>();
    for (int i = 0; i < keyWord.length(); i++) {
        char c = keyWord.charAt(i);
        keyWordMap.put(c, keyWordMap.getOrDefault(c, 0) + 1);
    }

    // Check if the characters in the keyword can be formed from the characters in the input text
    for (Map.Entry<Character, Integer> entry : keyWordMap.entrySet()) {
        char key = entry.getKey();
        int countInKeyWord = entry.getValue();

        // Check if the character is present in wordMap
        if (!wordMap.containsKey(key)) {
            times = 0;
            break;
        }

        // Update times based on the minimum count of the character in the input text and the keyword
        times = Math.min(times, wordMap.get(key) / countInKeyWord);
    }

    return times;
}

public boolean canConstruct(String ransomNote, String magazine) {
    // Create maps to store the count of characters in the ransom note and magazine
    Map<Character, Integer> ransomNoteMap = new HashMap<>();
    Map<Character, Integer> magazineMap = new HashMap<>();

    // Iterate through the characters in the ransom note and update the count in the ransom note map
    for (int i = 0; i < ransomNote.length(); i++) {
        char c = ransomNote.charAt(i);
        ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
    }

    // Iterate through the characters in the magazine and update the count in the magazine map
    for (int i = 0; i < magazine.length(); i++) {
        char c = magazine.charAt(i);
        magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
    }

    // Iterate through the characters in the ransom note map
    for (char c : ransomNoteMap.keySet()) {
        // If the character is not present in the magazine map or the count in the magazine map is less than the count in the ransom note map, return false
        if (!magazineMap.containsKey(c) || magazineMap.get(c) < ransomNoteMap.get(c)) {
            return false;
        }
    }

    // All characters in the ransom note can be constructed from the characters in the magazine, so return true
    return true;
}
/**
 * Finds the middle node of a linked list.
 *
 * @param  head  the head of the linked list
 * @return       the middle node of the linked list
 */
public ListNode middleNode(ListNode head) {

    // Initialize two pointers, slow and fast, to the head of the linked list
    ListNode slow = head;
    ListNode fast = head;

    // Traverse the linked list using the fast pointer that moves twice as fast as the slow pointer
    while(fast != null && fast.next != null){
        slow = slow.next;   // Move the slow pointer one step forward
        fast = fast.next.next;   // Move the fast pointer two steps forward
    }

    // Return the node pointed to by the slow pointer, which is the middle node of the linked list
    return slow;
}

/**
 * This function deletes duplicate values from a linked list.
 * It takes the head of the linked list as a parameter and returns
 * the modified list with duplicates removed.
 */
public ListNode deleteDuplicates(ListNode head) {
    // Create a reference to the current node and initialize it with the head
    ListNode current = head;
    
    // Iterate through the linked list until the end or until the next node is null
    while (current != null && current.next != null) {
        // Check if the value of the current node is equal to the value of the next node
        if (current.val == current.next.val) {
            // If they are equal, skip the next node by updating the next pointer of the current node
            current.next = current.next.next;
        } else {
            // If they are not equal, move to the next node
            current = current.next;
        }
    }
    
    // Return the modified linked list
    return head;
}

public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode fast = head;
    ListNode slow = head;
    ListNode prev = null;
    ListNode temp = null;

    while(fast !=null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow.val == left && fast.val == right){
            
        }

    }
    return head;
        
    }


    public String simplifyPath(String path) {


        StringBuilder string = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char c: path.toCharArray()){
            stack.push(c);
             if(stack.peek () == '.'){
                stack.pop();

            if(stack.peek () == '/' && stack.peek () == '/')
             {
                stack.pop(); 
            }
            if(stack.peek () == '/'){
                stack.pop();
            }
             
            }
            if(stack.size()== 0){
                stack.push('/'); 
            }
            }
           if(stack.peek () == '/'){
                stack.pop(); 
            }
            
        for (char c : stack) {
            string.append(c);
        }
        String sentence = string.toString();
        return sentence;
    }


/**
 * Calculate the minimum depth of a binary tree.
 *
 * @param root The root node of the binary tree.
 * @return The minimum depth of the binary tree.
 */
public int minDepth(TreeNode root) {
    // If the root is null, the depth is 0.
    if (root == null) {
        return 0;
    }

    // If both left and right child nodes are null, the depth is 1.
    if (root.left == null && root.right == null) {
        return 1;
    }

    // Initialize left and right depth as maximum integer value.
    int leftDepth = Integer.MAX_VALUE;
    int rightDepth = Integer.MAX_VALUE;

    // If the left child node is not null, recursively calculate the depth of the left subtree.
    if (root.left != null) {
        leftDepth = minDepth(root.left);
    }

    // If the right child node is not null, recursively calculate the depth of the right subtree.
    if (root.right != null) {
        rightDepth = minDepth(root.right);
    }

    // Return the minimum depth of the left and right subtrees, plus 1 for the root node.
    return Math.min(leftDepth, rightDepth) + 1;
}

public int maxAncestorDiff(TreeNode root) {
    int difference = 0;
    
    if(root == null){
        return 1;
    }

    if(root.left == null || root.right == null){
        return 0;
    }
    
   Integer roots = root.val -  root.left.val;
   Integer rootsRight = root.val -  root.right.val;
    
    System.out.println("Difference: " + roots);
    System.out.println("Roots Right: " + rootsRight);

    if(root.right != null){ 
        roots = root.val -  root.left.val;
        maxAncestorDiff(root.right);
    }
    maxAncestorDiff(root.right);
    if(root.left != null){ 
        rootsRight = root.val -  root.right.val;
        maxAncestorDiff(root.left);
    }

    return Math.max(roots, difference);
        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helperDiameter(root,0 );
      }  
      
       private int helperDiameter(TreeNode root, int count){
            if(root == null){
                return 0;
            }
            int left = helperDiameter(root.left, count) ;
            int right = helperDiameter(root.right, count);
            count = Math.max(count, left + right);

            return count;
            
        }
        public int deepestLeavesSum(TreeNode root) {
             if (root == null) {
            return 0;
        }
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int currentLength = queue.size();
            int prev = 0;
            int currMax = Integer.MIN_VALUE;
            
            for (int i = 0; i < currentLength; i++) {
                TreeNode node = queue.remove();
                prev = node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(prev);
        }
        
        return 0;
}

public List<List<Integer>> zigzagLevelOrder(TreeNode root) {


    if(root == null){
        return null;
    }
    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> ansList = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
   while (!queue.isEmpty()) {
        int currentLength = queue.size();
        int prev = 0;
        for (int i = 0; i < currentLength; i++) {
            TreeNode node = queue.remove();
            prev = node.val;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            
            ans.add(prev);
        }
        
        ansList.add(ans);
    }
    return ansList;
        
    }

/**
 * Calculates the minimum stone sum after performing k operations on the given array of piles.
 *
 * @param  piles  the array of piles containing the number of stones in each pile
 * @param  k      the number of operations to perform
 * @return        the minimum stone sum after performing the operations
 */
public int minStoneSum(int[] piles, int k) {
    // Initialize the variable to hold the sum of the stone piles
    int ans = 0;

    // Create a max heap to store the stone pile sizes in descending order
    PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

    // Add the stone pile sizes to the heap
    for(int num : piles){
        heap.add(num);
    }

    // Perform k operations
    while(k > 0){
        // Remove the largest stone pile from the heap
        double x = heap.remove();

        // Divide the size of the stone pile by 2
        x /= 2;

        // Round up the result to the nearest integer
        x = Math.ceil(x);

        // Add the updated stone pile size back to the heap
        heap.add((int) x);

        // Decrement the number of operations remaining
        k--;
    }

    // Calculate the minimum stone sum by adding up all the stone pile sizes in the heap
    for (int num : heap) {
        ans += num;
    }

    // Return the minimum stone sum
    return ans;
}

/**
 * Calculates the minimum cost of connecting sticks.
 *
 * @param  sticks  an array of integers representing the lengths of the sticks
 * @return         the minimum cost of connecting the sticks
 */
public int connectSticks(int[] sticks) {

    
    // Initialize the answer variable to 0
    int ans = 0;

    // Create a priority queue to store the lengths of the sticks in ascending order
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    // Add all the stick lengths to the priority queue
    for (int stick : sticks) {
        heap.add(stick);
    }

    // Continue connecting sticks until there is only one stick left in the priority queue
    while (heap.size() > 1) {
        // Remove the two smallest sticks from the priority queue
        int x = heap.remove();
        int y = heap.remove();

        // Combine the two sticks and add the result back to the priority queue
        heap.add(x + y);

        // Add the cost of connecting the two sticks to the answer
        ans += x + y;
    }

    // Return the minimum cost of connecting the sticks
    return ans;
}


    public void KthLargest(int k, int[] nums) {
        int ans = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>( Collections.reverseOrder());
        for(int num : nums){
            heap.add(num);

        }
        while(k > 0){
            ans = heap.remove();
            k--;
        }
        

    }
    
    public int add(int val) {
        KthLargest(1, new int[]{val});
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
      



        return val;
        
    }

public int maximum69Number(int num) {
    // Convert the number to a string
    String numString = Integer.toString(num);
    
    // Create an array to store the digits of the number
    int[] arr = new int[numString.length()];

    // Store each digit of the number in the array
    for (int i = 0; i < numString.length(); i++) {
        arr[i] = Character.getNumericValue(numString.charAt(i));
    }

    // Find the first occurrence of the digit 6 and replace it with 9
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 6) {
            arr[i] = 9;
            break;
        }
    }

    // Convert the modified array back to a string
    StringBuilder numInt = new StringBuilder();
    for (int digit : arr) {
        numInt.append(digit);
    }

    // Convert the modified string back to an integer
    int ans = Integer.parseInt(numInt.toString());

    // Return the modified integer
    return ans;
}

public int maxNumberOfApples(int[] weight) {
        // Set the maximum weight limit
        int maxWeight = 5000;
        // Initialize variables for sum, count, and num
        int sum = 0;
        int count = 0;
        int num = 0;
        // Create a priority queue in descending order
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        // Iterate through the weight array
        for(int nums: weight){
            // Add each weight to the priority queue
            heap.add(nums);
            // Calculate the sum of all weights
            sum = nums + sum;
        }
        // Set the count to the length of the weight array
        count = weight.length;
        
        // Iterate through the weight array again
        for(int i = 0 ; i < weight.length; i ++){
            // Check if the sum of weights exceeds the maximum weight limit
            if(sum > maxWeight){
            // Remove the heaviest weight from the priority queue
            num = heap.remove();
            // Subtract the removed weight from the sum
            sum = sum - num;
            // Decrease the count by 1
            count--;
            }
        }
        
        // Return the final count of weights that can be carried
        return count;
    }
public int searchInsert(int[] nums, int target) {
    // Initialize the left and right pointers to the start and end of the array
    int left = 0;
    int right = nums.length - 1;
    
    // Perform binary search until left and right pointers meet
    while (left <= right) {
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        // Get the value at the middle index
        int num = nums[mid];
        
        // Check if the value at the middle index is equal to the target
        if (num == target) {
            // Return the middle index if the target is found
            return mid;
        }
        
        // If the value at the middle index is greater than the target,
        // update the right pointer to search the left half of the array
        if (num > target) {
            right = mid - 1;
        } else {
            // If the value at the middle index is less than the target,
            // update the left pointer to search the right half of the array
            left = mid + 1;
        }
    }
    
    // Return the left pointer as the insertion position for the target
    return left;
}
public int minSetSize(int[] arr) {
    // Calculate the target size of the set
    int targetSize = arr.length / 2;

    // Initialize the answer variable
    int ans = 0;

    // Create a map to store the frequencies of each element in the array
    Map<Integer, Integer> frequencies = new HashMap<>();

    // Iterate over the array and update the frequencies map
    for (int i : arr) {
        frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
    }

    // Create a list to store the frequencies in descending order
    List<Integer> ordered = new ArrayList<>(frequencies.values());
    ordered.sort(Collections.reverseOrder());

    // Calculate the number of elements that need to be removed from the set
    int removedCount = 0;
    int index = 0;
    while (removedCount < targetSize) {
        removedCount += ordered.get(index);
        index++;
        ans++;
    }

    // Return the answer
    return ans;
}


}
