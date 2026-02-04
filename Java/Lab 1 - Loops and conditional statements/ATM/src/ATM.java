//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go () ;
    }
    public static void go() {
        Toolbox myToolbox = new Toolbox();
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        myToolbox.readIntegerFromCmd();

        System.out.println("What do you want to do?");
        System.out.println("1 : Withdraw");
        System.out.println("2 : Deposit");
        System.out.println("3 : Inquire");
        System.out.println("4 : Quit");
        Integer choice = myToolbox.readIntegerFromCmd();

        if (choice == 1){
            
        }
    }
}