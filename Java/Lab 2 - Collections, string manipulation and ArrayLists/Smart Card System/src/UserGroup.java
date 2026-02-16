import java.util.ArrayList;

public class UserGroup {
    private ArrayList<User> userList;

    public UserGroup() {
        userList = new ArrayList<User>();
    }
    public ArrayList<User> getUsers() {
        return userList;
    }

    public void addSampleData() {
        Integer i = 0;
        for (i = 0; i < 10; i++) {
            userList.add(new User("user" + i, "user", "Name" + i));
        }
    }
    public User getUser(int index) {
        return userList.get(index);
    }

    public void printUsernames() {
        for (User u : userList) {
            System.out.println(u.getUsername() + " " + u.getUserType());
        }
    }
}
