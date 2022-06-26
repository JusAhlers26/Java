public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount accountOneBankAccount = new BankAccount();
        accountOneBankAccount.deposits(1500,"checking");
        accountOneBankAccount.deposits(150,"saving");
        accountOneBankAccount.withdrawals(1400,"checking");
        accountOneBankAccount.withdrawals(175,"saving"); // testing to show insuffecient funds 
    
        BankAccount accountTwoBankAccount = new BankAccount();
        accountTwoBankAccount.deposits(1250,"checking");
        accountTwoBankAccount.deposits(100,"saving");
        accountTwoBankAccount.withdrawals(500,"checking");
        accountTwoBankAccount.withdrawals(100,"saving");

        accountOneBankAccount.displayAccountBalance();
        accountTwoBankAccount.displayAccountBalance();

        System.out.println(BankAccount.totalAmounts);

    }
}
