import java.util.*;
public class P3 {
    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
    private Node root;
    public P3() {        root = null;       }
    public void insert(int key) {        root = insertRec(root, key);       }
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public boolean isBST() {        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);       }

    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.key < min || node.key > max) {
            return false;
        }
        return isBSTUtil(node.left, min, node.key - 1) && isBSTUtil(node.right, node.key + 1, max);
    }
    public List<Integer> toArray() {
        List<Integer> result = new ArrayList<>();
        toArrayRec(root, result);
        return result;
    }
    private void toArrayRec(Node node, List<Integer> result) {
        if (node != null) {
            toArrayRec(node.left, result);
            result.add(node.key);
            toArrayRec(node.right, result);
        }
    }
    public static void main(String[] args) {
    	P3 bst = new P3();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println(bst.toArray());

        if (bst.isBST()) {
            System.out.println("The tree is a BST.");
        } else {
            System.out.println("The tree is not a BST.");
        }
        bst.root.left.right.key = 55; 

        System.out.println("\n"+bst.toArray());

        if (bst.isBST()) {
            System.out.println("The tree is a BST.");
        } else {
            System.out.println("The tree is not a BST.");
        }
    }
}