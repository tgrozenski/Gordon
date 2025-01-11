import java.util.*;

public class Main {

    List <Fruit> fruitBowl = new ArrayList<Fruit>();

    List<CookieOrder> orders = new ArrayList<CookieOrder>();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /** 1. An organization raises money by selling boxes of cookies. 
     * A cookie order specifies the variety of cookie and the
     * 
     /* */

    public void removeFruit(){
        for (int index = 0; index < fruitBowl.size(); index++){
            Fruit currentFruit = fruitBowl.get(index);
            if(currentFruit.getFruitType() == "Orange")
            {
                fruitBowl.remove(index);
            }
        }
    }

    public int getTotalBoxes() {
        // Sum of the boxes 
        int sum = 0;
        for(int index = 0; index < orders.size(); index++)
        {
            CookieOrder currentOrder = orders.get(index); 
            sum += currentOrder.getNumBoxes();
        }
        
        return sum;
    }

    // 
    public void removeVariety(String variety){
    }
}