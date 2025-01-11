public class CookieOrder {
    String variety;
    int numBoxes;

    public CookieOrder(String variety, int numBoxes){
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    public int getNumBoxes(){
        return numBoxes;
    }
    public String getVariety(){
        return variety;
    }
}
