public class ee13 {
    public static boolean isSorted(LinkList l){
        while (!l.isEmpty()){
            Link f;
            int g = 0;
            if (!l.isEmpty()) {
                f = (Link) l.removeFirst();
                g = (int) f.data;
            }
            if (!l.isEmpty()){
                Link a = (Link) l.getFirst();
                int t = (int) a.data;
                if (t > g){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkList a = new LinkList();
        Link b = new Link(7);
        Link c = new Link(6);
        Link d = new Link(5);
        Link e = new Link(7);
        Link f = new Link(3);
        Link g = new Link(2);
        Link h = new Link(1);
        a.insertLast(b);
        a.insertLast(c);
        a.insertLast(d);
        a.insertLast(e);
        a.insertLast(f);
        a.insertLast(g);
        a.insertLast(h);
        //LinkList i = cut(a);
        System.out.println(isSorted(a));

    }
}
