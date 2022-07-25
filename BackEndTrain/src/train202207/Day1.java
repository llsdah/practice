package train202207;
/*



 */
public class Day1 {

    public static void main(String[] args) {

        System.out.println("hello");
        float money = 1;
        String accountName = "길동";
        String accountNumber = "123";

        Account account = new Account(money, accountName,accountNumber);
        account.deposit(10000);
        money = 500;
        account.withdraw(money);

    }
}
