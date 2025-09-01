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
        sa0002.displayCustomer();
    }
}

class bond{
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;
    public void setTermAndRate(int t){
        if(t>=0 && t<12)
        rate = 0.005;
        else if(t>=12 && t<24)
        rate = 0.010;
        else if(t>=24 && t<36)
        rate = 0.015;
        else if(t>=36 && t<48)
        rate = 0.020;
        else if(t>=48 && t<=60)
        rate = 0.025;
        else{
        System.out.println("Invalid Term");
        t = 0;
        }
        rate = t;
        monthsRemaining = t;
    }
    
    public void earnInterest(){
        if(monthsRemaining > 0){
            balance += balance * rate / 12;
            monthsRemaining --;
            System.out.println("Balance: $" +balance);
            System.out.println("Rate: " + rate);
            System.out.println("Months Remaining: "
            + monthsRemaining);
        }
        else{
            System.out.println("Bond Matured");
        }
    }
}