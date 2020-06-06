package banking;

public class ChequeAccount extends Account {

    /**
     * @param accNumber account number assigned to an account
     */
    public ChequeAccount(int accNumber) {
        super(accNumber);
    }

    public ChequeAccount(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        super(accNumber);
        this.balance = balance;
        this.accType = accType;
        this.monthlyServiceFee = msFee;
        this.accHolderLastName = lname;
        this.accHolderFirstName = fname;
    }

    /* ======================= getters ======================= */
    @Override
    public double getBalance() {
        return this.balance;
    }

    /* ======================= setters ======================= */
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void setAccType(String accType) {
        this.accType = accType;
    }

    /* ======================= Member methods ======================= */
    @Override
    public void withdraw(double wAmount) {
        if (wAmount > this.balance) throw new IllegalArgumentException("Insufficient funds.");
        else if (wAmount < 0) throw new IllegalArgumentException("Invalid value for withdrawal.");
        this.balance -= wAmount;
    }

    @Override
    public void deposit(double dAmount) {
        if (!(dAmount > 0)) throw new IllegalArgumentException("Invalid value for deposit");
        double current = this.getBalance();
        this.setBalance(current + dAmount);
    }

    @Override
    public double checkBalance() {
        return this.getBalance();
    }
}
