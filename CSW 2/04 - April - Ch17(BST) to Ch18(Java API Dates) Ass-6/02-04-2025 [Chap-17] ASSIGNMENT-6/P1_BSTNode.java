class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        left = right = null;
    }
}

public class P1_BSTNode {
    private BSTNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode insertRec(BSTNode node, int value) {
        if (node == null) return new BSTNode(value);
        if (value < node.info) {
            node.left = insertRec(node.left, value);
        } 
        else if (value > node.info) {  // Prevent duplicates
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(BSTNode node) {
        if (node == null) return;
        System.out.print(node.info + " ");
        preOrderRec(node.left);
        preOrderRec(node.right);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(BSTNode node) {
        if (node == null) return;
        inOrderRec(node.left);
        System.out.print(node.info + " ");
        inOrderRec(node.right);
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(BSTNode node) {
        if (node == null) return;
        postOrderRec(node.left);
        postOrderRec(node.right);
        System.out.print(node.info + " ");
    }

    public static void main(String[] args) {
        P1_BSTNode tree = new P1_BSTNode();
        int[] values = {10, 5, 9, 4, 7, 15, 20};

        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Pre-order traversal:");
        tree.preOrder();
        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println("Post-order traversal:");
        tree.postOrder();
    }
}
