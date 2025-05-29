/*Design a Java to manage country data using Binary Search Tree . Create a class Country with member for the name and population , along with the construct with necessary methods.
 * Define a class BNode to store country object and maintain refernence to its left and right children.  Implement a class BSTCountry with a rootNode 
 * constructor and method to insert the country into the tre based on their population. Extened the BST by adding method, inOrder traversal, finding the country with 
 * the maximum population (FindMax) and  the minimum population (FindMin) . finally  develope a main methhod to create BST , insert Country nodes and invoke those method to display the result.  */
class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country ---> Name = " + name + " & Population = " + population;
    }
}

class BNode {
    Country country; 
    BNode left, right; 

    public BNode(Country country) {
        this.country = country;
        left = right = null;
    }
}

class BSTCountry {
    BNode rootNode;

    public BSTCountry() {
        rootNode = null;
    }

    public void insert(Country country) {
        rootNode = insertRec(rootNode, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            return new BNode(country); 
        }
        if (country.population < root.country.population) {
            root.left = insertRec(root.left, country); 
        } else if (country.population > root.country.population) {
            root.right = insertRec(root.right, country); 
        }
        return root; 
    }

    public void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.country);
            inOrderTraversal(node.right);
        }
    }

    public Country findMax() {
        if (rootNode == null) {
            return null; 
        }
        BNode current = rootNode;
        while (current.right != null) { 
            current = current.right;
        }
        return current.country; 
    }

    public Country findMin() {
        if (rootNode == null) {
            return null; 
        }
        BNode current = rootNode;
        while (current.left != null) { 
            current = current.left;
        }
        return current.country; 
    }
}

public class P4_BSTCountry {
    public static void main(String[] args) {
        BSTCountry tree = new BSTCountry();

        tree.insert(new Country("India", 240000000));
        tree.insert(new Country("Japan", 1231000000));
        tree.insert(new Country("Australis", 670000000));
        tree.insert(new Country("Europe", 189000000));
        tree.insert(new Country("Malaysia", 8000000));

        System.out.println("In-order Traversal of Countries:");
        tree.inOrderTraversal(tree.rootNode);

        System.out.println("\nCountry with Minimum Population:");
        System.out.println(tree.findMin());
        
        System.out.println("\nCountry with Maximum Population:");
        System.out.println(tree.findMax());
    }
}