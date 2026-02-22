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
        String[] array1 = group1.getWordArray();
        String[] array2 = group2.getWordArray();

        for (String word : array1) {
            System.out.println(word);
        }
        for (String word : array2) {
            System.out.println(word);
        }

    }
}
