
public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insertIterative(new Node(50));
        bt.insertIterative(new Node(20));
        bt.insertIterative(new Node(10));
        bt.insertIterative(new Node(4));
        bt.insertIterative(new Node(70));
        bt.insertIterative(new Node(90));
        bt.insertIterative(new Node(5));

        //System.out.println(bt.findRecursive(bt.getRoot(), new Node(4)).getData());

        bt.traverseInOrder(bt.getRoot());
        bt.traversePreOrder(bt.getRoot());
        bt.traversePostOrder(bt.getRoot());

    }
}