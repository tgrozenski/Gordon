import java.util.*;
import java.math.*;
import java.rmi.StubNotFoundException;

public class testReview {

    public static void main(String[] args) {
        System.out.println("Hello world");  

        /*
         * Given an Arraylist that contains 6 objects of type string what does this line do
         * 
         * list.set(4,"apple")
         */
        // ArrayList<String> list = new ArrayList<>();
        // list.add("apple"); // 0 
        // list.add("orange"); // 1 
        // list.add("tomato"); // 2
        // list.add("cuccumber"); // 3
        // list.add("grape"); // 4
        // list.add("cherry"); // 5

        // // n - 1
        // System.out.println(list.get(4));
        // list.set(4, "apple");
        // System.out.println(list.get(4));

        // // index is always ordering - 1, 1 greater than the index
        // // the get method takes the index

        // String string = "Vacaville";
        // System.out.println(string.substring(4));

        // // it takes in two index
        // // which parameter inclusive is inclusive - the first (beginIndex)
        // // which is exclusive - the second (endIndex)


        // ArrayList<String> list2 = new ArrayList<>();
        // list2.add("A"); // 0 
        // list2.add("B"); // 1 
        // list2.add("C"); // 2
        // list2.add("D"); // 3

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
        // // less than 1, greater than zero
        // System.out.println("Bulldogs".substring(4));
        // // length is not zero based

        // String str = "Vacaville";
        // int index2 = str.indexOf("a");
        // str = str.substring(0,1) + str.substring(index2 + 3);
        // System.out.println(str);
        // we know index is 1
        // indexOf returns the first index where substring in present

        System.out.println(firstMiddleLast("Tyler", "Tyler", "Tyler"));
        
        System.out.println(truncate("gordon"));
    }
    public static String firstMiddleLast(String first3, String str2, String str3) {
        /*
         * Complete the method below that takes three String parameters and returns a String made up
        of the first 3 letters of the first String, the middle three letters of the second String and the
        last 3 letters of the third String.
         */

        String fml = "";
        fml = fml + first3.substring(0, 3);

        // get middle three letters

        // length is (str2.length() / 2) - 1  

        // 0 1 2 3 4 5 6 7 8
        // int middle;
        // getting the end of the string

        fml += str2.substring((str2.length() / 2) - 1, ((str2.length() / 2) + 2));

        fml += str3.substring(str3.length() - 3, str3.length());

        System.out.println(fml);
        return fml;
    }
    public static String truncate(String str) 
    {
    /* Complete the method below that takes one String parameter and returns a String made up of
    the first 4 letters of the String followed by three dots ("...") and the last two letters of the
    String.
    */
        //0 1 2 3 4
        String string = str.substring(0,4);
        string += "...";
        string += str.substring(str.length() - 2);
        return string;
    }


}