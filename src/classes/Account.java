package classes;

public abstract class Account {
    protected String accType;
    protected double balance;
    protected final int accNumber;
    protected String accHolderLastName;
    protected double monthlyServiceFee;
    protected String accHolderFirstName;

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    /* ======================= getters ======================= */
    public abstract double getBalance();

    /* ======================= setters ======================= */
    public abstract void setAccType(String accType);
    public abstract void setBalance(double deposit);

    /* ======================= Member methods ======================= */
    public abstract double checkBalance();
    public abstract void withdraw(double wAmount);
    public abstract void deposit(double dAmount);
}
