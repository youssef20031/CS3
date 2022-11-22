import java.time.LocalDate;
class YoghurtProduct implements Comparable{
    int ID;
    double Price;
    LocalDate ExpiryDate;

    public YoghurtProduct(int ID, double Price, LocalDate ExpiryDate){
        this.ID = ID;
        this.Price = Price;
        this.ExpiryDate = ExpiryDate;
    }
    public String toString(){
        return ID + "/ " + Price + "/ " + ExpiryDate;
    }
    @Override
    public int compareTo(Object o) {
        YoghurtProduct y = (YoghurtProduct) o;
        return this.ExpiryDate.compareTo(y.ExpiryDate);
    }
}
class SuperMarket{
    PriorityQueue Items;
    int NumberItems;

    public SuperMarket(int Size){
        Items = new PriorityQueue(Size);
    }
    public void AddProducts(YoghurtProduct Product){
        if (!Items.isEmpty()){
            Items.insert(Product);
        }
        else {
            System.out.println("Full");
        }
    }
    public double newPrice(int ProductID){
        StackObj stack = new StackObj(Items.size());
        double price = -1;
        double discount = -1;
        int unique = -1;
        while (!Items.isEmpty()){
            YoghurtProduct y = (YoghurtProduct) Items.remove();
            if (stack.isEmpty() || (y.ExpiryDate.compareTo(((YoghurtProduct)stack.top()).ExpiryDate) !=0)){
                unique++;
            }
            if (ProductID == y.ID){
                discount = 50 - 5*unique;
                price = y.Price - y.Price*(discount/100);
                break;
            }
            else {
                stack.push(y);
            }
        }
        while (!stack.isEmpty()){
            Items.insert((YoghurtProduct) stack.pop());
        }
        return price;
    }

}
class e6_1{

    public static void main(String [] args){
        YoghurtProduct Bismark = new YoghurtProduct(1, 20, LocalDate.of(2023, 10, 27));
        YoghurtProduct Yamato = new YoghurtProduct(2, 40, LocalDate.of(2022, 3, 27));
        YoghurtProduct Iowa = new YoghurtProduct(3, 30, LocalDate.of(2023, 5, 10));
        System.out.println(Bismark);
        System.out.println(Yamato);
        System.out.println(Iowa);

    }
}