public class LegalEntity extends PrivatePerson{
    private final double COMMISSION_FOR_WITHDRAWING = 1.01;

    public void withdrawMoney(double money) {
        if(isEnoughMoney(money)){
            balance -= money * COMMISSION_FOR_WITHDRAWING;
        }
    }

    protected boolean isEnoughMoney(double money){
        if(isWithdrawMoney(money * COMMISSION_FOR_WITHDRAWING)){
            return true;
        }
        return false;
    }
}
