import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;




public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(7);
        TreeNode leftGrandchild = new TreeNode(1);
        TreeNode rightGrandchild = new TreeNode(3);

        TreeNode root1 = new TreeNode();


        TreeNode root2 = new TreeNode(4,leftChild,rightChild);

       


        // Build the tree structure
        root.left = leftChild;
        root.right = rightChild;
        leftChild.left = leftGrandchild;
        leftChild.right = rightGrandchild;


       // TreeNode.printInOrder(root);

        Solution12 solution12 = new Solution12();
      //  solution12.searchBST(root2, 4);

       /*
       InterviewQuestion interviewQuestion = new InterviewQuestion();
       
       int[] originalArray = {5, 8, 7, 1, 9, 3, 10, 12};
       int[] newArray = interviewQuestion.filterArray(originalArray);
       
       for (int num : newArray) {
           System.out.print(num + " ");
       }
       */

       //

    

       int []nums = {5,7,3,9,4,9,8,3,1};

       Solution1a solution1a = new Solution1a();
       System.out.println(solution1a.largestUniqueNumber(nums));

       char c [] = {'h', 'e', 'l', 'l', 'o'};

       for(int i = 0; i < c.length; i++){
        char x = c[i];
        char y = c[c.length -i - 1];
        char temp;

        temp = x;
        x = y;
        y = temp;

       // System.out.print(x);

       }








     

       

      

       






   
       
      


       



    }
  



}