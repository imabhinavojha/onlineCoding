package Strivers_A2Z_DSA_Course;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BalancedBinaryTree {
    public static TreeNode createBalancedTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle element and make it root
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively construct the left and right subtrees
        node.left = createBalancedTree(nums, start, mid - 1);
        node.right = createBalancedTree(nums, mid + 1, end);

        return node;
    }

    // In-order traversal to verify the tree structure
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        TreeNode root = createBalancedTree(nums, 0, nums.length - 1);

        System.out.print("In-order Traversal of Balanced Tree: ");
        inOrderTraversal(root);  // Output should be: 1 2 3 4 5 6
    }
}
