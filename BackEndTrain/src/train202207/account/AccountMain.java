package train202207.account;

public class AccountMain {

    public static void main(String[] args) {
        AccountManager mg = new AccountManager();

        float money = 0;
        String name = "길동";
        for (int i =0; i< 7 ;i++){
            mg.innerAccount(new Account(money+(i%2==0 ? i*5000 : i+100000),name+i,name+i));
        }
        System.out.println("평균 잔고 확인");
        mg.averageAccounts();
        //mg.allAccounts();
        mg.transferAccount( "길동1", "길동4" ,3000);
    }

}
