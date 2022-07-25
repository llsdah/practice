package train202207;

import train202207.account.Account;

/*



 */
public class Day1 {

    public static void main(String[] args) {

        System.out.println("hello");
        float money = 1;
        String accountName = "길동";
        String accountNumber = "123";

        Account account1 = new Account(money, accountName,accountNumber);
        Account account2 = new Account(money, accountName+"길동",accountNumber+"123");

        account1.deposit(10000);
        money = 500;
        account1.withdraw(money);

        System.out.println(account1.toString()); // 주소값 출력합니다.
        System.out.println(account1.hashCode()); // 해시코드값 출력합니다.
        System.out.println(account2);

    }
}
