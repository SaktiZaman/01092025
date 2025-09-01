public class savingsAccount {
    public double balance;
    public double interestRate;
    public String name;
    public int Term, monthsRemaining;

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

    public void setTermAndRate(int t){
        if(t>=0 && t<12)
        interestRate = 0.005;
        else if(t>=12 && t<24)
        interestRate = 0.010;
        else if(t>=24 && t<36)
        interestRate = 0.015;
        else if(t>=36 && t<48)
        interestRate = 0.020;
        else if(t>=48 && t<=60)
        interestRate = 0.025;
        else{
        System.out.println("Invalid Term");
        t = 0;
        }
        interestRate = t;
        monthsRemaining = t;
    }
    
    public void earnInterest(){
        if(monthsRemaining > 0){
            balance += balance * interestRate / 12;
            monthsRemaining --;
            System.out.println("Balance: $" +balance);
            System.out.println("Rate: " +interestRate);
            System.out.println("Months Remaining: "
            + monthsRemaining);
        }
        else{
            System.out.println("Bond Matured");
        }
    }
}
