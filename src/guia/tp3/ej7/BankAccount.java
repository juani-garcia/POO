package guia.tp3.ej7;

public abstract class BankAccount {
    private int id;
    private double balance;

    protected BankAccount(int id) {
        this.id = id;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void extract(double amount){
        if(canExtract(amount)){
            balance -= amount;
        }
        else {
            System.out.println("Credito insuficiente");
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
