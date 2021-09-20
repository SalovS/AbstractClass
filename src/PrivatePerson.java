public class PrivatePerson implements Client {
    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdrawMoney(double money) {
        if(isWithdrawMoney(money)){
            balance -= money;
        }
    }

    protected boolean isWithdrawMoney(double money){
        return balance >= money;
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
}
