class University implements Comparable{
    String Name;
    int Rank;
    public University(String Name, int Rank){
        this.Name = Name;
        this.Rank = Rank;
    }
    @Override
    public int compareTo(Object o) {
        University u = (University) o;
        //return u.Rank > this.Rank ? 1:u.Rank == 0?:0;
        if (this.Rank > u.Rank){
            return 1;
        }
        if (this.Rank < u.Rank){
            return -1;
        }
        else {
            return this.Name.compareTo(u.Name);
        }
    }
}
class CompareUni{
    PriorityQueue Uni;
    int NumberItems;
    public CompareUni(int Size){
        Uni = new PriorityQueue(Size);
        NumberItems = 0;
    }
    public void AddUni(University U){
        if (!Uni.isFull()){
            Uni.insert(U);
        }
        else {
            System.out.println("Full");
        }
    }
    public void print(){
        while (!Uni.isEmpty()){
            University u =(University) Uni.remove();
            System.out.println(u.Name);
        }
    }
}


public class e6_2 {
    public static void main(String [] args){
        University a = new University("potato", 1);
        University b = new University("stalin", 2);
        University c = new University("hitler", 3);
        University d = new University("hamada", 3);

        CompareUni university = new CompareUni(5);
        university.AddUni(a);
        university.AddUni(b);
        university.AddUni(c);
        university.AddUni(d);
        university.print();
    }

}
