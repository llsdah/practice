package train202207.account;

import train202207.account.common.AccountNumberGenerate;

public class AccountMain3 {
    public static void main(String[] args) {
        Account ac = new Account(
                5000,
                "길동 12",
                AccountNumberGenerate.generateAccountNumber());

        Account ac1 = new Account(
                5001,
                "길동 121",
                AccountNumberGenerate.generateAccountNumber());
        Account ac2 = new Account(
                5002,
                "길동 122",
                AccountNumberGenerate.generateAccountNumber());

        AccountManager am = new AccountManager();
        am.innerAccount(ac);
        am.innerAccount(ac1);
        am.innerAccount(ac2);
        am.insertAccount(123,"길동 4");

        am.allAccounts();



    }
}
