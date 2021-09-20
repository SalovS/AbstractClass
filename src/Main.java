public class Main {
    public static void main(String[] args){
        PrivatePerson Uriy = new PrivatePerson();
        System.out.println(Uriy.getBalance());
        Uriy.depositMoney(900);
        System.out.println(Uriy.getBalance());
        Uriy.withdrawMoney(250);
        System.out.println(Uriy.getBalance());
        System.out.println("----------------------");

        LegalEntity OOO_Uriy = new LegalEntity();
        System.out.println(OOO_Uriy.getBalance());
        OOO_Uriy.depositMoney(900);
        System.out.println(OOO_Uriy.getBalance());
        OOO_Uriy.withdrawMoney(250);
        System.out.println(OOO_Uriy.getBalance());
        System.out.println("----------------------");

        IndividualEntrepreneur IP_Uriy = new IndividualEntrepreneur();
        System.out.println(IP_Uriy.getBalance());
        IP_Uriy.depositMoney(900);
        System.out.println(IP_Uriy.getBalance());
        IP_Uriy.depositMoney(1900);
        System.out.println(IP_Uriy.getBalance());
        IP_Uriy.withdrawMoney(250);
        System.out.println(IP_Uriy.getBalance());
    }
}
