public class PrivatePerson implements Client {
    protected double moneyInTheAccount;

    @Override
    public double balance() {
        return moneyInTheAccount;
    }

    @Override
    public boolean withdrawMoney(double money) {
        if(enoughMoney(money)){
            moneyInTheAccount -= money;
            return true;
        }
        return false;
    }

    protected boolean enoughMoney(double money) {
        if(moneyInTheAccount >= money) {
            return true;
        }
        return false;
    }

    @Override
    public boolean depositMoney(double money) {
        if(money > Double.MAX_VALUE - moneyInTheAccount){
            return false;
        }
        moneyInTheAccount += money;
        return true;
    }
}
