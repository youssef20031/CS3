class Stack{
    private int [] _arr;
    private int    _nTop;

    public Stack(int nSize){
        _arr = new int[nSize];
        _nTop = -1;
    }
    public void push ( int nValue){
        if(isFull()){
            return;
        }
        _nTop++;
        _arr[_nTop] = nValue;
    }
    public int pop(){
        if(isEmpty()){
            return -9999;
            //throw new Exception("Stack Value");
        }
        int nTemp = _arr[_nTop];
        _nTop--;
        return nTemp;
    }
    public int peek(){
        if(isEmpty()){
            return -9999;
        }
        return _arr[_nTop];
    }
    public boolean isFull(){
        return _nTop == _arr.length-1;
    }
    public boolean isEmpty(){
        return _nTop == -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Stack s;
        s = new Stack(100);
        for (int nIndex = 0; nIndex<99; nIndex++){
            s.push(nIndex);
        }
        System.out.println(s.peek());
    }
}