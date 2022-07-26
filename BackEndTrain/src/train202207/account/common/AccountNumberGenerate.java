package train202207.account.common;

import java.util.Random;

public class AccountNumberGenerate {
    private static Random random = new java.util.Random(
            System.currentTimeMillis()
    );

    public static String generateAccountNumber(){
        return String.valueOf(Math.abs(random.nextInt()));
    }

}
