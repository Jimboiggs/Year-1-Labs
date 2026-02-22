import java.util.ArrayList;
import java.util.Iterator;

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

    public void removeFirstUser() {
        userList.remove(0);
    }
    public void removeLastUser() {
        userList.remove(userList.size() - 1);
    }
    public void removeUser(String username) {
        Iterator<User> it = userList.iterator();
        while (it.hasNext()) {
            User u = it.next();

            if (u.getUsername().equals(username)) {
                it.remove();
            }
        }
    }

    public Iterator<User> getUserIterator() {
        return userList.iterator();
    }
}
