// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("first project-bank app");

        Bank sbiBankAccount = new SBIBankAccount(1000,"Shubhangini", "Shubhangini12345");
        sbiBankAccount.addMoney(100);
        sbiBankAccount.withdrawMoney(1300);
        int balance= sbiBankAccount.checkBalance();

        Boolean withdrawStatus = sbiBankAccount.withdrawMoney(1300);
        if(Boolean.TRUE.equals(withdrawStatus)){
            System.out.println("successfully withdrawn money from bank account");
        }
        // Setting  password
        SBIBankAccount sbiBankAcc2 = new SBIBankAccount();
        sbiBankAcc2.setName("Kiran");
        sbiBankAcc2.setBalance(1000000);
        sbiBankAcc2.setPassword("pass");
    }
    }