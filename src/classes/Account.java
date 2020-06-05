package classes;

public class Account {
    private int accNumber;
    private double balance;
    private String accType;
    private String accHolderLastName;
    private double monthlyServiceFee;
    private String accHolderFirstName;

    public Account() {}

    public Account(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        this.balance = balance;
        this.accType = accType;
        this.accNumber = accNumber;
        this.monthlyServiceFee = msFee;
        this.accHolderLastName = lname;
        this.accHolderFirstName = fname;
    }

    // setters
    public void setBalance(double deposit) {
        this.balance = deposit;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    // getters
    public double getBalance() {
        return this.balance;
    }

    // member methods
    public void withdraw(double wAmount) throws IllegalArgumentException {
        if (wAmount > this.balance) throw new IllegalArgumentException("Insufficient funds.");
        this.balance -= wAmount;
    }

    public void deposit(double dAmount) throws IllegalArgumentException {
        if (!(dAmount > 0)) throw new IllegalArgumentException("Invalid value for deposit");
        double current = this.getBalance();
        this.setBalance( current + dAmount);
    }

    public double checkBalance() {
        return this.balance;
    }
}
