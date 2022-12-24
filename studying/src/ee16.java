public class ee16 {
    public static void main(String [] args){
        BTree s = new BTree();
        s.add(30);
        s.add(24);
        s.add(40);
        s.add(11);
        s.add(26);
        s.add(13);
        s.add(58);
        s.add(48);
        s.displayTree();
        System.out.println(s.leftRightPath());
    }
}
