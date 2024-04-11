public class SavingsAccount extends Account{
    private double ir;

    public SavingsAccount(int id, double start, double interestRate){
        super(id, start);
        ir = interestRate;
    }

    public void withdraw(double w){
        if(super.currentBalance() >= w){
            decreaseBalance(w);
        }
    }

    public double monthlyInterest(){
        return super.currentBalance()*ir/12;
    }
}