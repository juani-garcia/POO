package guia.tp6.ej4;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(int id){
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return Double.compare(getBalance(), amount) > 0;
    }
}
