class doll implements Comparable{
    int likeness;
    int goodness;

    public doll(int likeness, int goodness){
        this.likeness = likeness;
        this.goodness = goodness;
    }

    @Override
    public int compareTo(Object o) {
        doll a = (doll) o;
        if(this.likeness == a.likeness){
            if (this.goodness>a.goodness){
                return 1;
            }
            else {
                return -1;
            }
        }
        return this.likeness>a.likeness?1:-1;
    }
}
public class ee10 {
    public static void main(String [] args){
        PriorityQueue a = new PriorityQueue(3);
        doll x = new doll(5,2);
        doll y = new doll(1,3);
        doll z = new doll(5,1);
        a.insert(x);
        a.insert(y);
        a.insert(z);
        while (!a.isEmpty()){
            doll p = (doll) a.remove();
            System.out.println(p.likeness + " " + p.goodness);
        }
    }
}
