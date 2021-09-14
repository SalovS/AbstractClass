public class IndividualEntrepreneur extends  PrivatePerson{
    private final double MIN_COMMISSION_FOR_DEPOSITING = 0.995;
    private final double MAX_COMMISSION_FOR_DEPOSITING = 0.99;
    private final double MIN_AMOUNT = 1000;

    public boolean depositMoney(double money) {
        if(money < MIN_AMOUNT) {
            if (checkingForVariableOverflow(money,MAX_COMMISSION_FOR_DEPOSITING)) {
                return false;
            }
            moneyInTheAccount += money * MAX_COMMISSION_FOR_DEPOSITING;
            return true;
        }
        if (checkingForVariableOverflow(money,MIN_COMMISSION_FOR_DEPOSITING)) {
            return false;
        }
        moneyInTheAccount += money * MIN_COMMISSION_FOR_DEPOSITING;
        return true;
    }

    private boolean checkingForVariableOverflow(double money, double commission){
        if(money * commission > Double.MAX_VALUE - moneyInTheAccount){
            return true;
        }
        return false;
    }
}
