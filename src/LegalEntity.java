public class LegalEntity extends PrivatePerson{
    private final double COMMISSION_FOR_WITHDRAWING = 1.01;

    public boolean withdrawMoney(double money) {
        if(enoughMoney(money * COMMISSION_FOR_WITHDRAWING)){
            moneyInTheAccount -= money * COMMISSION_FOR_WITHDRAWING;
            return true;
        }
        return false;
    }
}
