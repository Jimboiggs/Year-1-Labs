public class User {
    private String username;
    private String userType;
    private String name;

    public User(String uName, String type, String newName) {
        username = uName;
        userType = type;
        name = newName;
    }
    public String getUsername() {
        return username;
    }
    public String getUserType() {
        return userType;
    }
    public String getName() {
        return name;
    }
    public void setUserType(String type) {
        userType = type;
    }
}
