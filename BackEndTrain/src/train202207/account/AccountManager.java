package train202207.account;

import java.security.AccessControlContext;

public class AccountManager {
    private Account[] accounts;
    private int increment = 0;

    public AccountManager(){
        accounts = new Account[10];
    }

    public void innerAccount(Account account){
        accounts[increment++] = account;
    }

    public void averageAccounts(){
        float sum =0;
        for (int i = 0; i < increment; i++) {
            sum += accounts[i].getBalance();
        }
        float average = sum/increment;
        System.out.printf("평균 잔고는 %.2f 입니다.",average);

    }
    public void allAccounts(){
        for(int i =0; i<increment;i++){
            accounts[i].getBalance();
        }
        System.out.println("강화된 for each");
        for (Account ac: accounts) {
            ac.getBalance();
        }

    }

    public void transferAccount(String fromAccountNumber, String toAccountNumber,int money){
        //System.out.println(" 실행 ㅊ크");

        Account from = null;
        Account to =null;

        for (Account ac: accounts) {
            if(ac == null ) break;
            if (fromAccountNumber.equals(ac.getAccountNumber())) {
                from = ac;
            } else if (toAccountNumber.equals(ac.getAccountNumber())) {
                to = ac;
            }
        }

        if( from == null || to ==null ){
            System.out.println("두 계좌중 한개의 계좌가 존재하지 않습니다. ");
            return;
        }

        if(from.getBalance() < money ){
            System.out.println("잔고가 부족합니다. ");
        }else{
            from.withdraw(money);
            to.deposit(money);
            System.out.printf("%s의 계좌로 %d의 금액이 이체 되었습니다.",to.getAccountNumber(),money);
        }


    }


}
