public class e7_8 {
    static LinkList alternatingSplit(LinkList x){
        LinkList a = new LinkList();
        LinkList b = new LinkList();
        while (!a.isEmpty()){
            x.insertLast(a.removeFirst());
        }
        int i = 0;
        while (!x.isEmpty()){
            if(i%2 == 0) {
                a.insertLast(x.removeFirst());
            }
            else {
                b.insertLast(x.removeFirst());
            }
            i++;
        }
        while (!b.isEmpty()){
            a.insertLast(b.removeFirst());
        }
        return a;
    }
    public static void main(String[] args) {
        LinkList a = new LinkList();
        Link b = new Link(1);
        Link c = new Link(2);
        Link d = new Link(3);
        Link e = new Link(4);
        Link f = new Link(5);
        //Link g = new Link(6);
        //Link h = new Link(7);
        a.insertLast(b);
        a.insertLast(c);
        a.insertLast(d);
        a.insertLast(e);
        a.insertLast(f);
        //a.insertLast(g);
        //a.insertLast(h);
        //LinkList i = cut(a);
        System.out.println(alternatingSplit(a));
    }
}
