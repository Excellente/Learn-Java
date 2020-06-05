package classes;

public class ChequeAccount extends Account {

    public ChequeAccount(int accNumber){
        super(accNumber);
    }
    public ChequeAccount(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        super(accNumber, msFee, balance, fname, lname, accType);
    }

    /* ======================= setters ======================= */
    @Override
    public void setBalance(double deposit) {
        super.setBalance(deposit);
    }

    @Override
    public void setAccType(String accType) {
        super.setAccType(accType);
    }

    /* ======================= Member methods ======================= */
    public void withdraw(double wAmount) throws IllegalArgumentException {
        double currentBalance = super.getBalance();

        if (wAmount > currentBalance) throw new IllegalArgumentException("Insufficient funds.");
        super.setBalance(currentBalance -= wAmount);
    }

    public void deposit(double dAmount) throws IllegalArgumentException {
        if (!(dAmount > 0)) throw new IllegalArgumentException("Invalid value for deposit");
        double current = this.getBalance();
        this.setBalance( current + dAmount);
    }

    public double checkBalance() {
        return super.getBalance();
    }
}
