//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go () ;
    }
    public void go() {
        Toolbox myToolbox = new Toolbox();
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        Integer balance = myToolbox.readIntegerFromCmd();

        System.out.println("What do you want to do?");
        System.out.println("1 : Withdraw");
        System.out.println("2 : Deposit");
        System.out.println("3 : Inquire");
        System.out.println("4 : Quit");
        Integer choice = myToolbox.readIntegerFromCmd();

        if (choice == 1) {
            withdraw(balance);
        } else if (choice == 2) {
            deposit(balance);
        } else if (choice == 3) {
            inquire(balance);
        } else {
            quit();
        }
    }

    public void withdraw(Integer balance){
        Toolbox myToolbox = new Toolbox();
        System.out.println("*****************************************");
        System.out.println("               Withdrawal                ");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");
        Integer amount = myToolbox.readIntegerFromCmd();
        balance -= amount;
        System.out.println("*****************************************");
        System.out.println("         Your new balance is " + balance);
        System.out.println("*****************************************");
    }
    public void deposit(Integer balance){
        Toolbox myToolbox = new Toolbox();
        System.out.println("*****************************************");
        System.out.println("                Deposit                 ");
        System.out.println("*****************************************");
        System.out.println("How much would you like to deposit?");
        Integer amount = myToolbox.readIntegerFromCmd();
        balance += amount;
        System.out.println("*****************************************");
        System.out.println("         Your new balance is " + balance);
        System.out.println("*****************************************");
    }
    public void inquire(Integer balance){
        System.out.println("*****************************************");
        System.out.println("         Your balance is " + balance);
        System.out.println("*****************************************");
    }
    public void quit(){
        System.out.println("*****************************************");
        System.out.println("                Goodbye!                 ");
        System.out.println("*****************************************");
        System.exit(0);
    }
}