public class ee16 {
    public static void main(String [] args){
        BTree s = new BTree();
        s.add(30);
        s.add(20);
        s.add(40);
        s.add(10);
        s.add(25);
        s.add(39);
        s.add(58);
        s.displayTree();
        System.out.println(s.weirdSummation());
    }
}
