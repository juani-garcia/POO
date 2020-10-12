package guia.tp7.ej8;

public class PremiumAccount extends CheckingAccount{
    private ShopDiscountsProvider discounts;

    public PremiumAccount(int id, int overdraft, ShopDiscountsProvider spd) {
        super(id, overdraft);
        this.discounts = spd;
    }

    public void extract(double amount, String shop){
        if(canExtract(amount)){
            balance -= amount;
            addMovement(new Movement(MovementType.EXTRACTION, amount, shop));
        }
        else
            System.out.println("Credito insuficiente");
    }
}
