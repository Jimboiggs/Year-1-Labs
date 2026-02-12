import java.util.ArrayList;

public class UserGroup {
    private ArrayList<User> userList;
    public UserGroup() {
        userList = new ArrayList<User>();
    }
    public ArrayList<User> getUsers() {
        return userList;
    }
    public static void addSampleData() {
        Integer i = 0;
        for (i = 0; i < 9; i++) {
            userList.add(new User("username", "type", "name"));
        }
    }
    public User getUser(int index) {
        return userList.get(index);
    }
    public static void printUsernames() {
        int length = userList.size();
        int i;
        for (i = 0; i < length; i++) {
            System.out.println(userList.get(i).getName() + " " + userList.get(i).getUserType());
        }
    }
}
