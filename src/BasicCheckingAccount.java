public class BasicCheckingAccount extends BasicAccountFramework {
    public BasicCheckingAccount(Person x,String currency){
        super.setAccountHolder(x.getName());
        super.setAccountHolderAddress(x.getAddress());
        super.setAccountHolderId(x.getIdNumber());
        super.setAccountCurrency(currency);
        x.addAccount(this);
        this.setOverdraftEnabled(false);
    }
    public void setAccountNumber(int x){
        super.setAccountNumber(x);
    }
}
