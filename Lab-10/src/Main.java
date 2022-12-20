public class Main {
    public static void main(String[] args) {
        BTree a = new BTree();
        a.add(9);
        a.add(3);
        a.add(7);
        a.add(4);
        a.add(10);
        a.add(20);
        a.add(8);
        a.add(1);

        a.displayTree();
        a.breadthTraversal();
    }
}