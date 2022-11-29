class Book implements Comparable{
    String Category;
    int ISBN;

    public Book(String Category, int ISBN){
        this.Category = Category;
        this.ISBN = ISBN;
    }

    @Override
    public int compareTo(Object o) {
        Book b = (Book) o;
        if (this.Category.compareTo(b.Category) == 0){
            if (this.ISBN > b.ISBN){
                return 1;
            }
            else {
                return -1;
            }
        }
        return this.Category.compareTo(b.Category);
    }
}
class Library{
    PriorityQueue Shelf;
    public Library(int Size){
        Shelf = new PriorityQueue(Size);
    }
    public void print(){
        while (!Shelf.isEmpty()){
            Book p =(Book) Shelf.remove();
            System.out.println(p.Category + " " + p.ISBN);
        }
    }
    public void Add(String n, int p){
        Book k = new Book(n, p);
        if (!Shelf.isFull()){
            Shelf.insert(k);
        }
        else {
            System.out.println("Full");
        }
    }

}

public class ee8 {
    public static void main(String [] args){
        Library l = new Library(5);
        l.Add("Science",4789);
        l.Add("Science",123);
        l.Add("Astronomy",9240);
        l.Add("Geography",710);
        l.Add("Geography",147);
        l.print();
    }
}
