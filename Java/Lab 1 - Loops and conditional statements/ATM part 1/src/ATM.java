public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go() ;
    }
    public static void go() {
        Toolbox myToolbox = new Toolbox();
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        myToolbox.readIntegerFromCmd();
    }

}