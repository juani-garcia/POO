package guia.tp6.ej4;
import java.util.LinkedList;

public class Bank {
    private LinkedList<BankAccount> accounts;

    public Bank(){
        this.accounts = new LinkedList<>();
    }

    public void addAccount(BankAccount e){
        accounts.add(e);
    }

    public void removeAccount(BankAccount e){
        accounts.remove(e);
    }

    public int accountSize(){
        return accounts.size();
    }

    public double totalAmount(){
        double sum = 0;
        for(BankAccount e : accounts){
            sum += e.getBalance();
        }
        return sum;
    }
}
