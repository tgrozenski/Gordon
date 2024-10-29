public class Main {

    public static void main(String[] args) {
        /*
         multiline 
         comment 
         */
        System.out.println(theEnd("gordon"));
    }

    public static String twoChar(String str, int index) {
        /**
        A string and index is shown. Return a string length 2 
        If the index is too big or small return the first 2 chars
         */
        if (index + 2 > str.length()) {
            index = 0;
        } 
        if (index < 0)
        {
            index = 0;
        }
            
        String result = "";
        for(int i = index; i < index + 2; i++) {
            result += str.charAt(i);
        }
        return result;

    }

    public static String right2(String str) {
        /**
        new string where last two chars are moved to the start 
        0 G
        1 O
        2 R
        3 D
        4 O 
        5 N

        length is 6 

        length - 1 = 5
         */
        // GORDON - 6 - 1
        //ONGORD

        String result = "";
        result  += str.charAt(str.length() - 2);
        result  += str.charAt(str.length() - 1);

        for(int i = 0; i <  str.length() - 2; i++) {
            result += str.charAt(i);
        }
        return result;

    }

    public static String withoutEnd(String str) {
        /**
         return string without first and last char
         */

        String result = "";

        for(int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }

        return result;

    }


    public static String theEnd(String str) {
        /**
         return string without first and last char
         */

        //Last Character
        System.out.println(str.substring(str.length() - 1, str.length()));
        //first Character
        System.out.println(str.substring(0, 1));
        //first two
        System.out.println(str.substring(0, 2));
        //
        System.out.println(str.substring(0, 4));

        return "";

    }


}