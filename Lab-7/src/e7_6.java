
public class e7_6 {
    static LinkList cut(LinkList x){
        LinkList a = new LinkList();
        int Counter = 0;
        while (!x.isEmpty()){
            a.insertLast(x.removeFirst());
            Counter++;
        }
        while (!a.isEmpty()){
            x.insertLast(a.removeFirst());
        }
        for (int i = 0; i<Counter/2 + Counter%2; i++){
            a.insertLast(x.removeFirst());
        }
        for (int i = 0; i<Counter/2 + Counter%2; i++){
            a.insertFirst(x.removeLast());
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
        a.cutList();
        System.out.println(a);
    }
}