class TreeNode {
    int value;
    TreeNode left, right;
    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}
class BST1 {
    private TreeNode root;
    public BST1() {
        root = null;
    }

    public void createTree(int[] sortedArr) {
        root = createTreeRec(sortedArr, 0, sortedArr.length - 1);
    }
    private TreeNode createTreeRec(int[] sortedArr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(sortedArr[mid]);

        node.left = createTreeRec(sortedArr, start, mid - 1);
        node.right = createTreeRec(sortedArr, mid + 1, end);
        return node;
    }
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }
    public TreeNode getRoot() {
        return root;
    }
}
public class P2_CreateTree {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BST1 bst = new BST1();
        bst.createTree(sortedArray);
        System.out.println("Inorder Traversal of the constructed BST:");
        bst.inorder(bst.getRoot());
    }
}