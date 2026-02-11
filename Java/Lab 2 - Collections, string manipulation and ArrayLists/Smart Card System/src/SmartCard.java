public class SmartCard {
    private String owner = "";
    private Boolean staff = false;

    public SmartCard (String name) {
        owner = name;
    }
    public String getOwner() {
        return owner;
    }
    public boolean isStaff() {
        return staff;
    }
    public void setStaff (boolean bool) {
        staff = bool;
    }
}