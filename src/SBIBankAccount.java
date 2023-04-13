import java.util.UUID;

public class SBIBankAccount implements Bank{

    //Attributes we need
    private int balance;
    private String name;
    private int roi; //let's assume it is fixed for now 5%=5
    private String password;
    private String accountNumber;


//Make constructor
    public SBIBankAccount(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    //create new Account we have to enter some default value
    public SBIBankAccount(){
        this.balance=0;
        this.name="defaultName";
        this.password="password";
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }


    //Make another constructor

    public SBIBankAccount(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance=0;
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }


    //How to access it from outside so for this we need getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance<money){ //check if the balance is sufficient or not
            return false;
        }
        this.balance-=money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int loanAmount, int timeInYears) {
        return loanAmount * roi * timeInYears/100 ;  //formula for total interest;
    }

}
