// Create a BankAccount class.
class BankAccount {
//  The class should have the following attributes: (double) 
// checking balance, (double) savings balance.
    private double checkBalance;
    private double saveBalance;
// Create a class member (static) that has the number of 
// accounts created thus far.
    public static int numAccounts = 0;
// Create a class member (static) that tracks the total 
// amount of money stored in every account created.
    public static double totalAmounts = 0;
// In the constructor, be sure to increment the account count.
    public BankAccount () {
        BankAccount.numAccounts += 1;
        this.checkBalance = 0;
        this.saveBalance = 0;
    }
// Create a getter method for the user's checking account balance.
    public double getCheckBalance() {
        return this.checkBalance;
    }
// Create a getter method for the user's saving account balance.
    public double getSaveBalance() {
        return this.saveBalance;
    }
// Create a method that will allow a user to deposit money into 
// either the checking or saving, be sure to add to total amount 
// stored.
    public void deposits(double total, String account) {
        if (account == "saving") {
            this.saveBalance += total;
        }
        else {
            this.checkBalance += total;
        }
        BankAccount.totalAmounts += total;
    }
// Create a method to withdraw money from one balance. 
// Do not allow them to withdraw money if there are 
// insufficient funds.
    public void withdrawals(double total, String account) {
        if (account == "saving") {
            if(total > this.saveBalance) {
                System.out.println("Insufficient Funds");
                return ;
            }
            this.saveBalance -= total;
        }
        else {
            if(total > this.checkBalance) {
                System.out.println("Insufficient Funds");
                return ;
            }
            this.checkBalance -= total;
        }
        BankAccount.totalAmounts -= total;
        }
    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.saveBalance, this.checkBalance));
    }
}