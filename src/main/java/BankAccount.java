//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * the different types of bank accounts as their own type.
     */
    public enum BankAccountType {
        /**
         * checking type of bank account.
         */
        CHECKINGS,
        /**
         * savings type of bank account.
         */
        SAVINGS,
        /**
         * student type of bank account.
         */
        STUDENT,
        /**
         * work place type of bank account.
         */
        WORKPLACE
    }
    /**
     * holds the integer value of the account number.
     */
    private int accountNumber;
    /**
     * holds the type of account the bank account is.
     */
    private BankAccountType accountType;
    /**
     * holds the amount of money in the bank account as a double.
     */
    private double accountBalance;
    /**
     * stores the name of the owner.
     */
    private String ownerName;
    /**
     * stores the value of interest as a double.
     */
    private double interestRate;
    /**
     * stores the value of the interest.
     */
    private double interestEarned;

    /**
     * constructor which takes two parameters.
     * @param name string value of owner
     * @param accountCategory bank account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /**
     *gets account number.
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * sets account number.
     * @param newAccountNumber , the new account number.
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    /**
     * gets the bank account type.
     * @return the type of the bank account
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * sets the account type to a new account type.
     * @param newAccountType the new bank account type
     */
    public void setAccountType(final BankAccountType newAccountType) {
        this.accountType = newAccountType;
    }

    /**
     * gets balance amount in a bank account.
     * @return double value of the amount
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * sets account balance to a specific double value.
     * @param newAccountBalance the amount to set the account balance to
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    /**
     * gets name of the owner of a bank account.
     * @return a string of the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * sets the owner name of a bank account.
     * @param newOwnerRate the name to set
     */
    public void setOwnerName(final String newOwnerRate) {
        this.ownerName = newOwnerRate;
    }

    /**
     *gets the interest rate.
     * @return double value of interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * sets the interest rate to a specific value.
     * @param newInterestRate double value of interestRate
     */
    public void setInterestRate(final double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    /**
     * gets interest earned from bank account.
     * @return double value of amount earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * sets interestEarned to a specific amount.
     * @param newInterestEarned double value of interestEarned to be set
     */
    public void setInterestEarned(final double newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
