public class PrivatePerson implements Client {
    protected double balance;

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
        if(balance >= money) {
            return true;
        }
        return false;
    }

    @Override
    public void depositMoney(double money) {
        if(isDepositMoney(money)){
            balance += money;
        }
    }

    protected boolean isDepositMoney(double money){
        if(money > Double.MAX_VALUE - balance){
            return false;
        }
        return true;
    }
}
