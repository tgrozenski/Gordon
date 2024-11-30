public class review {
    public static void main(String args[]) {
        System.out.println("hello world");

        System.out.println(firstMiddleLast("123456789", "123456789", "123456789"));
        System.out.println(mangle("physics"));

    }
    /*
     * that takes three String parameters and returns a String made up
    of the first 3 letters of the first String, the middle three letters of the second String and the
    last 3 letters of the third String.
     */
    public static String firstMiddleLast(String first, String middle, String last) {
        String str1 = first.substring(0,3);
        String str2 = middle.substring(middle.length() / 2 - 1, middle.length() / 2 + 2);
        String str3 = last.substring(last.length() - 3);

        // length - 1 is always the last index

        // 9
        // 3, 
        // 9 / 2 + 2 = 

        // c a t d o g x x x 
        // length -> 9
        // last_index -> 8
        // Math.ceil(8 / 3)

        return str1 + str2 + str3;
    }
    /*
     * Returning a string made up of the last three characters + fizz + the first three characters
     */
    public static String mangle(String string) {
        String one = string.substring(string.length() - 2);
        String two = string.substring(0,3);
        return one + "fizz" + two;

    }

    public static void makeArticleList() {
        Article object = new Article();
        ArrayList<Article> list = new ArrayList<>();

        for(int index = 0; index < list.size(); index++)
        {
        Article a = list.get(index);
        if(a.getWordCount() > tooLong &&
            !a.getTopic().equals(interesting))
        {
        list.remove(index);
        index--;
        }
        }
    }


}

