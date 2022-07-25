package train202207.account;

public class Account {
    private Float balance;
    private String accountName;
    private String accountNumber;

    public Account() {
    }

    //public Account(){}

    public Account(float balance, String accountName, String accountNumber){
        this.balance = balance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void withdraw(float balance){
        if(balance > this.balance){
            System.out.println("잔고가 부족합니다.");
        }else {
            this.balance-=balance;
            System.out.printf("%.2f 원 출금이 완료 되었습니다.\n",balance);
            System.out.printf("%.2f 원 잔액이 남았습니다.\n",this.balance);

        }
    }

    public void deposit(float money){
        if(money <=0.0f){
            System.out.printf("%.2f 원 입급이 불가 입니다. \n",money);
        }else {
            balance+= money;
            System.out.printf("%.2f 원 입급이 되었습니다. \n",money);
        }
    }

    public float getBalance(){
        System.out.printf("%s의 계좌 %s, %.2f원 잔액을 반환 합니다. \n",this.accountName, this.accountNumber , this.balance);
        return this.balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}



