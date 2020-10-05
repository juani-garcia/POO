package guia.tp4.ej9;

public class CheckingAccount extends BankAccount {
    private double overdraft;

    public CheckingAccount(int id, double overdraft) {
        super(id);
        this.overdraft = overdraft;
    }

    protected boolean canExtract(double amount) {
        if (Double.compare(getBalance() - amount, -overdraft) < 0) {
            return false;
        }
        return true;
    }

    public double getOverdraft(){
        return overdraft;
    }
}
