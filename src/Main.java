public class Main {
    public static void main(String[] args){
        Person Omar = new Person("Omar Taha", 20,12345,"Nowhere");
        BasicCheckingAccount bus = new BasicCheckingAccount(Omar, "Lira");
        bus.withdrawMoney(6969);
        System.out.println(bus.getBalance());
        if(Omar.doesOwn(bus)){
            System.out.println("worked");
        }
        else{
            System.out.println("test failed");
        }
    }
}
