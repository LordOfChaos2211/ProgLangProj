public class BasicCheckingAccount extends BasicAccountFramework {
    public BasicCheckingAccount(Person x,String currency, int y){
        super.setAccountHolder(x);
        super.setAccountHolderName(x.getName());
        super.setAccountHolderAddress(x.getAddress());
        super.setAccountHolderId(x.getIdNumber());
        super.setAccountCurrency(currency);
        x.addAccount(this);
        this.setOverdraftEnabled(true);
        super.setAccountNumber(y);
    }
}
