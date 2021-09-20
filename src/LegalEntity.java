public class LegalEntity implements Client{
    private final double COMMISSION_FOR_WITHDRAWING = 1.01;
    private double balance = 0;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdrawMoney(double money) {
        if(isEnoughMoney(money)){
            balance -= money * COMMISSION_FOR_WITHDRAWING;
        }
    }

    @Override
    public void depositMoney(double money) {
        if(isDepositMoney(money)){
            balance += money;
        }
    }

    protected boolean isDepositMoney(double money){
        return (money < Double.MAX_VALUE - balance);
    }

    protected boolean isEnoughMoney(double money){
        return isWithdrawMoney(money * COMMISSION_FOR_WITHDRAWING);
    }

    protected boolean isWithdrawMoney(double money){
        return balance >= money;
    }
}
