public class Person {
    private String Name;
    private int Age;
    private int IdNumber;
    private String Address;
    private BasicAccountFramework[] OwnedAccounts;
    public Person(String N,int A, int ID, String Add){
        this.Name = N;
        this.Age = A;
        this.IdNumber = ID;
        this.Address = Add;
    }
    public boolean doesOwn(BasicAccountFramework x){
        for(int i = 0; i < OwnedAccounts.length; i++){
            if(x.getAccountDetails() == OwnedAccounts[i].getAccountDetails()){
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public int getIdNumber() {
        return IdNumber;
    }
    public String getAddress() {
        return Address;
    }
}
