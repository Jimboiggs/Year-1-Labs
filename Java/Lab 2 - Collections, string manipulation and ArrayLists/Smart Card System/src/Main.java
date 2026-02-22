import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        UserGroup userGroup = new UserGroup();
        userGroup.addSampleData();
        userGroup.printUsernames();

        UserGroup administrators = new UserGroup();
        Iterator<User> it = userGroup.getUserIterator();
        while (it.hasNext()) {
            User user = it.next();
            if (user.getUserType().equals("admin")) {
                administrators.getUsers().add(user);
            }
        }
        administrators.printUsernames();
        int lastIndex = administrators.getUsers().size() - 1;
        administrators.getUser(lastIndex).setUserType("user");

        userGroup.printUsernames();
        administrators.printUsernames();
        // Inconsistent because there is now a user in the admin list
        // Should probably check this before changing the type
    }
}
