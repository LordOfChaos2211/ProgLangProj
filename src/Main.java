public class Main {
    public static void main(String[] args){
       Person Omar = new Person("Omar Taha", 20,12345,"Nowhere");
        BasicSavingsAccount bus = new BasicSavingsAccount(Omar, "Lira",5);
        bus.depositMoney(6969);
        System.out.println(bus.getBalance());
        System.out.println(bus.calculateInterestOverTime(5));
    }
}
