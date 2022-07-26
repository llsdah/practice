package train202207.account;

public class CompareBasic {
    public int compare(Account a1, Account a2){
        if(a1.getBalance()>a2.getBalance()) return 1;
        else if(a1.getBalance()<a2.getBalance()) return -1;
        else return 0;
    }
}
