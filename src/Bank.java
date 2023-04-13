public interface Bank {
    int checkBalance();
    boolean addMoney(int money);
    boolean withdrawMoney(int money);
    int getROI(); //Rate of Interest
    int totalInterest(int loanAmount, int timeInYears);
}
