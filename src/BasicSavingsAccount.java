public class BasicSavingsAccount extends BasicAccountFramework{
    private double InterestRate;
    public BasicSavingsAccount(Person x, String currency, int interest, int y){
        super.setAccountHolder(x);
        super.setAccountHolderName(x.getName());
        super.setAccountHolderAddress(x.getAddress());
        super.setAccountHolderId(x.getIdNumber());
        super.setAccountCurrency(currency);
        x.addAccount(this);
        this.setOverdraftEnabled(false);
        InterestRate = interest;
        super.setAccountNumber(y);
    }
    public double getInterestRate(){
        return InterestRate;
    }
    public double calculateInterestOverTime(int years){
        double temp = this.getBalance();
        double DecimalInterest = this.getInterestRate()/100;
        for(int i=0; i<years; i++){
            temp*=(1+DecimalInterest);
        }
        return temp;
    }
}
