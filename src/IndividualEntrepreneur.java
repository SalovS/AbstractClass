public class IndividualEntrepreneur extends  PrivatePerson{
    private final double MIN_COMMISSION_FOR_DEPOSITING = 0.995;
    private final double MAX_COMMISSION_FOR_DEPOSITING = 0.99;
    private final double MIN_AMOUNT = 1000;

    public void depositMoney(double money) {
        if(money < MIN_AMOUNT) {
            if (isCheckingForVariableOverflow(money,MAX_COMMISSION_FOR_DEPOSITING)) {
                return;
            }
            balance += money * MAX_COMMISSION_FOR_DEPOSITING;
            return;
        }
        if (isCheckingForVariableOverflow(money,MIN_COMMISSION_FOR_DEPOSITING)) {
            return;
        }
        balance += money * MIN_COMMISSION_FOR_DEPOSITING;
    }

    protected boolean isCheckingForVariableOverflow(double money, double commission){
        if(money * commission > Double.MAX_VALUE - balance){
            return true;
        }
        return false;
    }
}
