//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go () ;
    }
    public void go() {
        Toolbox myToolbox = new Toolbox();
        Integer balance = 0;
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        boolean valid = false;
        while (!valid) {
            balance = myToolbox.readIntegerFromCmd();
            if (balance >= 0) {
                valid = true;
            }
        }

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 : Withdraw");
            System.out.println("2 : Deposit");
            System.out.println("3 : Inquire");
            System.out.println("4 : Quit");

            valid = false;
            while (!valid) {
                Integer choice = myToolbox.readIntegerFromCmd();
                if (choice == 1) {
                    valid = true;
                    withdraw(balance);
                } else if (choice == 2) {
                    valid = true;
                    deposit(balance);
                } else if (choice == 3) {
                    valid = true;
                    inquire(balance);
                } else if (choice == 4){
                    valid = true;
                    quit();
                }
            }
        }

    }

    public void withdraw(Integer balance){
        Toolbox myToolbox = new Toolbox();
        System.out.println("*****************************************");
        System.out.println("               Withdrawal                ");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");
        boolean valid = false;
        Integer amount = 0;
        while (!valid) {
            amount = myToolbox.readIntegerFromCmd();
            if (amount >= 0 && (balance - amount >= 0)) {
                valid = true;
            }
        }
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
        boolean valid = false;
        Integer amount = 0;
        while (!valid) {
            amount = myToolbox.readIntegerFromCmd();
            if (amount >= 0) {
                valid = true;
            }
        }
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