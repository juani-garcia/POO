package guia.tp4.ej9;

public abstract class BankAccount {
    private int id;
    private double balance;

    protected BankAccount(int id) {
        this.id = id;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void extract(double amount) throws RuntimeException{
        if(canExtract(amount)){
            balance -= amount;
        }
        else {
            throw new RuntimeException("No cuenta con los fondos");
        }
    }

    public double getBalance(){
        return balance;
    }

    protected abstract boolean canExtract(double amount);


    @Override
    public String toString(){
        return "Cuenta " + id + " con saldo $" + balance;
    }
}
