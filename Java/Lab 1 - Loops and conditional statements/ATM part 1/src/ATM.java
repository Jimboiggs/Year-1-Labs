public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go() ;
    }
    public void go() {
        Toolbox myToolbox = new Toolbox();
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        Integer balance = myToolbox.readIntegerFromCmd();
        System.out.println(balance);
    }

}