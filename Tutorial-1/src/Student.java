public class Student {
    int age;
    String name;
    int id;
    static  int SCount;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        SCount++;
    }
    public void SetID(int id){
        this.id = id;
    }
    public static void reset(int c){
        SCount = c;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}