package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Handler;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);  // [light, medium, medium, dark]

        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roasts.contains("dark");
        System.out.println(result ? "Contains dark!" : "Does not contain dark!");
        result = roasts.contains("expresso");
        System.out.println(result ? "Contains expresso!" : "Does not contain expresso!");

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println("The last index of 'medium' is: " + index + ".");

        // 4. Check if the array list is empty
        if(roasts.isEmpty()) {  // true -> this list is empty, false -> there's stuff in it
            // if this conditional runs, that means the list is empty
            System.out.println("The roasts list is empty!");
        } else {
            System.out.println("The roasts list is NOT empty!");
        }
        // or
        System.out.println(roasts.isEmpty() ? "List is empty" : "List is NOT empty");

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        roasts = new ArrayList<>();
        System.out.println(roasts.isEmpty() ? "02 List is empty" : "02 List is NOT empty");

        // 6. Remove the espresso roast
        roasts.add("light");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("expresso");  // [light, light, medium, medium, dark, expresso]

        System.out.println("Original roasts: " + roasts + ".");
        roasts.remove("expresso");
        System.out.println("Roasts now look like: " + roasts + ".");

        // 7. Remove the element at index 2
        roasts.remove(2);
        System.out.println("After removing index 2, roasts = " + roasts + ".");


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name  // String
        //   b. Github username  // String
        HashMap<String, String> usernames = new HashMap<>();
        // put some data in the hashmap
        usernames.put("Casey", "fridaynext");
        usernames.put("Daniel", "danielfryar");
        usernames.put("Fernando", "fmendoza");

        System.out.println(usernames);

        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();

        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Casey", "fridaynext");

        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Daniel", "danielfryar");
        usernames.putIfAbsent("Casey", "XpenguinX");
        System.out.println(usernames);

        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
          // the key "Casey" was present, so we did not add that key/value pair with XpenguinX
          // the key "Daniel" WAS absent, so we added that key/value pair to the HashMap

        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "danielFryardev"
        usernames.replace("Daniel", "danielfryardev");
        System.out.println(usernames);

        // 8. Use the .clear() method to clear the map
        usernames.clear();  // should empty the HashMap
        System.out.println("Has it cleared? " + usernames);

        // 9. Use the .isEmpty() method to verify that it was cleared
        System.out.println(usernames.isEmpty() ? "HashMap Empty!" : "HashMap not empty!");


    }
}