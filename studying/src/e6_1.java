import java.time.LocalDate;
import java.util.Arrays;

class YoghurtProduct{
    int ID;
    int Price;
    LocalDate ExpiryDate;

    public YoghurtProduct(int ID, int Price, LocalDate ExpiryDate){
        this.ID = ID;
        this.Price = Price;
        this.ExpiryDate = ExpiryDate;
    }
    public String toString(){
        return ID + "/ " + Price + "/ " + ExpiryDate;
    }
}
class SuperMarket{
    YoghurtProduct [] Items;
    int NumberItems;

    public SuperMarket(int Size){
        Items = new YoghurtProduct[Size];
    }
    public void AddProducts(YoghurtProduct Product){
        Items[NumberItems] = Product;
        NumberItems++;
    }
    /*public double newPrice(int ProductID){
        //
    }*/
    public String toString(){
        if(NumberItems == 0){
            return "The queue is empty!";
        }
        else {
            return Arrays.toString(Items);
        }
    }
}

class e6_1 {
    public static void main(String [] args){
        YoghurtProduct Bismark = new YoghurtProduct(1, 20, LocalDate.of(2023, 10, 27));
        YoghurtProduct Yamato = new YoghurtProduct(2, 40, LocalDate.of(2022, 3, 27));
        YoghurtProduct Iowa = new YoghurtProduct(3, 30, LocalDate.of(2023, 5, 10));
        System.out.println(Bismark);
        System.out.println(Yamato);
        System.out.println(Iowa);
        SuperMarket WhyAreYouHere = new SuperMarket(5);
        WhyAreYouHere.AddProducts(Bismark);
        WhyAreYouHere.AddProducts(Yamato);
        WhyAreYouHere.AddProducts(Iowa);
        System.out.println(WhyAreYouHere);

    }
}
