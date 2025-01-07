public class BasicRetirementAccount extends BasicSavingsAccount{
    public BasicRetirementAccount(Person x,String currency, int y, int interest){
        super(x, currency, interest, y);
    }

    @Override
    public void withdrawMoney(int amount) {
        if(this.getAccountHolder().getAge()>= 65){
            super.withdrawMoney(amount);
        }
        else{
            System.out.println("Cannot withdraw money under the age of 65");
        }

    }
}
