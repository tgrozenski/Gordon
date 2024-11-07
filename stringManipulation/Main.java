public class Main {

    public static void main(String[] args) {
        /*
         multiline 
         comment 
         */
        // System.out.println(firstLast("giraffe", "elephant"));
        System.out.println(firstMiddleLast("Tyler", "Gordon"));
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

    public static String firstLast(String first, String second)
    {
        /*
         * Complete a method that takes two Strings as parameters. It should return a String that 
         * consists of the first half of the first string followed by the second half of the second string but the first letter 
         * of the first string should be omitted. So a call to firstLast("giraffe", "elephant") should return "ir hant". 
         * You may assume that all Strings are long enough such that the method will not throw Exceptions.
         */
        
        // 0 1 2 3 4 5
        // length is 6 
        // last index is length - 1

        // Starting index of every string is 0
        // What is the last index of every string (whateverString).length() - 1
        // We also know how many letters (whateverString).length()

        // store in variable, use length method

        String firstHalf = first.substring(1, first.length() / 2);

        // String secondHalfOfFirst = first.substring(first.length() / 2);


        String secondHalf = second.substring(second.length() / 2);

        
        return firstHalf + secondHalf;
    }

    public static String firstMiddleLast(String firstAndLast, String middle) {
        // return the first letter of first plus
        // a substring of the second without the first and last letter
        // plus the last letter of the first

        // firstMiddleLast("Tyler", "Gordon")
        //T + ordo + r

        // G O R D O N

        // length 6 
        // 5

        String first = firstAndLast.substring(0,1);

        String between = middle.substring(1, middle.length() - 1);

        String last = firstAndLast.substring(firstAndLast.length() - 1, firstAndLast.length());

        return first + between + last;

    }


}