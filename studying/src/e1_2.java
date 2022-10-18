class student{
    String FName;
    String LName;
    int ID;

    public student(String FName, String LName, int ID){
        this.FName = FName;
        this.LName = LName;
        this.ID = ID;
    }
}
class LinearArrayStudents{
    student [] x;
    int count;
    public  LinearArrayStudents(int size){
       this.x = new student[size];
        count = 0;
    }
    public void insertLast(student y){
        if (count<x.length){
            x[count++] = y;
        }
    }
    public void insertFirst(student y){

        for (int i = count - 1; i>0; i--){
            x[i] = x[i-1];
        }
        x[0] = y;
        count++;
    }
    public int linearSearch(int y){
        for (int i = 0; i<count;i++){
            if (x[i].ID == y){
                return i;
            }
        }
        return -1;
    }
    public void delete(int y){
        int z = linearSearch(y);
        int t = 0;
        if (z != -1){
            for (int i = z; i<count -1 ; i++){
                x[i] = x[i+1];
            }
        }
    }
}
public class e1_2 {
}
