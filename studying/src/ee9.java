class FoodType implements Comparable{
    double Carbohydrates;
    double Protein;

    public FoodType(double Carbohydrates, double Protein){
        this.Carbohydrates = Carbohydrates;
        this.Protein = Protein;
    }

    @Override
    public int compareTo(Object o) {
        FoodType a = (FoodType) o;
        if(this.Carbohydrates == a.Carbohydrates){
            if (this.Protein > a.Protein){
                return -1;
            }
            else {
                return 1;
            }
        }
        return this.Carbohydrates > a.Carbohydrates?1:0;
    }
}
class FoodP{
    PriorityQueue Food;

    public FoodP(int Size){
        Food = new PriorityQueue(Size);
    }

    public void insert(double c, double p){
        FoodType a = new FoodType(c,p);
        if (!Food.isFull()){
            Food.insert(a);
        }
        else {
            System.out.println("Full");
        }
    }
    public void print(){
        while (!Food.isEmpty()){
            FoodType a = (FoodType) Food.remove();
            System.out.println(a.Carbohydrates + " " + a.Protein);
        }
    }
}

public class ee9 {
    public static void main(String [] args){
        FoodP a = new FoodP(3);
        a.insert(50,20);
        a.insert(30,60.5);
        a.insert(50,40);

        a.print();
    }
}
