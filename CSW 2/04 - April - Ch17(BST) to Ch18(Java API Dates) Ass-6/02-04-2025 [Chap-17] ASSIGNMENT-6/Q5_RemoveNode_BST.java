class BSTNode {
    int info;
    BSTNode left, right;
    public BSTNode(int info) { this.info = info; }
}

class BST {
    BSTNode root;

    public void insert(int val) { root = insertRec(root, val); }
    private BSTNode insertRec(BSTNode node, int val) {
        if (node == null) return new BSTNode(val);
        if (val < node.info) node.left = insertRec(node.left, val);
        else if (val > node.info) node.right = insertRec(node.right, val);
        return node;
    }

    public void delete(int val) { root = deleteRec(root, val); }
    private BSTNode deleteRec(BSTNode node, int val) {
        if (node == null) return null;
        if (val < node.info) node.left = deleteRec(node.left, val);
        else if (val > node.info) node.right = deleteRec(node.right, val);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            BSTNode temp = minValue(node.right);
            node.info = temp.info;
            node.right = deleteRec(node.right, temp.info);
        }
        return node;
    }

    private BSTNode minValue(BSTNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.info + " ");
            inorder(node.right);
        }
    }
}

public class Q5_RemoveNode_BST {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        
        for (int val : values) tree.insert(val);

        System.out.print("BST Tree Created is: ");      
        tree.inorder(tree.root);
        System.out.println();
        
        tree.delete(20); // Case 1: Leaf node
        tree.delete(30); // Case 2: Node with one child
        tree.delete(50); // Case 3: Node with two children
        
        System.out.print("Deletions completed. BST Tree after Deleting 20/30/50 is: ");
        tree.inorder(tree.root);
    }
}
