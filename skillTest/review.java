import java.util.*;

public class review {
    public static void main(String args[]) {

    makeFoxList();        

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
        // length = 5, 0,1,2,3,4,
        int tooLong = 5;
        String interesting = "interesting";

        for(int index = 0; index < list.size(); index++)
        {
            // 0 
            Article a = list.get(index);

            if (a.getWordCount() > tooLong && !a.getTopic().equals(interesting))
            {
            list.remove(index);
            index--;
            }
        }
    }

    public static void makeFoxList() {
        ArrayList<Fox> foxList = new ArrayList<>();

        Fox one = new Fox(2, "orange");
        Fox two = new Fox(100, "purple");
        Fox three = new Fox(1, "red");
        Fox four = new Fox(3, "blue");
        
        foxList.add(one);
        foxList.add(two);
        foxList.add(three);
        foxList.add(four);
        printFoxList(foxList);

        // Loop through the fox list, and remove a fox if it's age is less than 3

        for(int index = 0; index < foxList.size(); index++) {
            // get the currentFox
            Fox currentFox = foxList.get(index);
            if (currentFox.getAge() < 3) 
            {
                foxList.remove(index);
            }
        }

        printFoxList(foxList);
    }

    public static void makePokemonList() {
        /* Given the following two classes, complete the method in the PokemonList class that finds
        the first Pokemon on the list that has the same type but lower hit points and replaces it with
        the parameter at the same location on the list. The method should return true if it replaces a
        Pokemon and false otherwise. */
    }

    public static void printFoxList(ArrayList<Fox> foxList) {
        for(int index = 0; index < foxList.size(); index++) {
            Fox currentFox = foxList.get(index);
            
            System.out.println(currentFox);
        }
        System.out.println("***LIST DONE***");
    }

    


}

