package AccountMaangerTraining;

public class TestAccountManager {
    public static void main(String[] args) {
        Account[] testAccounts = new Account[3];
        int[] testDelta = {100, -343, 245};

        int amountAcc1 = 10;
        int amountAcc2 = 5;
        int amountAcc3 = 25;


        Account account1 = new Account(amountAcc1) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };

        Account account2 = new Account(amountAcc2) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };

        Account account3 = new Account(amountAcc3) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {

                amount = amount + delta;
            }
        };

        testAccounts[0] = account1;
        testAccounts[1] = account2;
        testAccounts[2] = account3;

        // call

        boolean actualResultTransfer = AccountManager.transfer(testAccounts, testDelta);

        //check
        if (!actualResultTransfer)
            throw new AssertionError("should to be result transfer is true but found false");

        if (testAccounts[0].getAmount() != testDelta[0] + amountAcc1)
            throw new AssertionError("Account should be equals " + (testDelta[0] + amountAcc1) + " but found " + testAccounts[0].getAmount());

        if (testAccounts[1].getAmount() != testDelta[1] + amountAcc2)
            throw new AssertionError("Account should be equals " + (testDelta[1] + amountAcc2) + " but found " + testAccounts[1].getAmount());

        if (testAccounts[2].getAmount() != testDelta[2] + amountAcc3)
            throw new AssertionError("Account should be equals " + (testDelta[2] + amountAcc3) + " but found " + testAccounts[2].getAmount());

        System.out.print("OK");

    }
}

class TestAccountManager2 {
    public static void main(String[] args) {
        Account[] testAccounts = new Account[3];
        int[] testDelta = {100, 343, 245};

        int accountSum0 = 10;
        int accountSum1 = 25;
        int accountSum2 = 64;

        Account noExceptionAccount0 = new Account(accountSum0) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                this.amount = amount + delta;
            }
        };


        Account noExceptionAccount1 = new Account(accountSum1) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };


        Account blockExceptionAccount = new Account(accountSum2) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                throw new BlockAccountException();
            }
        };
        testAccounts[0] = noExceptionAccount0;
        testAccounts[1] = noExceptionAccount1;
        testAccounts[2] = blockExceptionAccount;

        // call
        boolean actualResultTransfer = AccountManager.transfer(testAccounts, testDelta);

        //check
        if (actualResultTransfer)
            throw new AssertionError("should to be result transfer is false but found true");

        if (testAccounts[0].getAmount() != accountSum0)
            throw new AssertionError("Account should not be changed and should be equals " + accountSum0 + " but found " + testAccounts[0].getAmount());

        if (testAccounts[1].getAmount() != accountSum1)
            throw new AssertionError("Account should not be changed and should be equals " + accountSum1 + " but found " + testAccounts[1].getAmount());

        if (testAccounts[2].getAmount() != accountSum2)
            throw new AssertionError("Account should not be changed and should be equals " + accountSum2 + " but found " + testAccounts[2].getAmount());

        System.out.print("OK");

    }
}
