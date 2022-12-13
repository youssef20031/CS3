public class Main {
    public static void main(String[] args) {
        BTree a = new BTree();
        a.add(9);
        a.add(3);
        a.add(7);
        a.add(4);

        BTree b = new BTree();
        b.add(9);
        b.add(3);
        b.add(8);
        b.add(4);

        a.displayTree();

        System.out.println(a.equal(b));
    }
}