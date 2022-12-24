public class Main {
    public static void main(String[] args) {
        BTree a = new BTree();
        a.add(9);
        a.add(3);
        a.add(7);
        a.add(4);
        a.add(12);
        a.add(10);
        a.add(20);
        a.add(8);
        a.add(1);
        a.add(5);
        a.add(19);
        a.add(22);
        a.add(23);
        a.add(24);
        a.add(21);
        a.add(6);
        a.add(11);

        a.displayTree();
        a.printrange(6,20);
    }
}