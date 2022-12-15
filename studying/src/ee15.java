public class ee15 {
    public static void main(String [] args){
        LinkList a = new LinkList();
        a.insertLast(1);
        a.insertLast(2);
        a.insertLast(3);
        a.insertLast(4);
        a.insertLast(4);
        a.insertLast(7);
        a.insertLast(7);
        a.insertLast(8);
        System.out.println(a.extractNonDuplicates());
    }
}
