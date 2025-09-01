public class savingsAccount {
    public double balance;
    public double interestRate;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }

    public void deposit(int x){
        balance += x;
    }

    public double calcInterest(){
        double interest = balance*interestRate/12;
        return interest;
    }
}
