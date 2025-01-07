public abstract class BasicAccountFramework {
    String AccountHolderName;
    String AccountHolderAddress;
    int AccountHolderId;
    int AccountNumber;
    Person AccountHolder;
    double Balance = 0;
    private String AccountCurrency;
    boolean OverdraftEnabled;

    public Person getAccountHolder(){
        return AccountHolder;
    }
    public String getAccountHolderName() {
        return AccountHolderName;
    }
    public String getAccountHolderAddress() {
        return AccountHolderAddress;
    }
    public int getAccountHolderId() {
        return AccountHolderId;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public double getBalance() {
        return Balance;
    }
    public String getAccountCurrency() {
        return AccountCurrency;
    }
    public boolean getOverdraftStatus(){
        return OverdraftEnabled;
    }
    public int getAccountDetails(){
        return this.AccountNumber;
    }

    public void setAccountHolder(Person x){
        AccountHolder = x;
    }
    public void setAccountHolderName(String accountHolder) {
        AccountHolderName = accountHolder;
    }
    public void setAccountHolderAddress(String accountHolderAddress) {
        AccountHolderAddress = accountHolderAddress;
    }
    public void setAccountHolderId(int accountHolderId) {
        AccountHolderId = accountHolderId;
    }
    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public void setAccountCurrency(String accountCurrency) {
        AccountCurrency = accountCurrency;
    }
    public void setOverdraftEnabled(boolean overdraftEnabled){
        this.OverdraftEnabled = overdraftEnabled;
    }

    public void depositMoney(int amount) {
        this.Balance += amount;
    }
    public void withdrawMoney(int amount){
        if(this.Balance - amount < 0){
            if(this.getOverdraftStatus()){
                this.Balance -= amount;
            }
            else{
                System.out.println("Error not enough money");
            }
        }
        else{
            this.Balance -= amount;
        }
    }
}