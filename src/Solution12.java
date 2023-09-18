public class Solution12 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
            
        }


        if (root.val == val) {
            System.out.println("Found");
            return root;
        }

        return root;
        
    }
    
}
