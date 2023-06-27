public class Main {
    public static void main(String[] args) {

        BinarySearchTree bt = new BinarySearchTree(new Node(50));
/*
        bt.insertIterative(new Node(50));
        bt.insertIterative(new Node(20));
        bt.insertIterative(new Node(10));
        bt.insertIterative(new Node(4));
        bt.insertIterative(new Node(70));
        bt.insertIterative(new Node(90));
        bt.insertIterative(new Node(5));*/

        bt.insertRecursive(new Node(50), bt.getRoot());
        bt.insertRecursive(new Node(20), bt.getRoot());
        bt.insertRecursive(new Node(10), bt.getRoot());
        bt.insertRecursive(new Node(4), bt.getRoot());
        bt.insertRecursive(new Node(70), bt.getRoot());
        bt.insertRecursive(new Node(60), bt.getRoot());
        bt.insertRecursive(new Node(90), bt.getRoot());
        bt.insertRecursive(new Node(5), bt.getRoot());

        //System.out.println(bt.findRecursive(bt.getRoot(), new Node(4)).getData());

        System.out.println("------ InOrder");
        bt.traverseInOrder(bt.getRoot());
        System.out.println("------ PreOrder");
        bt.traversePreOrder(bt.getRoot());
        System.out.println("------ PostOrder");
        bt.traversePostOrder(bt.getRoot());
        System.out.println("------");

        System.out.println("The maximum is: " + bt.getMax(bt.getRoot()).getData());
        System.out.println("The minimum is: " + bt.getMin(bt.getRoot()).getData());

    }
}