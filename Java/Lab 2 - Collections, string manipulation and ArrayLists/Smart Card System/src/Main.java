import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //UserGroup userGroup = new UserGroup();
        //userGroup.addSampleData();
        //userGroup.printUsernames();

        //UserGroup administrators = new UserGroup();
        //Iterator<User> it = userGroup.getUserIterator();
        //while (it.hasNext()) {
            //User user = it.next();
            //if (user.getUserType().equals("admin")) {
                //administrators.getUsers().add(user);
            //}
        //}
        //administrators.printUsernames();
        //int lastIndex = administrators.getUsers().size() - 1;
        //administrators.getUser(lastIndex).setUserType("user");

        //userGroup.printUsernames();
        //administrators.printUsernames();
        // Inconsistent because there is now a user in the admin list
        // Should probably check this before changing the type


        WordGroup group1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup group2 = new WordGroup("When you play play hard when you work dont play at all");
        //String[] array1 = group1.getWordArray();
        //String[] array2 = group2.getWordArray();

        //for (String word : array1) {
            //System.out.println(word);
        //}
        //for (String word : array2) {
            //System.out.println(word);
        //}

        //HashSet<String> combinedSet = group1.getWordSet(group2);

        //for (String word : combinedSet) {
            //System.out.println(word);
        //}

        HashMap<String, Integer> counts1 = group1.getWordCounts();
        HashMap<String, Integer> counts2 = group2.getWordCounts();

        for (String word : counts1.keySet()) {
            System.out.println(word + ": " + counts1.get(word));
        }
        System.out.println();

        for (String word : counts2.keySet()) {
            System.out.println(word + ": " + counts2.get(word));
        }
        System.out.println();

        HashSet<String> combinedSet = group1.getWordSet(group2);
        for (String word : combinedSet) {
            int total = counts1.getOrDefault(word, 0) + counts2.getOrDefault(word, 0);

            System.out.println(word + ": " + total);
        }
    }
}