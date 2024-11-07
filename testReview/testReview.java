import java.util.*;
import java.math.*;

public class testReview {

    public static void main(String[] args) {
        System.out.println("Hello world");  

        /*
         * Given an Arraylist that contains 6 objects of type string what does this line do
         * 
         * list.set(4,"apple")
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); // 0 
        list.add("orange"); // 1 
        list.add("tomato"); // 2
        list.add("cuccumber"); // 3
        list.add("grape"); // 4
        list.add("cherry"); // 5

        // n - 1
        // System.out.println(list.get(4));
        // list.set(4, "apple");
        // System.out.println(list.get(4));

        // index is always ordering - 1, 1 greater than the index
        // the get method takes the index

        // String string = "Vacaville";
        // System.out.println(string.substring(4));

        // it takes in two index
        // which inclusive is inclusive - the first 
        // which is exclusive - the second


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); // 0 
        list2.add("B"); // 1 
        list2.add("C"); // 2
        list2.add("D"); // 3

        // System.out.println(list2);
        // list2.add(2,"E");
        // System.out.println(list2);

        // System.out.println(list2);
        // list2.remove(3);
        // System.out.println(list2);

        // System.out.println(list2);
        // list2.add("F");
        // System.out.println(list2);

        // System.out.println(list2);
        // list2.set(4, "G");
        // System.out.println(list2);

        // int index = 4;
        // int counter = 0;
        // while (index <= 17) {
        //     System.out.println(index);
        //     counter++;
        //     index++;
        // }
        // System.out.println(counter);

        // int i = 0;
        // while (i < 15) {
        //     double num = Math.random();
        //     System.out.println( num + " " +  (int) num );
        //     System.out.println((int)(num * 5) + 2);
        //     i++;
        // }
        //less than 1, greater than zero
        // System.out.println("Bulldogs".substring(4));
        // length is not zero based

        // String str = "Vacaville";
        // int index = str.indexOf("a");
        // str = str.substring(0,1) + str.substring(index + 3);
        // System.out.println(str);
        // we know index is 1
        // indexOf returns the first index where substring in present

        TeaPot myPot = new TeaPot(false);

        boolean ready = myPot.teaReady();


        String color = myPot.getTeapotColor();
        System.out.println(color);
    }
}