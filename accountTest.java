class checkingAccount {

}

public class accountTest {
    public static void main(String[] args) {
        savingsAccount sa0001 = new savingsAccount();
        sa0001.balance = 1000;
        sa0001.name = "Soni";
        sa0001.interestRate = 0.20;
        sa0001.balance += sa0001.calcInterest();

        savingsAccount sa0002 = new savingsAccount();
        sa0002.balance = 200;
        sa0002.name = "Sakti";
        sa0002.interestRate = 0.05;
        sa0002.deposit(50);
        sa0002.balance += sa0002.calcInterest();

        sa0001.displayCustomer();

        }


}
