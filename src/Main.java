import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
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
        //solution12.searchBST(root2, 4);

        int [] prices = {7,1,5,3,6,4};

        Solution13 solution13 = new Solution13();

       // System.out.println(solution13.maxProfit(prices));

        Solution14 solution14 = new Solution14();

        int [] students = {1,1,0,0};
         int [] sandwiches = {0,1,0,1};

     


        System.out.println(solution14.countStudents(students, sandwiches));


       



    }
  



}