public class BrowsingHistory {
    StackObj history;
    StackObj helper;

    public BrowsingHistory(int maxSize){
        history = new StackObj(maxSize);
        helper = new StackObj(maxSize);
    }
    public void add(String url){
        Link lnk = null;
        int freq;
        while (!history.isEmpty()) {
            lnk =(Link) history.pop();
            if (lnk.url.equals(url)){
                freq = lnk.frequency;
            }
        }
        while (!helper.isEmpty()){
            history.push(helper.pop());
        }
        history.push(new Link(url , 1));
    }
    public void remove(){
        history.pop();
    }
    public void remove(String date){
        Link lnk = null;
        while (!history.isEmpty()){
            lnk = (Link) history.pop();
            if (!date.equals(lnk.date)){
                helper.push(lnk);
            }
        }
        while (!helper.isEmpty()){
            history.push(helper.pop());
        }
    }
    public int getNumberOfLinks(){
        return history.size();
    }
    public String search(){
        int maxFreq = 0;
        String maxUrl = "";
        Link lnk = null;
        while (!history.isEmpty()){
            lnk = (Link) history.pop();
            if (lnk.frequency>=maxFreq){
                maxUrl = lnk.url;;
                maxFreq = lnk.frequency;
            }
            helper.push(lnk);
        }
        while (!helper.isEmpty()){
            history.push(helper.pop());
        }
        return maxUrl;
    }

}
