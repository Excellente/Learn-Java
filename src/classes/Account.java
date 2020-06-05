package classes;

public abstract class Account {
    private String accType;
    private double balance;
    private final int accNumber;
    private String accHolderLastName;
    private double monthlyServiceFee;
    private String accHolderFirstName;

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    public Account(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        this.balance = balance;
        this.accType = accType;
        this.accNumber = accNumber;
        this.monthlyServiceFee = msFee;
        this.accHolderLastName = lname;
        this.accHolderFirstName = fname;
    }

    /* ======================= getters ======================= */
    public double getBalance() {
        return this.balance;
    }

    /* ======================= setters ======================= */
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public void setBalance(double deposit) {
        this.balance = deposit;
    }

    /* ======================= Member methods ======================= */
    public abstract double checkBalance();
    public abstract void withdraw(double wAmount) throws IllegalArgumentException;
    public abstract void deposit(double dAmount) throws IllegalArgumentException;

}
