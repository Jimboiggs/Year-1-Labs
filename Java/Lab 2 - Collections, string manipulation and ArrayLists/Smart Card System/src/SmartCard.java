//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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










    public static void main(String[] args) {

    }

}