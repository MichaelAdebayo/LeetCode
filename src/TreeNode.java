public class TreeNode {
    // Define an integer variable to store the value of the node
    int val;
    // Define a reference to the left child node
    TreeNode left;
    // Define a reference to the right child node
    TreeNode right;
    
    // Default constructor
    TreeNode() {}
    
    // Constructor with value parameter
    TreeNode(int val) {
        // Set the value of the node to the provided value
        this.val = val;
    }
    
    // Constructor with value, left, and right parameters
    TreeNode(int val, TreeNode left, TreeNode right) {
        // Set the value of the node to the provided value
        this.val = val;
        // Set the left child node reference to the provided left node
        this.left = left;
        // Set the right child node reference to the provided right node
        this.right = right;
    }

/**
 * Print the values of a binary tree in order.
 * 
 * @param node The root node of the binary tree.
 */
public static void printInOrder(TreeNode node) {
    // Base case: if the node is null, return
    if (node == null) {
        return;
    }

    // Recursive call to print the left subtree
    printInOrder(node.left);

    // Print the current node's value
    System.out.println(node.val);

    // Recursive call to print the right subtree
    printInOrder(node.right);
}
    
}
