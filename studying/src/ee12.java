public class ee12 {
    public static void replace(LinkList l, int k, int m){
        LinkList f = new LinkList();
        while (!l.isEmpty()){
            Link b = (Link) l.getFirst();
            if(b.data.equals(k) ){
                l.removeFirst();
                f.insertLast(m);
            }
            f.insertLast(l.removeFirst());
        }
        while (!f.isEmpty()){
            l.insertLast(f.removeFirst());
        }
    }
    public static void main(String[] args) {
        LinkList a = new LinkList();
        Link b = new Link(1);
        Link c = new Link(2);
        Link d = new Link(3);
        Link e = new Link(4);
        Link f = new Link(5);
        Link g = new Link(6);
        Link h = new Link(7);
        a.insertLast(b);
        a.insertLast(c);
        a.insertLast(d);
        a.insertLast(e);
        a.insertLast(f);
        a.insertLast(g);
        a.insertLast(h);
        //LinkList i = cut(a);
        replace(a, 5 , 20);
        System.out.println(a);
    }
}
