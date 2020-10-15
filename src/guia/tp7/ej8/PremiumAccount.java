package guia.tp7.ej8;

public class PremiumAccount extends CheckingAccount{
    private final ShopDiscountsProvider discounts;

    public PremiumAccount(int id, int overdraft, ShopDiscountsProvider spd) {
        super(id, overdraft);
        this.discounts = spd;
    }

    public void extract(double amount, String shop){
        super.extract(new Movement(MovementType.EXTRACTION, amount * (1- discounts.getDiscount(shop)), shop));
    }
}
