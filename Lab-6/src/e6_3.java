class Patient implements Comparable{
    String Name;
    int Severity;
    public Patient(String Name, int Severity){
        this.Name = Name;
        this.Severity = Severity;
    }
    @Override
    public int compareTo(Object o) {
        Patient p = (Patient) o;
        if (this.Severity > p.Severity){
            return 1;
        }
        if (this.Severity < p.Severity){
            return -1;
        }
        else {
            return this.Name.compareTo(p.Name);
        }
    }
    public String toString(){
        return Name + " " + Severity;
    }
}
class EmergencyRoom{
    PriorityQueue Room;
    int NumberItems;
    public EmergencyRoom(int Size){
        Room = new PriorityQueue(Size);
        NumberItems = 0;
    }
    public void newPatient(String n, int p){
        Patient k = new Patient(n, p);
        if (!Room.isFull()){
            Room.insert(k);
        }
        else {
            System.out.println("Full");
        }
    }
    public void print(){
        while (!Room.isEmpty()){
            Patient p =(Patient) Room.remove();
            System.out.println(p.Name);
        }
    }
    public Patient nextPatient(){
        return (Patient) Room.peekMin();
    }
}

public class e6_3 {
    public static void main(String [] args){
        EmergencyRoom Room = new EmergencyRoom(5);
        Room.newPatient("stalin", 3);
        Room.newPatient("hitler", 1);
        Room.newPatient("hamada", 4);
        Room.newPatient("belfast", 2);
        Patient x = Room.nextPatient();
        System.out.println(x);
        //Room.print();

    }


}
