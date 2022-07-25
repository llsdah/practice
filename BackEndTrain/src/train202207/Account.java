package train202207;

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

    public void withdraw(float money){
        if(money > balance){
            System.out.println("잔고가 부족합니다.");
        }else {
            balance-=money;
            System.out.printf("%.2f 원 출금이 완료 되었습니다.\n",money);
            System.out.printf("%.2f 원 잔액이 남았습니다.\n",balance);

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
        System.out.println("잔액을 반환 합니다. ");
        return balance;
    }

}



