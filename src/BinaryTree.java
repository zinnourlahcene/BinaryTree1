public class BinaryTree {

    Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node findIterative(Node node) {
        Node current = root;

        if (node == null)
            return null;

        while (current.data != node.data){
            if (node.data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    public Node findRecursive(Node root, Node node){

        if (root == null){
            return null;
        }

        if (node.data == root.data)
            return node;

        if (node.data < root.data) {
            System.out.println("left ");
            findRecursive(root.leftChild, node);
        }
        if (node.data > root.data){
            System.out.println("right ");
            findRecursive(root.rightChild, node);
        }
        return null;
    }

    public void insertIterative(Node node){
        if (root == null){
            root = node;
            return;
        }
        Node current = root;

        while (current.data != node.data){
            if (node.data < current.data) {
                if (current.leftChild == null){
                    current.leftChild = node;
                } else
                    current = current.leftChild;
            }
            if (node.data > current.data){
                if (current.rightChild == null){
                    current.rightChild = node;
                } else
                    current = current.rightChild;
            }
        }

    }

    public void insertRecursive(Node node, Node current){

        if (node.data < current.data) {
            if (current.leftChild == null){
                current.leftChild = node;
            } else
                insertRecursive(node, current.leftChild);
        }
        if (node.data > current.data){
            if (current.rightChild == null){
                current.rightChild = node;
            } else
                insertRecursive(node, current.rightChild);
        }


    }

    public Node delete(Node node){

        return null;
    }

    public void traversePreOrder(Node node){
        if (node != null){
            System.out.println(node.data);
            traversePreOrder(node.leftChild);
            traversePreOrder(node.rightChild);
        }
    }

    public void traverseInOrder(Node node){
        if (node != null){
            traverseInOrder(node.leftChild);
            System.out.println(node.data);
            traverseInOrder(node.rightChild);
        }
    }
    public void traversePostOrder(Node node){
        if (node != null){
            traversePostOrder(node.leftChild);
            traversePostOrder(node.rightChild);
            System.out.println(node.data);
        }
    }

}
