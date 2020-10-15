package guia.tp7.ej8;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private final int id;
    private double balance;
    private final List<Movement> movements;

    protected BankAccount(int id) {
        this.id = id;
        this.movements = new ArrayList<>();
    }

    public void deposit(double amount){
        balance += amount;
        addMovement(new Movement(MovementType.DEPOSIT, amount));
    }

    public void extract(double amount){
        extract(new Movement(MovementType.EXTRACTION, amount));
    }

    public void extract(Movement mvt){
        double amount = mvt.getAmount();
        if(canExtract(amount)){
            balance -= amount;
            addMovement(mvt);
        }
        else
            System.out.println("Credito insuficiente");
    }

    public double getBalance(){
        return balance;
    }

    protected abstract boolean canExtract(double amount);

    protected void addMovement(Movement mov){
        movements.add(mov);
    }

    public void showMovements(){
        System.out.println("Movements for account " + id);
        movements.forEach(System.out::println);
    }

    @Override
    public String toString(){
        return "Cuenta " + id + " con saldo $" + balance;
    }
}
