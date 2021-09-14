public class Main {
    public static void main(String[] args){
        PrivatePerson Uriy = new PrivatePerson();
        System.out.println(Uriy.balance());
        System.out.println(Uriy.depositMoney(900));
        System.out.println(Uriy.balance());
        System.out.println(Uriy.withdrawMoney(250));
        System.out.println(Uriy.balance());
        System.out.println("----------------------");

        LegalEntity OOO_Uriy = new LegalEntity();
        System.out.println(OOO_Uriy.balance());
        System.out.println(OOO_Uriy.depositMoney(900));
        System.out.println(OOO_Uriy.balance());
        System.out.println(OOO_Uriy.withdrawMoney(250));
        System.out.println(OOO_Uriy.balance());
        System.out.println("----------------------");

        IndividualEntrepreneur IP_Uriy = new IndividualEntrepreneur();
        System.out.println(IP_Uriy.balance());
        System.out.println(IP_Uriy.depositMoney(900));
        System.out.println(IP_Uriy.balance());
        System.out.println(IP_Uriy.depositMoney(1900));
        System.out.println(IP_Uriy.balance());
        System.out.println(IP_Uriy.withdrawMoney(250));
        System.out.println(IP_Uriy.balance());
    }
}
