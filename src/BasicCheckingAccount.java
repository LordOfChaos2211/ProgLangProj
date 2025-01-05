public class BasicCheckingAccount extends BasicAccountFramework {
    public BasicCheckingAccount(Person x,String y){
        super.setAccountHolder(x.getName());
        super.setAccountHolderAddress(x.getAddress());
        super.setAccountHolderId(x.getIdNumber());
        super.setAccountCurrency(y);
    }
    public void setAccountNumber(int x){
        super.setAccountNumber(x);
    }
}
